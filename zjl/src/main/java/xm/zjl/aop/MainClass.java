package xm.zjl.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author alter
 *
 */
public class MainClass {
	public static class La{
		
	}
	public static void main(String[] args) {
		Log log = LogFactory.getLog(MainClass.class);
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("/applicationContext.xml"));
		Foo foo = (Foo) factory.getBean("bean");
	}
}
