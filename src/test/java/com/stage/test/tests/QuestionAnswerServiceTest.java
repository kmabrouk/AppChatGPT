package com.stage.test.tests;

import com.stage.test.model.QuestionAnswer;
import com.stage.test.repository.QuestionAnswerRepository;
import com.stage.test.sevice.QuestionAnswerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionAnswerServiceTest {

    @Autowired
    private QuestionAnswerService questionAnswerService;

    @Autowired
    private QuestionAnswerRepository questionAnswerRepository;

    @Test
    public void testSaveQuestionAnswer() {
        QuestionAnswer questionAnswer = new QuestionAnswer("What is Java?", "Java is a programming language and a platform.");
        QuestionAnswer savedQuestionAnswer = questionAnswerService.saveQuestionAnswer(questionAnswer);
        assertNotNull(savedQuestionAnswer);
        assertEquals("What is Java?", savedQuestionAnswer.getQuestion());
        assertEquals("Java is a programming language and a platform.", savedQuestionAnswer.getAnswer());
        QuestionAnswer retrievedQuestionAnswer = questionAnswerRepository.findById(savedQuestionAnswer.getId()).get();
        assertEquals(savedQuestionAnswer, retrievedQuestionAnswer);
    }
}

