package com.ceproirr.crud.saladereuniao.saladereuniao.exception;

import java.util.Date;

public class ErrorDetails {
    // Atributos
    private Date timestamp;
    private String message;
    private String details;

    // Construtor
    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    // Gettes
    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

}
