/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aopConcepts;

import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;
/**
 *
 * @author md_yo
 */
public class LoggingThrowsAdvice implements ThrowsAdvice{
    
    public void afterThrowing(Method method, Object[] args, Object target, Throwable subclass)
    {
        System.out.println("Logging that a " + subclass + " Exception was thrown.");
    }
}
