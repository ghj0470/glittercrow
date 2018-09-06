package sim.test.ict;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Pub {
	public static void main(String[] args) {
		String path = "src/main/resources/beandi.xml";
		DefaultListableBeanFactory registry = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xdr = new XmlBeanDefinitionReader(registry);
		xdr.loadBeanDefinitions(new FileSystemResource(path));
        	
		Liqueur li = (Liqueur) registry.getBean("soju");
		li.drink();
		li.stop();

	}

}
