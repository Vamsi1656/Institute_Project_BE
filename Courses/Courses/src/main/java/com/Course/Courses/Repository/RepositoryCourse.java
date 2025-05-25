package com.Course.Courses.Repository;

import com.Course.Courses.Entity.EntityCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCourse extends JpaRepository<EntityCourse,Long> {

    EntityCourse findByemail(String entityCourse);

    EntityCourse deleteByemail(String email);
}
