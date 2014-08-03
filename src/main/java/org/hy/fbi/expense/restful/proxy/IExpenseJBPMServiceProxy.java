package org.hy.fbi.expense.restful.proxy;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.hy.fbi.expense.dto.ExpenseJBPMProcessInfo;

@Path("/entity/expenseJBPM")
@Produces({"application/json"})
public interface IExpenseJBPMServiceProxy {
	@POST
	@Path("startProcess")
	@Consumes({"application/json;charset=UTF-8"})
	@Produces({"application/json;charset=UTF-8"})
	public ExpenseJBPMProcessInfo  startProcess(ExpenseJBPMProcessInfo expenseJBPMProcessInfo);
	
	@PUT
	@Path("approveProcess")
	@Consumes({"application/json;charset=UTF-8"})
	@Produces({"application/json;charset=UTF-8"})
	public ExpenseJBPMProcessInfo  approve(ExpenseJBPMProcessInfo expenseJBPMProcessInfo);
	
	
	@GET
	@Path("getTaskActualOwner/{processId}")
	@Produces({"application/json;charset=UTF-8"})
	public ExpenseJBPMProcessInfo getTaskActualOwner(@PathParam("processId") Long processInstanceID);
	/*@PUT
	@Path("startTask")
	@Produces({"application/json;charset=UTF-8"})
	public ExpenseJBPMProcessInfo  startTask();
	
	@PUT
	@Path("suspendTask")
	@Produces({"application/json;charset=UTF-8"})
	public ExpenseJBPMProcessInfo  suspendTask();
	
	@PUT
	@Path("resumeTask")
	@Produces({"application/json;charset=UTF-8"})
	public ExpenseJBPMProcessInfo  resumeTask();
	
	@PUT
	@Path("completeTask")
	@Produces({"application/json;charset=UTF-8"})
	public ExpenseJBPMProcessInfo  completeTask();
	*/
	
	@GET
	@Path("isActiveProcessInstance/{processId}")
	@Produces({"application/json;charset=UTF-8"})
	public Map<String,String> isActiveProcessInstanceById(@PathParam("processId") Long processInstanceId);
	
	
	@GET
	@Path("getLastTaskActor/{processId}")
	@Produces({"application/json;charset=UTF-8"})
	public Map getLastTaskActor(@PathParam("processId") Long processInstanceId);
}
