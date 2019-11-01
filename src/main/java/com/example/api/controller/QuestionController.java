package com.example.api.controller;


import com.example.api.entity.QuestionWithBLOBs;
import com.example.api.service.IIndexService;
import com.example.api.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/question")
public class QuestionController {

    @Autowired
    private IQuestionService userService;
    @Autowired
    private IIndexService iIndexService;

    @ResponseBody
    @RequestMapping(value = "/question", method = RequestMethod.GET)
    public List<QuestionWithBLOBs> getQuestion(String levelName, String typeName) {
        int levelId = iIndexService.getQuestionLevelByLevelName(levelName).getId();
        int typeId = iIndexService.getQuestionTypeByTypeName(typeName).getId();
        return userService.getQuestion(levelId, typeId);
    }

}
