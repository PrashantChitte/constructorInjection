
package demo.injections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author PrashantChitte
 *
 */
public class TestEmpInsurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"SpringMain.xml"});
		Employee Emp=(Employee) context.getBean("empObj");
		Emp.display();
		
		

	}

}
