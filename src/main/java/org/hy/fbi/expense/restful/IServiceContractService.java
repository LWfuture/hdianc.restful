package org.hy.fbi.expense.restful;

import javax.ws.rs.Path;

import org.hy.fbi.expense.entity.ServiceContract;
import org.hy.foundation.common.ws.restful.ICrudableRestful;
/**
 * 
 * @author liuwei
 * @ClassName: IServiceContractService 
 * @date 2014-7-10 上午9:26:08
 */
@Path("entity/serviceContract/")
//@Produces({"application/json"})
public interface IServiceContractService extends ICrudableRestful<ServiceContract> {
	 
 
}
