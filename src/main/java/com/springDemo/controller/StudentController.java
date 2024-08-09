package com.springDemo.controller;

import com.springDemo.Modal.Student;
import com.springDemo.Service.StudentService;
import com.springDemo.response.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping()
    public ResponseEntity<Object>getAll(){
         try{
             return ResponseHandler.CustomResponse("Data fetched sucessfully.", HttpStatus.OK,this.studentService.getAll(),true);
         }catch(Exception e){
             return ResponseHandler.CustomResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,null,false);
         }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object>getOne(@PathVariable Long id){
        try{
            return ResponseHandler.CustomResponse("Data fetched sucessfully.", HttpStatus.OK,this.studentService.getOne(id),true);
        }catch(Exception e){
            return ResponseHandler.CustomResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,null,false);
        }
    }

    @PostMapping()
    public ResponseEntity<Object>saveData(@RequestBody Student student){
        try{
            return ResponseHandler.CustomResponse("Data fetched sucessfully.", HttpStatus.OK,this.studentService.saveData(student),true);
        }catch(Exception e){
            return ResponseHandler.CustomResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,null,false);
        }
    }

    @PutMapping()
    public ResponseEntity<Object>updateData(@RequestBody Student student){
        try{
            return ResponseHandler.CustomResponse("Data fetched sucessfully.", HttpStatus.OK,this.studentService.updateData(student),true);
        }catch(Exception e){
            return ResponseHandler.CustomResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,null,false);
        }
    }
}
