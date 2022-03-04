package com.huce.it2.LTUDM.service;

import com.huce.it2.LTUDM.entity.Question;

import java.util.List;

public interface QuestionService {
    public abstract void createQuestion(Question ques);

    public abstract void updateQuestion(long id, Question ques);

    public abstract void deleteQuestion(long id);

}
