/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diConcepts;

import java.util.Iterator;
import java.util.Set;
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
        Resource xmlResource = new FileSystemResource("src/diConcepts/SpringConfig.xml");
        BeanFactory factory = new XmlBeanFactory(xmlResource);
        
        Invoice invoiceObj = (Invoice)factory.getBean("invoice001");
        
        //Display the invoice
        System.out.println("Invoice ID: " + invoiceObj.getInvoiceId());
        System.out.println("Products List:");
        
        //calculate total invoice amount and display products list
        Set products = invoiceObj.getProducts();
        Iterator iter = products.iterator();
        int total = 0;
        while(iter.hasNext())
        {
            Product p = (Product)iter.next();
            total += p.getProductPrice();
            System.out.println(p.getProductId() + ".\t" + p.getProductName() + ".\t" + p.getProductPrice() + "\\-");
        }
        invoiceObj.setTotalAmount(total);
        
        System.out.println("Total price = " + invoiceObj.getTotalAmount());
    }
}
