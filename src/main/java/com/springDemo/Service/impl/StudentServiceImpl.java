package com.springDemo.Service.impl;

import com.springDemo.Modal.Student;
import com.springDemo.Service.StudentService;
import com.springDemo.repository.StudentRepository;
import com.springDemo.response.InstituteResponseDTO;
import com.springDemo.response.StudentResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<StudentResponseDTO> getAll() {
        List<Student> s = this.studentRepository.findAll();
        List<StudentResponseDTO> studentDTOs = s.stream()
                .map(this::mapToStudentResponseDTO)
                .collect(Collectors.toList());

        return studentDTOs;
    }

    @Override
    public Student getOne(Long id) {
        return this.studentRepository.findById(id).get();
    }

    @Override
    public Student saveData(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public Student updateData(Student student) {
        return this.studentRepository.save(student);
    }

    private StudentResponseDTO mapToStudentResponseDTO(Student student) {
        InstituteResponseDTO instituteDTO = new InstituteResponseDTO(student.getInstitute().getId(), student.getInstitute().getName());
        return new StudentResponseDTO(student.getId(), student.getName(), student.getMarks(), instituteDTO);
    }
}
