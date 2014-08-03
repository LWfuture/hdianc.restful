package test;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( {
	DoDiBOrgRestEasyTests.class,
	//DoDiUserOperationLogAopTests.class
	})
public class BOrgTomcatRestMysqlSuit {

	protected static final Logger LOG = Logger.getLogger(BOrgTomcatRestMysqlSuit.class);

	/***
	 * 加载配置文件
	 */
	@BeforeClass
	public static void setUp() throws Exception {
		LOG.debug("setUp for all testcases in TestSuite!");
		initSpringProperties();
//		initDataSourceProperties();
		startupRuntimes();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		LOG.debug("tearDown for all testcases in TestSuite!");
		shutdownRuntimes();
	}

	static void startupRuntimes() throws Exception {
//		TomcatWebServerTestManager.startupEmbeddedServerWithDeployment();
	}

	static void shutdownRuntimes() throws Exception {
//		TomcatWebServerTestManager.shutdownEmbeddedServer();
	}
	
	protected static void initSpringProperties() {
		System.setProperty("dp_props_path", "server-cfg/resteasyDeployment.properties");
	}

	/**
	 * 初始化数据源配置
	 */
	private static void initDataSourceProperties() throws IOException {
		URL url = ClassLoader.getSystemResource("datasource/mssql-server.properties");
		Properties props = new Properties(System.getProperties());
		props.load(url.openStream());

		props.putAll(System.getProperties());
		System.setProperties(props);
	}

}
