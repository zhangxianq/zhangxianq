package source;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));

    }
}
