package com.springDemo.controller;

import com.springDemo.Modal.Institute;
import com.springDemo.Service.InstituteService;
import com.springDemo.response.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/institute")
public class InstituteController {
    @Autowired
    InstituteService instituteService;

    @GetMapping()
    public ResponseEntity<Object>getAll(){
        try{
            return ResponseHandler.CustomResponse("Data fetched sucessfully.", HttpStatus.OK,this.instituteService.getAll(),true);
        }catch(Exception e){
            return ResponseHandler.CustomResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,null,false);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object>getOne(@PathVariable Long id){
        try{
            return ResponseHandler.CustomResponse("Data fetched sucessfully.", HttpStatus.OK,this.instituteService.getOne(id),true);
        }catch(Exception e){
            return ResponseHandler.CustomResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,null,false);
        }
    }

    @PostMapping()
    public ResponseEntity<Object>saveData(@RequestBody Institute institute){
        try{
            return ResponseHandler.CustomResponse("Data fetched sucessfully.", HttpStatus.OK,this.instituteService.saveData(institute),true);
        }catch(Exception e){
            return ResponseHandler.CustomResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,null,false);
        }
    }

    @PutMapping()
    public ResponseEntity<Object>updateData(@RequestBody Institute institute){
        try{
            return ResponseHandler.CustomResponse("Data fetched sucessfully.", HttpStatus.OK,this.instituteService.updateData(institute),true);
        }catch(Exception e){
            return ResponseHandler.CustomResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,null,false);
        }
    }
}
