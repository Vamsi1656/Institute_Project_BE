package com.register.register.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Table(name = "regi")
@Data

public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String course;

    public Register(int id, String first_name, String last_name, String email, String password, String course) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.course = course;
    }

    public Register() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Register register = (Register) o;
        return id == register.id && Objects.equals(first_name, register.first_name) && Objects.equals(last_name, register.last_name) && Objects.equals(email, register.email) && Objects.equals(password, register.password) && Objects.equals(course, register.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, email, password, course);
    }

    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}