package com.Course.Courses.Controller;

import com.Course.Courses.Dto.DtoCourse;
import com.Course.Courses.Entity.EntityCourse;
import com.Course.Courses.Services.Serimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class ControllerCourse {

    @Autowired
    private Serimpl serimpl;

    @PostMapping("/savecourse")

    public ResponseEntity<DtoCourse> savecourse(@RequestBody DtoCourse dtoCourse){
        DtoCourse dtoCourse1 =serimpl.savecourse(dtoCourse);
        return new ResponseEntity<>(dtoCourse1, HttpStatus.CREATED);
    }

    @GetMapping("/{email}")
    public  ResponseEntity<DtoCourse> getcourse(@PathVariable String email){
        DtoCourse dtoCourse=serimpl.getcourse(email);
        return  new ResponseEntity<>(dtoCourse,HttpStatus.OK);
    }

    @PutMapping("/{email}")

    public ResponseEntity<DtoCourse> updatecourse(@PathVariable String email, @RequestBody DtoCourse dtoCourse){
        DtoCourse dtoCourse1=serimpl.updatecourse(email, dtoCourse);
        return new ResponseEntity<>(dtoCourse1,HttpStatus.OK);
    }

    @DeleteMapping("/{email}")

    public ResponseEntity<EntityCourse> deletecourse(@PathVariable String email){
        EntityCourse entityCourse=serimpl.deletecourse(email);
        return new ResponseEntity<>(entityCourse,HttpStatus.OK);
    }
}
