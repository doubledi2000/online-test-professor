package com.huce.it2.LTUDM.responsetory;

import com.huce.it2.LTUDM.entity.Student;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, String> {


}
