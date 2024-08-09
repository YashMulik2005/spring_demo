package com.springDemo.Service.impl;

import com.springDemo.Modal.Institute;
import com.springDemo.Service.InstituteService;
import com.springDemo.repository.InstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituteServiceImpl implements InstituteService {
    @Autowired
    InstituteRepository instituteRepository;
    @Override
    public List<Institute> getAll() {
        return this.instituteRepository.findAll();
    }

    @Override
    public Institute getOne(Long id) {
        return this.instituteRepository.findById(id).get();
    }

    @Override
    public Institute saveData(Institute institute) {
        return this.instituteRepository.save(institute);
    }

    @Override
    public Institute updateData(Institute institute) {
        return this.instituteRepository.save(institute);
    }
}
