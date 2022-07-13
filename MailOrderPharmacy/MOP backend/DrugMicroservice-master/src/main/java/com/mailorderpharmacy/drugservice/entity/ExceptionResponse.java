package com.mailorderpharmacy.drugservice.entity;

import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

public class ExceptionResponse
{
    String messge;
    LocalDateTime timestamp;
    HttpStatus status;
    
    public String getMessge() {
        return this.messge;
    }
    
    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }
    
    public HttpStatus getStatus() {
        return this.status;
    }
    
    public void setMessge(final String messge) {
        this.messge = messge;
    }
    
    public void setTimestamp(final LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    
    public void setStatus(final HttpStatus status) {
        this.status = status;
    }
    
    public ExceptionResponse(final String messge, final LocalDateTime timestamp, final HttpStatus status) {
        this.messge = messge;
        this.timestamp = timestamp;
        this.status = status;
    }
    
    public ExceptionResponse() {
    }
}