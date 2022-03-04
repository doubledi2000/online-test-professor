package com.huce.it2.LTUDM.responsetory;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;

import com.huce.it2.LTUDM.entity.QuestionssTest;

import java.util.List;

public interface QuestionssTestRepository extends CrudRepository<QuestionssTest, Long> {

}
