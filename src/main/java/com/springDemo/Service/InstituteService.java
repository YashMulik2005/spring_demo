package com.springDemo.Service;

import com.springDemo.Modal.Institute;

import java.util.List;

public interface InstituteService {
    public List<Institute> getAll();
    public Institute getOne(Long id);
    public Institute saveData(Institute institute);
    public Institute updateData(Institute institute);
}
