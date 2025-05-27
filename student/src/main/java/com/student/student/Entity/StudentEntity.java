package com.student.student.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;

@Entity
@Table
@Data

public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String firstname;
    private String lastname;
    private String course;
    private String email;
    private Long mobilenumber;
    private Blob resume;

}

