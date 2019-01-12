package com.answer.controller;

import com.alibaba.fastjson.JSONObject;
import com.answer.model.Student;
import com.answer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/12 21 45
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/save")
    public String saveUser() {
        Student student = new Student();
        student.setAge(27);
        student.setUserName("answer");
        student.setPassword("admin");
        Student re = studentService.saveStudent(student);
        return JSONObject.toJSONString(re);
    }

}
