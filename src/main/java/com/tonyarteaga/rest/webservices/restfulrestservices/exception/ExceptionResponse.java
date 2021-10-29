package com.tonyarteaga.rest.webservices.restfulrestservices.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ExceptionResponse {
    //timestamp
    private Date timestamp;

    //message
    private String message;

    //detail
    private String details;


}
