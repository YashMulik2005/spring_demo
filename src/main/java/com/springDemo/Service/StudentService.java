package com.springDemo.Service;

import com.springDemo.Modal.Student;
import com.springDemo.response.StudentResponseDTO;

import java.util.List;

public interface StudentService {
    public List<StudentResponseDTO> getAll();
    public Student getOne(Long id);
    public Student saveData(Student student);
    public Student updateData(Student student);
}
