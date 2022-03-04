package com.huce.it2.LTUDM.responsetory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;

import com.huce.it2.LTUDM.entity.Test;

import java.util.List;

public interface TestRepository extends CrudRepository<Test, Long>{

}
