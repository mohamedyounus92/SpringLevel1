/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aopConcepts;

/**
 *
 * @author md_yo
 */
public class BusinessLogic implements IBusinessLogic
{
    public void foo()
    {
        System.out.println("This is foo in " + this.getClass().getName());
    }
    
    public void bar() throws Exception
    {
        System.out.println("This is bar in " + this.getClass().getName());
        throw new Exception();
    }
}
