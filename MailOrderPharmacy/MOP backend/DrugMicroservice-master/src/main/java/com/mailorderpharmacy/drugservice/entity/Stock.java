package com.mailorderpharmacy.drugservice.entity;

import java.util.Date;

public class Stock
{
    private String drugId;
    private String drugName;
    private Date expiryDate;
    private int stock;
    
    public String getDrugId() {
        return this.drugId;
    }
    
    public String getDrugName() {
        return this.drugName;
    }
    
    public Date getExpiryDate() {
        return this.expiryDate;
    }
    
    public int getStock() {
        return this.stock;
    }
    
    public void setDrugId(final String drugId) {
        this.drugId = drugId;
    }
    
    public void setDrugName(final String drugName) {
        this.drugName = drugName;
    }
    
    public void setExpiryDate(final Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public void setStock(final int stock) {
        this.stock = stock;
    }
    
    public Stock() {
    }
    
    public Stock(final String drugId, final String drugName, final Date expiryDate, final int stock) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.expiryDate = expiryDate;
        this.stock = stock;
    }
}