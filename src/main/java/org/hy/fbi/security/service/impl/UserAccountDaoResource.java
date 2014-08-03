package org.hy.fbi.security.service.impl;


import org.hy.fbi.security.dao.IUserAccountDao;
import org.hy.fbi.security.entity.UserAccount;
import org.hy.fbi.security.entity.UserRole;
import org.hy.fbi.security.service.IUserAccountService;
import org.hy.foundation.common.dao.jpa.ParameterizedCrudableDaoBase;
import org.hy.foundation.common.ws.restful.CrudableRestfulBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;



@Repository
public class UserAccountDaoResource extends CrudableRestfulBase<UserAccount>
		implements IUserAccountService {

	@Autowired
	private IUserAccountDao userAccountDao;
	
	private ParameterizedCrudableDaoBase<UserRole> userRoleDao;

	@Override
	public UserAccount getCurrentLoginedUser() {
		String username = null;
		if (SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal() instanceof User)
			username = ((User) SecurityContextHolder.getContext()
					.getAuthentication().getPrincipal()).getUsername();
		else
			username = (String) SecurityContextHolder.getContext()
					.getAuthentication().getPrincipal();

		// 返回的json包括当前用户
		UserAccount userAccount = userAccountDao.findUserAccounts(username,
				null).get(0);
		return userAccount;
	}

	@Override
	public UserAccount updateAuthorizeForUser(UserAccount userAccount) {
		UserAccount userAccountTemp = super.getEntityById(userAccount.getId());
		UserRole userRole = userRoleDao.getEntityByPrimarykey(UserRole.class,
				userAccount.getUserRole().getId());
		userAccountTemp.setUserRole(userRole);
		super.updateEntity(userAccountTemp);
		return userAccountTemp;
	}

}
