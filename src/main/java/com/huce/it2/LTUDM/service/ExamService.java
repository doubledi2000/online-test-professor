package com.huce.it2.LTUDM.service;

import com.huce.it2.LTUDM.entity.Exam;

import java.util.Collection;

public interface ExamService {
    public abstract void createExam(Exam exam);

    public abstract void updateExam(String id, Exam exam);

    public abstract void deleteExam(String id);
}
