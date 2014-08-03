package org.hy.fbi.expense.restful;

import javax.ws.rs.Path;

import org.hy.fbi.expense.entity.BaseCode;
import org.hy.foundation.common.ws.restful.ICrudableRestful;
/**
 * 
 * @ClassName	IELevelService
 * @Description	TODO
 * @author 		liuwei
 * @date		2013-10-30 下午5:10:17
 * @version
 */
@Path("entity/basecode/")
//@Produces({"application/json"})
public interface IBaseCodeService extends ICrudableRestful<BaseCode> {
	 
 
}
