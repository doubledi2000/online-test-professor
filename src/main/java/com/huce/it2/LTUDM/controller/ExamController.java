package com.huce.it2.LTUDM.controller;

import com.huce.it2.LTUDM.common.ResponseMessage;
import com.huce.it2.LTUDM.entity.Answer;
import com.huce.it2.LTUDM.entity.Exam;
import com.huce.it2.LTUDM.entity.Question;
import com.huce.it2.LTUDM.service.AnswerService;
import com.huce.it2.LTUDM.service.ExamService;
import com.huce.it2.LTUDM.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/student"})
public class ExamController {
    @Autowired
    private ExamService examService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private AnswerService answerService;

    @CrossOrigin
    @PostMapping("/create")
    public ResponseEntity<?> createExam(@RequestBody Exam exam){
        try{
            examService.createExam(exam);
            List<Question> ques = exam.getQuestion();
            for (Question q : ques){
                questionService.createQuestion(q);
                for (Answer an: q.getAnswers()){
                    answerService.createAnswer(an);
                }
            }
            return new ResponseEntity(new ResponseMessage(0, "add ok"), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(new ResponseMessage(1, e.getMessage()), HttpStatus.OK);
        }

    }

    @GetMapping("/hello")
    public String hi(){
        return "hello";
    }
}
