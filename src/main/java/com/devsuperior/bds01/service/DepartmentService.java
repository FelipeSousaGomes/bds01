package com.devsuperior.bds01.service;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class DepartmentService {

    @Autowired
    private  DepartmentRepository departmentRepository;

    public List<DepartmentDTO> findAll() {
        List<Department> departments = departmentRepository.findAll(Sort.by("name"));

        return departments.stream().map(x -> new DepartmentDTO(x)).collect(Collectors.toList());
    }

}
