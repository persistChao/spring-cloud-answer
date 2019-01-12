package com.answer.dao;

import com.answer.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/12 21 30
 */
public interface StudentDao extends JpaRepository<Student , Long>{
    Student findByUserName(String userName);

}
