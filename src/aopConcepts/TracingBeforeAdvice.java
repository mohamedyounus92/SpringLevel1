/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aopConcepts;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
/**
 *
 * @author md_yo
 */
public class TracingBeforeAdvice implements MethodBeforeAdvice{
    
    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable
    {
        System.out.println("Hello, World! (from " + this.getClass().getName());
    }
}
