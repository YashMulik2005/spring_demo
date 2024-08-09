package com.springDemo.response;

public class InstituteResponseDTO {
    private long Id;
    private String name;

    public long getId() {
        return Id;
    }

    public InstituteResponseDTO() {
    }

    public InstituteResponseDTO(long id, String name) {
        Id = id;
        this.name = name;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
