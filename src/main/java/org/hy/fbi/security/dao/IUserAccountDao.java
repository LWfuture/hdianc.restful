package org.hy.fbi.security.dao;

import java.util.List;
import java.util.Map;

import org.hy.fbi.security.entity.UserAccount;
import org.hy.foundation.utils.page.Page;



public interface IUserAccountDao 
{
   
   public void newUserAccount(UserAccount adminUser);
   
   public void removeUserAccountById(int id);
   
   public void updateUserAccount(UserAccount adminUser);
   
   public UserAccount getUserAccountById(int id);
   
   public List<UserAccount> findUserAccounts(String username,String name);
   
   public List<UserAccount> findUserAccountsByPage(String username,String name,Integer userType,Integer startTime,Integer endTime,String orderBy,Page page);

	public Map<String, Long> countUserAccount(String username, String name,
			Integer userType, Integer startTime, Integer endTime);
}
