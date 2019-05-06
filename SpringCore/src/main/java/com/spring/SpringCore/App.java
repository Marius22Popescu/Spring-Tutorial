package com.spring.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource res = new ClassPathResource("spring.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        
        //Create a new ClassPathXmlApplicationContext, loading the definitions from the given XML file and automatically refreshing the context.
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        Emp el = (Emp)factory.getBean("empObj");
        el.call();
        
        Product p1 = (Product)ctx.getBean("prd");
        p1.display();
        
        Product p2 = (Product)ctx.getBean("prd2");
        p2.display();
        
        Building b =(Building)ctx.getBean("build");
        b.display();
    }
}
