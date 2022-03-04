package com.huce.it2.LTUDM.service;

import com.huce.it2.LTUDM.common.Const;
import com.huce.it2.LTUDM.entity.Exam;
import com.huce.it2.LTUDM.responsetory.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ExamServiceImp implements ExamService, Const {

    @Autowired
    private ExamRepository repo;

    @Override
    public void createExam(Exam exam) {
        repo.save(exam);
    }

    @Override
    public void updateExam(String id, Exam exam) {
        exam.setExamCode(id);
        repo.save(exam);
    }

    @Override
    public void deleteExam(String id) {
        repo.deleteById(id);
    }
}
