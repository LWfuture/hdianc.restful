package org.hy.fbi.security.service.impl;


import org.hy.fbi.security.entity.UserRole;
import org.hy.fbi.security.service.IUserRoleService;
import org.hy.foundation.common.ws.restful.CrudableRestfulBase;
import org.springframework.stereotype.Repository;



@Repository
public class UserRoleDaoResource extends CrudableRestfulBase<UserRole> implements IUserRoleService {

}
