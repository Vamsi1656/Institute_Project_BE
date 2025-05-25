package com.Course.Courses.Dto;

import java.util.Objects;

public class DtoCourse {

    private Long id;
    private String name;
    private String email;
    private String course;
    private Long duration;
    private Long timings;


    public DtoCourse(Long id, String name, String email, String course, Long duration, Long timings) {
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
        DtoCourse dtoCourse = (DtoCourse) o;
        return Objects.equals(getId(), dtoCourse.getId()) && Objects.equals(getName(), dtoCourse.getName()) && Objects.equals(getEmail(), dtoCourse.getEmail()) && Objects.equals(getCourse(), dtoCourse.getCourse()) && Objects.equals(getDuration(), dtoCourse.getDuration()) && Objects.equals(getTimings(), dtoCourse.getTimings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getCourse(), getDuration(), getTimings());
    }

    @Override
    public String toString() {
        return "DtoCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", duration=" + duration +
                ", timings=" + timings +
                '}';
    }

    public DtoCourse() {
        super();
    }
}
