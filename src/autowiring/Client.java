/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author md_yo
 */
public class Client {
    
    public static void main(String args[])
    {
        Resource xmlResource = new FileSystemResource("src/autowiring/younusSpringConfig.xml");
        BeanFactory factory = new XmlBeanFactory(xmlResource);
        
        Employee emp = (Employee)factory.getBean("employee001");
        
        //Display Employee details
        emp.display();
        
        Resource xmlRes = new FileSystemResource("src/autowiring/wasimSpringConfig.xml");
        BeanFactory beanFactory = new XmlBeanFactory(xmlRes);
        
        emp = (Employee)beanFactory.getBean("employee002");
        
        //Display Employee details
        emp.display();
    }
}
