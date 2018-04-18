import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"application-common.xml",
				"application-beans.xml",
				"application-jdbc.xml");
		//test dev  branch
		Object object = context.getBean("member");
	}
}
