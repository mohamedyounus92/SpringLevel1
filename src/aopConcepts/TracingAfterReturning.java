/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aopConcepts;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
/**
 *
 * @author md_yo
 */
public class TracingAfterReturning implements AfterReturningAdvice{
    
    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable
    {
        System.out.println("Hello, World! (from " + this.getClass().getName());
    }
}
