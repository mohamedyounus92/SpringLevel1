/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autowiring;

/**
 *
 * @author md_yo
 */
public class Employee {
    
    private String empName;
    private int empId;
    private Address address;
    
    public Employee()
    {}

    /**
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return the empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void display()
    {
        System.out.println("Employee Name: " + this.getEmpName());
        System.out.println("Employee Id: " + this.getEmpId());
        System.out.println("Address:");
        this.address.display();
    }
}
