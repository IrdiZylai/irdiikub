package com.crud.irdi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.crud.irdi.exception.ApiErrorResponse;
import com.crud.irdi.exception.UserNotFoundException;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleApiException(
    		UserNotFoundException ex) {
        ApiErrorResponse response = 
            new ApiErrorResponse("error-0001",
                "No Record found with ID " + ex.getId());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}