package com.Course.Courses.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class EntityCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String email;
    private String course;
    private Long duration;
    private Long timings;

    public EntityCourse(Long id, String name, String email, String course, Long duration, Long timings) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.duration = duration;
        this.timings = timings;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getTimings() {
        return timings;
    }

    public void setTimings(Long timings) {
        this.timings = timings;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EntityCourse that = (EntityCourse) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getCourse(), that.getCourse()) && Objects.equals(getDuration(), that.getDuration()) && Objects.equals(getTimings(), that.getTimings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getCourse(), getDuration(), getTimings());
    }

    @Override
    public String toString() {
        return "EntityCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", duration=" + duration +
                ", timings=" + timings +
                '}';
    }

    public EntityCourse() {
        super();
    }
}
