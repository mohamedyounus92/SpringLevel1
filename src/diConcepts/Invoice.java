/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diConcepts;

import java.util.Set;

/**
 *
 * @author md_yo
 */
public class Invoice {
    
    private String invoiceId;
    private int totalAmount;
    private Set<Product> products;
    
    public Invoice()
    {}
    
    public Invoice(String invoiceId, int totalAmount, Set<Product> products)
    {
        this.invoiceId = invoiceId;
        this.totalAmount = totalAmount;
        this.products = products;
    }

    /**
     * @return the invoiceId
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * @return the totalAmount
     */
    public int getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return the products
     */
    public Set<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
