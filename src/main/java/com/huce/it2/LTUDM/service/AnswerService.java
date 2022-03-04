package com.huce.it2.LTUDM.service;
import com.huce.it2.LTUDM.entity.Answer;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface AnswerService {
    public abstract void createAnswer(Answer ans);

    public abstract void updateAnswer(long id, Answer ans);

    public abstract void deleteAnswer(long id);

}
