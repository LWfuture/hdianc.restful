package test;
import java.util.List;

//import org.hy.fbi.expense.entity.BOrganization;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.google.gson.Gson;


public class mytest {
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ftx = 
				new FileSystemXmlApplicationContext("src/main/assembly/spring/dataSourceContext.xml",
						"src/main/assembly/spring/applicationContext.xml",
						"src/main/assembly/spring/resteasyServerContext.xml",
						"src/main/assembly/spring/txServerContext.xml"
						);
		
		for (int i = 0; i < ftx.getBeanDefinitionNames().length; i++) {
			System.out.println(ftx.getBeanDefinitionNames()[i]);
		}

		System.out.println("====================");
	/*	BOrganizationDao service = (BOrganizationDao) ftx.getBean("BOrganizationDao");
		List list = service.getBOrganizationBySql("");
		Gson g = new Gson();
		BOrganization bean = service.getBOrganizationById(1); 
		System.out.println(g.toJson(list));
		System.out.println(g.toJson(bean));*/
		/*BOrganizationDao dao = new BOrganizationDao();
 */
		
	}

}
