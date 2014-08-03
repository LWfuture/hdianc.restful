package org.hy.fbi.expense.restful.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hy.fbi.expense.entity.UserInfo;
import org.hy.fbi.expense.restful.IUserInfoService;
import org.hy.foundation.common.ws.restful.CrudableRestfulBase;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
/**
 * 
 * @ClassName	UserInfomationService
 * @Description	TODO
 * @author 		liuwei	
 * @date		2014-07-09 12:45:36
 * @version	
 */
@Service
public class UserInfoService extends CrudableRestfulBase<UserInfo> implements IUserInfoService {

	@Override
	public String login(HttpServletRequest request, String... callback) {

		//callback = request.getParameterValues("callback");
		String  username = request.getParameter("username");
		String  password = request.getParameter("password");
		
		//System.out.println(callback[0].toString());
		
		//column+"_S_"+value+"_EQ__";
		String filterStr = "username_S_"+username+"_EQ__,password_S_"+password+"_EQ__";
		List<UserInfo> userinfo = getBaseDao().findEntitiesByProperties(UserInfo.class, filterStr);
		
		Gson g = new Gson();
		String us = g.toJson(userinfo);
		
//		if(0!=userinfo.size()){
//			us = callback[0]+"({\"data\": {\"userinfo\":"+us+"}})";
//		}
		
		return us;
	}

	

}
