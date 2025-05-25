package com.Course.Courses.Services;

import com.Course.Courses.Dto.DtoCourse;
import com.Course.Courses.Entity.EntityCourse;
import com.Course.Courses.Repository.RepositoryCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serimpl implements  ServiceCourse{
    @Autowired

    private RepositoryCourse repositoryCourse;
    @Override
    public DtoCourse savecourse(DtoCourse dtoCourse) {
        EntityCourse entityCourse=new EntityCourse(
                dtoCourse.getId(),
                dtoCourse.getName(),
                dtoCourse.getEmail(),
                dtoCourse.getCourse(),
                dtoCourse.getDuration(),
                dtoCourse.getTimings()
        );

        EntityCourse entityCourse1=repositoryCourse.save(entityCourse);

        DtoCourse dtoCourse1=new DtoCourse(
                entityCourse1.getId(),
                entityCourse1.getCourse(),
                entityCourse1.getEmail(),
                entityCourse1.getCourse(),
                entityCourse1.getDuration(),
                entityCourse1.getTimings()
        );
        return dtoCourse1;
    }

    @Override
    public DtoCourse getcourse(String email) {

        EntityCourse entityCourse=repositoryCourse.findByemail(email);

        DtoCourse dtoCourse=new DtoCourse(
                entityCourse.getId(),
                entityCourse.getName(),
                entityCourse.getCourse(),
                entityCourse.getEmail(),
                entityCourse.getDuration(),
                entityCourse.getTimings()
        );
        return dtoCourse;
    }

    @Override
    public DtoCourse updatecourse(String email, DtoCourse dtoCourse) {

        EntityCourse entityCourse=repositoryCourse.findByemail(email);
        entityCourse.setName(dtoCourse.getName());
        entityCourse.setCourse(dtoCourse.getCourse());
        entityCourse.setEmail(dtoCourse.getEmail());
        entityCourse.setDuration(dtoCourse.getDuration());
        entityCourse.setTimings(dtoCourse.getTimings());

        EntityCourse entityCourse1=repositoryCourse.save(entityCourse);

        DtoCourse dtoCourse1=new DtoCourse(
                entityCourse1.getId(),
                entityCourse1.getName(),
                entityCourse1.getCourse(),
                entityCourse1.getEmail(),
                entityCourse1.getDuration(),
                entityCourse1.getTimings()
        );
        return dtoCourse1;
    }

    @Override
    public EntityCourse deletecourse(String email) {

        EntityCourse entityCourse=repositoryCourse.findByemail(email);
        repositoryCourse.deleteByemail(email);
        return entityCourse;
    }

    //javax.crypto.CipherOutputStream 
}
