package com.huce.it2.LTUDM.service;

import com.huce.it2.LTUDM.entity.Answer;
import com.huce.it2.LTUDM.responsetory.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AnswerServiceImp implements AnswerService {

    @Autowired
    private AnswerRepository repo;

    @Override
    public void createAnswer(Answer ans) {
        repo.save(ans);
    }

    @Override
    public void updateAnswer(long id, Answer ans) {
        ans.setId(id);
        repo.save(ans);
    }

    @Override
    public void deleteAnswer(long id) {
        repo.deleteById(id);
    }
}
