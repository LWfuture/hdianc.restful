package org.hy.fbi.expense.restful;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.hy.fbi.expense.entity.PgApplication;
import org.hy.foundation.common.ws.restful.ICrudableRestful;
/**
 * 
 * @author liuwei
 * @ClassName: IPgApplicationService 
 * @date 2014-7-10 上午1:04:12
 */
@Path("entity/application/")
@Produces({"application/json"})
public interface IPgApplicationService extends ICrudableRestful<PgApplication> {
	 
 
}
