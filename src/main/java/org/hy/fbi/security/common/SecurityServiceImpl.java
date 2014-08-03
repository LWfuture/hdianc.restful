package org.hy.fbi.security.common;

import java.util.ArrayList;
import java.util.List;

import org.hy.fbi.security.dao.IUserAccountDao;
import org.hy.fbi.security.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements UserDetailsService {

	@Autowired
	private IUserAccountDao userAccountDao;

	@Override
	public UserDetails loadUserByUsername(String paramString)
			throws UsernameNotFoundException {
		UserAccount user = userAccountDao.findUserAccounts(paramString, null)
				.get(0);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		String[] authoritiesStrs = null;
		authoritiesStrs = user.getUserRole().getFuncPrivilege().split(","); // 获取用户权限列表

		for (String authoritiesStr : authoritiesStrs)
			authorities.add(new SimpleGrantedAuthority(authoritiesStr));

		return new User(user.getUsername(), user.getPassword(), true, true,
				true, true, authorities);
	}

}
