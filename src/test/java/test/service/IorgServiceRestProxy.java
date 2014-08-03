package test.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

//import org.hy.fbi.expense.entity.BOrganization;
import org.springframework.transaction.annotation.Transactional;

@Path("/entity/matType/")
@Produces({"application/json"})
public interface IorgServiceRestProxy {
	/**
	 * Read Operation for Single Entity
	 * 根据Id查询实体
	 * @return entity
	 */
/*	@GET
	@Path("justNewOne")
	@Produces({ "application/json;charset=UTF-8"})
	public BOrganization getEntityByJustNewOne();
	
	*//**
	 * 新增实体
	 * @param entity
	 *//*
	@POST
	@Consumes({ "application/json;charset=UTF-8"})
	@Transactional
	public BOrganization newEntity(BOrganization entity);
	
	*//**
	 * 更新实体
	 * @param entity
	 *//*
	@PUT
	@Path("{id}")
	@Consumes({ "application/json;charset=UTF-8" })
	@Transactional
	public BOrganization updateEntity(BOrganization entity, @PathParam("id") Integer id);
	
	*//**
	 * 根据Id删除实体
	 * @param id
	 *//*
	@DELETE
	@Path("{id}")
	@Transactional
	public void deleteEntityById(@PathParam("id") Integer id);

	*//**
	 * Read Operation for Single Entity
	 * 根据Id查询实体
	 * @return entity
	 *//*
	@GET
	@Path("{id}")
	@Produces({ "application/json;charset=UTF-8"})
	public BOrganization getEntityById(@PathParam("id") Integer id);
	
	@GET
	@Path("all")
	@Produces({ "application/json;charset=UTF-8"})
	public List queryEntityList();
	*/
}
