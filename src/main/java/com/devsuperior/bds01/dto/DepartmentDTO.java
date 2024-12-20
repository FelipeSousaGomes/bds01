package com.devsuperior.bds01.dto;


import com.devsuperior.bds01.entities.Department;

public class DepartmentDTO {


    public Long id;
    public String name;

    public DepartmentDTO() {}

    public DepartmentDTO(Long id, String name) {}

    public DepartmentDTO(Department department) {
        id = department.getId();
        name = department.getName();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
