package org.hy.fbi.security.common;

import javax.annotation.Resource;

import org.hy.fbi.security.dao.IUserAccountDao;
import org.hy.fbi.security.entity.UserAccount;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;


@Transactional(noRollbackFor = AuthenticationException.class)
public class MyDaoAuthenticationProvider extends DaoAuthenticationProvider {

	@Resource
	private IUserAccountDao userAccountDao;

	@Override
	public Authentication authenticate(Authentication paramAuthentication)
			throws AuthenticationException {
		Authentication result = null;

		int nowdate = (int) (new java.util.Date().getTime() / 1000);
		String j_username = paramAuthentication.getName();
		try { // 用户登录成功
			result = super.authenticate(paramAuthentication);
			SecurityContextHolder.getContext().setAuthentication(result);
			// 更新用户档的登录时间与次数
			UserAccount user = userAccountDao
					.findUserAccounts(j_username, null).get(0);
			user.setLastLoginTime(nowdate);
			user.setLoginTimes((user.getLoginTimes() == null ? 0 : user
					.getLoginTimes()) + 1);
			user.setErrLoginTimes(0); // 错误次数清零
			userAccountDao.updateUserAccount(user);

			// System.out.println(" 正确日志记录");
		} catch (RuntimeException e) {
			try {
				if (e instanceof AuthenticationException) { // 用户名正确,密码错误
					// 更新用户档的登录失败时间与次数
					UserAccount user = userAccountDao.findUserAccounts(
							j_username, null).get(0);
					user.setLastErrLoginTime(nowdate);
					user.setErrLoginTimes((user.getErrLoginTimes() == null ? 0
							: user.getErrLoginTimes()) + 1);
					userAccountDao.updateUserAccount(user);

					// System.out.println(" 错误日志记录");
				}
			} catch (Exception e1) { // 用户名错误
				// 插入到日志档,用户ID为空
			}

			// throw new
			// RestRuntimeException(e.getMessage(),e.getMessage(),Status.INTERNAL_SERVER_ERROR,997);
			throw e;
		}
		
		return result;
	}
}
