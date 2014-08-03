package test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
//import org.hy.fbi.expense.entity.BOrganization;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.service.IBOrganizationServiceRestProxy;

import com.google.gson.Gson;

/**
 * 测试用例说明
 * 主要描述：
 * 		1. 查询全部组织架构：按层级排序
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:spring-test/testContext.xml",
		"classpath:spring-test/resteasyClientContext.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DoDiBOrgRestEasyTests extends AbstractJUnit4SpringContextTests {

	protected static final Logger LOG = Logger
			.getLogger(DoDiBOrgRestEasyTests.class);

	@Resource(name="testBOrgMgr")
	private IBOrganizationServiceRestProxy orgServiceRestProxy;

	public IBOrganizationServiceRestProxy getOrgServiceRestProxy() {
		return orgServiceRestProxy;
	}

	public void setOrgServiceRestProxy(
			IBOrganizationServiceRestProxy orgServiceRestProxy) {
		this.orgServiceRestProxy = orgServiceRestProxy;
	}



	/**
	 * 1. 获取全部组织架构  按层级排序
	 */
	//@Test
	/*public void test1_GetAll() {
		List<BOrganization> list=orgServiceRestProxy.GetAll();
		//Assert.assertNotNull(list);
		Gson g = new Gson();
		System.out.println(g.toJson(list));
	}
	
	//@Test
	public void test1_insert() {
		
		BOrganization bean = new BOrganization();
		//bean.setFId(0);
		orgServiceRestProxy.newEntity(bean);
		//Assert.assertNotNull(list);
		//System.out.println(list.size());
	}
	
	//@Test
		public void test1_getEntity() {
			
			BOrganization bean = 
			orgServiceRestProxy.getEntity();
			//Assert.assertNotNull(list);
			Gson g = new Gson();
			System.out.println(g.toJson(bean));
		}
		
	@Test
	public void test1_ui() {

		String callback = null;
		
		orgServiceRestProxy.GetTreeMenu(callback);
	}*/

}
