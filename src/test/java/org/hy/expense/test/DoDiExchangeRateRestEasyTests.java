package org.hy.expense.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hy.expense.test.service.IExchangeRateServiceRestProxy;
//import org.hy.fbi.expense.entity.ExchangeRate;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




/**
 * 测试用例说明
 * 主要描述：
 * 		1. 添加资源： 汇率记录
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:spring-test/testContext.xml",
		"classpath:spring-test/resteasyClientContext.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DoDiExchangeRateRestEasyTests extends AbstractJUnit4SpringContextTests {

	protected static final Logger LOG = Logger
			.getLogger(DoDiExchangeRateRestEasyTests.class);

	@Resource(name="testExchangeRateMgr")
	private IExchangeRateServiceRestProxy exchangeRateServiceRestProxy;
	
	public IExchangeRateServiceRestProxy getMatTypeServiceRestProxy() {
		return exchangeRateServiceRestProxy;
	}

	public void setMatTypeServiceRestProxy(
			IExchangeRateServiceRestProxy exchangeRateServiceRestProxy) {
		this.exchangeRateServiceRestProxy = exchangeRateServiceRestProxy;
	}




	/**
	 * 1. 添加资源：汇率记录
	 */
	/*	@Test
	public void test1_AddExchangeRates() {
		ExchangeRate exchangeRate = new ExchangeRate();
		exchangeRate.setCurrencyCode("test");
		exchangeRate.setExchangeRate("0.18"); 
		
		exchangeRateServiceRestProxy.newEntity(exchangeRate);
	
		Assert.assertNotNull(exchangeRateServiceRestProxy.getEntityById(2));
		
		
	}

	*/

	
	

}
