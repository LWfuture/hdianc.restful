package org.hy.fbi.security.service;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.hy.fbi.security.entity.UserRole;
import org.hy.foundation.common.ws.restful.ICrudableRestful;


@Path("/entity/userResources/")
@Produces({"application/json"})
public interface IUserRoleService extends ICrudableRestful<UserRole> {

}
