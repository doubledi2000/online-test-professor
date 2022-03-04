package com.huce.it2.LTUDM.responsetory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;

import com.huce.it2.LTUDM.entity.Answer;

import java.util.Collection;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
    @Query("update studentss_answer set content = :content, true_false = :tf where answer_id = :answer_id")
    public void updateListAnswer(@Param("content") String content, @Param("tf") int tf, @Param("answer_id") long answer_id);
}
