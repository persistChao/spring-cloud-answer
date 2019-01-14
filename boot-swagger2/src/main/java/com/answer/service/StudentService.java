package com.answer.service;

import com.answer.dao.StudentDao;
import com.answer.model.Student;
import com.answer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/12 21 20
 */
@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public Student findByUserName(String userName) {
        return studentDao.findByUserName(userName);
    }

    public Student saveStudent(Student student) {
        return studentDao.save(student);
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }

    public Student updateStudent(Student student) {
        return studentDao.saveAndFlush(student);
    }

    public void delete(long id) {
        studentDao.delete(id);
    }

}
