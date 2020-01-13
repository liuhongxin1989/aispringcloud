package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;

/**
 * @author liuhongxin
 * @Type StudentRepository
 * @Desc
 * @date 2020年01月06日
 * @Version V1.0
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
