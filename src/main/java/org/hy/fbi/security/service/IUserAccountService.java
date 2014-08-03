package org.hy.fbi.security.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.hy.fbi.security.entity.UserAccount;
import org.hy.foundation.common.ws.restful.ICrudableRestful;
import org.springframework.transaction.annotation.Transactional;


@Path("/entity/userAccount/")
@Produces({"application/json"})
public interface IUserAccountService extends ICrudableRestful<UserAccount> {

	@GET
	@Path("currLogined")
	@Produces("application/json")
	public UserAccount getCurrentLoginedUser();
	
	@PUT
	@Path("updateUserAccountAuthorize")
	@Consumes({ "application/json;charset=UTF-8" })
	@Transactional
	public UserAccount updateAuthorizeForUser(UserAccount userAccount);
}
