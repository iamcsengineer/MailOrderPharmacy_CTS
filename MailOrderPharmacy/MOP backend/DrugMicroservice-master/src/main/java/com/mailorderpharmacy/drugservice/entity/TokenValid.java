package com.mailorderpharmacy.drugservice.entity;

public class TokenValid
{
    private String uid;
    private String name;
    private boolean isValid;
    
    public String getUid() {
        return this.uid;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean isValid() {
        return this.isValid;
    }
    
    public void setUid(final String uid) {
        this.uid = uid;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setValid(final boolean isValid) {
        this.isValid = isValid;
    }
    
    @Override
    public String toString() {
        return "TokenValid(uid=" + this.getUid() + ", name=" + this.getName() + ", isValid=" + this.isValid() + ")";
    }
    
    public TokenValid() {
    }
    
    public TokenValid(final String uid, final String name, final boolean isValid) {
        this.uid = uid;
        this.name = name;
        this.isValid = isValid;
    }
}