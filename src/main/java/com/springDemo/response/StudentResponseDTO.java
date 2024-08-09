package com.springDemo.response;

public class StudentResponseDTO {
    private long Id;
    private String name;
    private long marks;
    private InstituteResponseDTO instituteResponseDTO;

    public StudentResponseDTO() {
    }

    public StudentResponseDTO(long id, String name, long marks, InstituteResponseDTO instituteResponseDTO) {
        Id = id;
        this.name = name;
        this.marks = marks;
        this.instituteResponseDTO = instituteResponseDTO;
    }

    public long getId() {
        return Id;
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

    public long getMarks() {
        return marks;
    }

    public void setMarks(long marks) {
        this.marks = marks;
    }

    public InstituteResponseDTO getInstituteResponseDTO() {
        return instituteResponseDTO;
    }

    public void setInstituteResponseDTO(InstituteResponseDTO instituteResponseDTO) {
        this.instituteResponseDTO = instituteResponseDTO;
    }
}
