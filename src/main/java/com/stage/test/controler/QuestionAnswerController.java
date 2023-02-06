package com.stage.test.controler;

import com.stage.test.model.QuestionAnswer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class QuestionAnswerController {

    @ApiOperation(value = "Saves the question and answer from ChatGPT AI in the database")
    @PostMapping("/question-answer")
    public ResponseEntity<String> saveQuestionAnswer(@RequestBody QuestionAnswer questionAnswer) {
        // logic to save the question and answer in the database
        return new ResponseEntity<>("Question and Answer saved successfully", HttpStatus.OK);
    }
}

