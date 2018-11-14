/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aopConcepts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author md_yo
 */
public class Client {
    
    public static void main(String args[])
    {
        //Both ApplicationContext and the BeanFactory container works same.
//        ApplicationContext applnContext = new FileSystemXmlApplicationContext("src/aopConcepts/SpringConfig.xml");
//        
//        IBusinessLogic object = (IBusinessLogic)applnContext.getBean("beanProxy");
        
        Resource resObject = new FileSystemResource("src/aopConcepts/SpringConfig.xml");
        BeanFactory factory = new XmlBeanFactory(resObject);
        IBusinessLogic object = (IBusinessLogic) factory.getBean("beanProxy");
        
        try
        {
            //call all the Target object member functions
            object.foo();
            object.bar();
        }
        catch(Exception e)
        {
            System.out.println(e.getStackTrace());
            System.out.println("BusinessLogic exception caught on the client.");
        }
    }
}
