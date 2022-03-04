package com.huce.it2.LTUDM.service;

import com.huce.it2.LTUDM.entity.Question;
import com.huce.it2.LTUDM.responsetory.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImp implements QuestionService {

    @Autowired
    private QuestionRepository repo;

    @Override
    public void createQuestion(Question ques) {
        repo.save(ques);
    }

    @Override
    public void updateQuestion(long id, Question ques) {
        ques.setId(id);
        repo.save(ques);
    }

    @Override
    public void deleteQuestion(long id) {
        repo.deleteById(id);
    }
}
