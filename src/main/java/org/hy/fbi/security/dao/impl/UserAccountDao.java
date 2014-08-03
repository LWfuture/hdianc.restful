package org.hy.fbi.security.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.hy.fbi.security.dao.IUserAccountDao;
import org.hy.fbi.security.entity.UserAccount;
import org.hy.foundation.common.dao.jpa.CrudableDaoBase;
import org.hy.foundation.utils.page.Page;
import org.springframework.stereotype.Repository;


@Repository
public class UserAccountDao extends CrudableDaoBase<UserAccount> implements IUserAccountDao {

	@Override
	public void newUserAccount(UserAccount adminUser) {
		super.newEntity(adminUser);
	}

	@Override
	public void removeUserAccountById(int id) {
		super.deleteEntityByPrimarykey(id);
	}

	@Override
	public void updateUserAccount(UserAccount adminUser) {
		super.updateEntity(adminUser);
	}

	@Override
	public UserAccount getUserAccountById(int id) {
		return super.getEntityByPrimarykey(id);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<UserAccount> findUserAccounts(String username,String name) {
		Map params=new HashMap();	
		String sql = "select h from UserAccount h ";
		sql += " where id>0 ";
		if (username != null) {
			sql += " and username = :username ";
			params.put("username", username);
		}	
		if (name != null) {
			sql += " and name = :name ";
			params.put("name", name);
		}			
		return super.find(sql,params);		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<UserAccount> findUserAccountsByPage(final String username,final String name,final Integer userType,
			final Integer startTime,final Integer endTime,final String orderBy,final Page page) {
		String jpql = "from UserAccount h";
		jpql += " where h.id>0";
		if (username != null)
			jpql += " and username = ?1 ";	
		if (name != null)
			jpql += " and name = ?2 ";	
		if (userType != null)
			jpql += " and userType.id = ?3 ";
		if (startTime != null)
			jpql += " and lastLoginTime >= ?4 ";
		if (endTime != null)
			jpql += " and lastLoginTime <= ?5 ";	
		
		if (orderBy != null) {
			jpql += " order by " + orderBy;
		} else {
			jpql += " order by username";
		}
		
		Query query = super.getEntityManager().createQuery(jpql);
		if (username != null)
			query.setParameter(1, username);
		if (name != null)
			query.setParameter(2, name);
		if (userType != null)
			query.setParameter(3, userType);
		if (startTime != null)
			query.setParameter(4, startTime);
		if (endTime != null)
			query.setParameter(5, endTime);
		
		List<UserAccount> result = query
				.setMaxResults(page.getPageSize())
				.setFirstResult(
						(page.getPageNo() - 1) * page.getPageSize())
				.getResultList();
		super.getEntityManager().clear();

		return result;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public Map<String,Long> countUserAccount(String username,String name,Integer userType,Integer startTime,Integer endTime) {
		Map params = new HashMap();
		String sql = "select count(h) from UserAccount h ";
		sql += " where id>0 ";
		if (username != null) {
			sql += " and username = :username ";
			params.put("username", username);
		}	
		if (name != null) {
			sql += " and name = :name ";
			params.put("name", name);
		}			
		if (userType != null) {
			sql += " and userType.id = :userType ";
			params.put("userType", userType);
		}
		if (startTime != null) {
			sql += " and lastLoginTime >= :startTime ";
			params.put("startTime", startTime);
		}	
		if (endTime != null) {
			sql += " and lastLoginTime <= :endTime ";
			params.put("endTime", endTime);
		}			
		Long x=(Long) super.find(sql, params).get(0);
		Map m=new HashMap<String,Long>();
		m.put("count", x);
		return m;
	}	
}
