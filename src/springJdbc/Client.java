/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author md_yo
 */
public class Client {
    public static void main(String args[])
    {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/springJdbc/SpringConfig.xml");
        StudentJdbcTemplate studentJdbc = (StudentJdbcTemplate)context.getBean("springJdbcTemplateBean");
        
        System.out.println("=============RECORDS CREATION===============");
        
        Student student = (Student)context.getBean("studentBean");
        student.setId(1011);
        student.setName("Tony Stark");
        studentJdbc.create(student);
    }
}
