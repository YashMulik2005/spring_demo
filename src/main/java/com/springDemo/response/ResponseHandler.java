package com.springDemo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object>CustomResponse(String message, HttpStatus httpStatus,Object response, boolean status){
        Map<String,Object>responseData = new HashMap<>();
        responseData.put("status",status);
        responseData.put("message",message);
        responseData.put("response", response);

        return new ResponseEntity<>(responseData,httpStatus);
    }
}
