/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstSpringApp;

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
        Resource xmlResource = new FileSystemResource("src/firstSpringApp/SpringConfig.xml");
        BeanFactory factory = new XmlBeanFactory(xmlResource);
        
        Namer namer = (Namer)factory.getBean("namerId");
        System.out.println(namer.getName());
    }
}
