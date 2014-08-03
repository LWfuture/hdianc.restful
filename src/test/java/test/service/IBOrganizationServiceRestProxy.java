package test.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

//import org.hy.fbi.expense.entity.BOrganization;
import org.jboss.resteasy.annotations.providers.jaxb.Wrapped;
import org.springframework.transaction.annotation.Transactional;

@Path("/borg/")
@Produces({"application/json"})
public interface IBOrganizationServiceRestProxy {
// 
//	@GET
//	@Produces({ "application/json;charset=UTF-8"})
//	@Wrapped
//	List<BOrganization> GetAll();
//
//	/**
//	 * 新增实体
//	 * @param entity
//	 */
//	@POST
//	@Consumes({ "application/json;charset=UTF-8"})
//	@Transactional
//	public BOrganization newEntity(BOrganization entity);
//	
//	/**
//	 * 获取一个实体
//	 * @return
//	 */
//	@GET
//	@Path("getEntity")
//	@Produces({ "application/json;charset=UTF-8"})
//	BOrganization getEntity();
//	
//	

	/*
	 * 获取租住机构树
	 */
	@GET
	@Path("GetTreeMenu")
	@Produces({ "application/json;charset=UTF-8"})
	public String GetTreeMenu(@QueryParam("callback") String... callback);
	
	
	
	
}
