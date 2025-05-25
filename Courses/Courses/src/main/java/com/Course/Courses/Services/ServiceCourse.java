package com.Course.Courses.Services;

import com.Course.Courses.Dto.DtoCourse;
import com.Course.Courses.Entity.EntityCourse;

public interface ServiceCourse {
    DtoCourse savecourse(DtoCourse dtoCourse);

    DtoCourse getcourse(String email);

    DtoCourse updatecourse(String email,DtoCourse dtoCourse);

    EntityCourse deletecourse(String email);
}
