package com.mailorderpharmacy.drugservice.entity;

import java.util.ArrayList;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class DrugDetails
{
    @Id
    private String drugId;
    private String drugName;
    private String manufacturer;
    private Date manufactureDate;
    private Date expiryDate;
    @OneToMany(mappedBy = "drugDetails")
    private List<DrugLocationDetails> druglocationQuantities;
    
    public String getDrugId() {
        return this.drugId;
    }
    
    public String getDrugName() {
        return this.drugName;
    }
    
    public String getManufacturer() {
        return this.manufacturer;
    }
    
    public Date getManufactureDate() {
        return this.manufactureDate;
    }
    
    public Date getExpiryDate() {
        return this.expiryDate;
    }
    
    public List<DrugLocationDetails> getDruglocationQuantities() {
        return this.druglocationQuantities;
    }
    
    public void setDrugId(final String drugId) {
        this.drugId = drugId;
    }
    
    public void setDrugName(final String drugName) {
        this.drugName = drugName;
    }
    
    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public void setManufactureDate(final Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    public void setExpiryDate(final Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public void setDruglocationQuantities(final List<DrugLocationDetails> druglocationQuantities) {
        this.druglocationQuantities = druglocationQuantities;
    }
    
    public DrugDetails() {
        this.druglocationQuantities = new ArrayList<DrugLocationDetails>();
    }
    
    public DrugDetails(final String drugId, final String drugName, final String manufacturer, final Date manufactureDate, final Date expiryDate, final List<DrugLocationDetails> druglocationQuantities) {
        this.druglocationQuantities = new ArrayList<DrugLocationDetails>();
        this.drugId = drugId;
        this.drugName = drugName;
        this.manufacturer = manufacturer;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
        this.druglocationQuantities = druglocationQuantities;
    }
}