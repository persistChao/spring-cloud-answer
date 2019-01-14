package com.answer.controller;

import com.alibaba.fastjson.JSONObject;
import com.answer.model.Student;
import com.answer.service.StudentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/12 21 45
 */
@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @ApiOperation(value = "保存" , notes = "保存学生")
    @PostMapping("/save")
    public String saveUser(@RequestBody Student student) {
        Student re = studentService.saveStudent(student);
        return JSONObject.toJSONString(re);
    }

    @ApiOperation(value = "获取学生列表" , notes = "学生表")
    @GetMapping("/list")
    public List<Student> getUsers() {
        return studentService.findAll();
    }

    @ApiParam(name = "student" ,value = "学生entity" )
    @ApiOperation(value = "创建学生" , notes = "创建用户")
    @PostMapping("/post")
    public Student postStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @ApiImplicitParam(name = "id" , value = "学生id", paramType = "path" , required = true , dataType = "Integer")
    @ApiOperation(value = "更新信息" , notes = "更新")
    @PutMapping("/{id}")
    public Student putStudent(@PathVariable("id") Long id  , @RequestBody Student std) {
        Student student = new Student();
        student.setUserName(std.getUserName());
        student.setId(id);
        student.setAge(std.getAge());
        student.setPassword(std.getPassword());
        return studentService.updateStudent(student);
    }

}
