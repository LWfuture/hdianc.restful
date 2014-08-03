package org.hy.fbi.expense.restful;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import org.hy.fbi.expense.entity.UserInfo;
import org.hy.foundation.common.ws.restful.ICrudableRestful;
/**
 * 
 * @ClassName	IUserInfomationService
 * @Description	TODO
 * @author 		liuwei
 * @date		2013-10-30 下午2:52:31
 * @version
 */
@Path("entity/userinfo/")
@Produces({"application/json"})
public interface IUserInfoService extends ICrudableRestful<UserInfo> {
	@GET
	@Path("login")
	@Produces({ "application/json;charset=UTF-8"})
 public String login(@Context HttpServletRequest request ,@QueryParam("callback") String... callback);


	
	




}
