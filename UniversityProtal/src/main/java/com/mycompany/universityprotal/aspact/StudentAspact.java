/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityprotal.aspact;

import com.mycompany.universityprotal.model.Audits;
import com.mycompany.universityprotal.service.AuditsService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

///**
// *
// * @author shari
// */
@Aspect
@Component
//@Configuration
@EnableAspectJAutoProxy
public class StudentAspact {

    @Autowired
    private AuditsService auditsService;

    @Before("execution( public * save())")
    public void beforePageLoad() {

        Audits audits = new Audits();
        audits.setAction("Save");
        audits.setTime("3:54");
        audits.setUsername("adminUser");
        audits.setRole("admin");
        audits.setEmail("admin@test.com");
        Date dateObject = new Date();

//        String fronEndDateString = dateObject
//        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
//        dateObject = simpleDate.parse(dateObject);
//        trainee.setDate(dateObject);
        audits.setDate(new Date());
        auditsService.save(audits);
        System.out.println("Student Aspect.............hit"+Instant.now());
        System.out.println("Student Aspect.............hit"+dateObject);

    }

//    @Before("execution( public * save())")
//    public void beforeSave(Joinpoint jp) {
//
//        Audits audits = new Audits();
//        audits.setAction("Save");
//        audits.setTime("3:54");
//        audits.setUsername("adminUser");
//        audits.setRole("admin");
//        audits.setEmail("admin@test.com");
//        audits.setDate(new Date());
//
//        auditsService.insetLog(audits);
//        System.out.println("Student Aspect.............hit");
//
//    }
}
