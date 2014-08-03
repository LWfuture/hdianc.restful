package org.hy.fbi.expense.restful.proxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/entity/voucher")
@Produces({"application/json"})
public interface IVoucherServiceProxy {
	@GET
	@Path("borrowings")
	@Produces({"html/text"})
	public String getBorrowings(@QueryParam("branch")String branch,
								@QueryParam("costCenter")String costCenter,
								@QueryParam("company")String company,
								@QueryParam("accountFlag")String accountFlag,
								@QueryParam("borrowerName")String borrowerName
								);
}
