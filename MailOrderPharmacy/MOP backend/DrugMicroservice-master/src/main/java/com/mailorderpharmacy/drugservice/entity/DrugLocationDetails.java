package com.mailorderpharmacy.drugservice.entity;

import javax.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class DrugLocationDetails
{
    @Id
    private String serialId;
    private String location;
    private int quantity;
    @ManyToOne(cascade = { CascadeType.ALL })
    @JsonIgnore
    @JoinColumn(name = "drugId")
    private DrugDetails drugDetails;
    
    public String getSerialId() {
        return this.serialId;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public DrugDetails getDrugDetails() {
        return this.drugDetails;
    }
    
    public void setSerialId(final String serialId) {
        this.serialId = serialId;
    }
    
    public void setLocation(final String location) {
        this.location = location;
    }
    
    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }
    
    public void setDrugDetails(final DrugDetails drugDetails) {
        this.drugDetails = drugDetails;
    }
    
    public DrugLocationDetails() {
    }
    
    public DrugLocationDetails(final String serialId, final String location, final int quantity, final DrugDetails drugDetails) {
        this.serialId = serialId;
        this.location = location;
        this.quantity = quantity;
        this.drugDetails = drugDetails;
    }
}