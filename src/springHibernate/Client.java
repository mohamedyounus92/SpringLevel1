/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author md_yo
 */
public class Client {
    public static void main(String args[])
    {
        try
        {
            ApplicationContext context = new FileSystemXmlApplicationContext("src/springHibernate/SpringConfig.xml");
            Client clientObj = new Client();
            User userObj = clientObj.createNewUser();
            UserHibernateTemplate temp = (UserHibernateTemplate)context.getBean("userHibernateTemplateBean");

            if(temp != null)
            {
                temp.saveUserRecord(userObj);
                System.out.println("New user saved.");
            }
            else
            {
                System.out.println("Error creating the DAO...!");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    public User createNewUser()
    {
        User newUser = new User();
        newUser.setName("Mohamed Younus");
        newUser.setAge(26);
        newUser.setEmail("mohamedyounus92@gmail.com");
        return newUser;
    }
    
}
