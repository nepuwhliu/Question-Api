package com.example.api.controller;

import com.example.api.entity.Level;
import com.example.api.entity.LevelType;
import com.example.api.entity.QuestionType;
import com.example.api.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: Question-Api->IndexController
 * @description: 获取考试类型和考试等级
 * @author: whLiu
 * @create: 2019-10-15 10:09
 **/
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @Autowired
    private IIndexService iIndexService;


    @ResponseBody
    @RequestMapping(value = "/level", method = RequestMethod.GET)
    public List<Level> getQuestionLevel() {
        return iIndexService.getQuestionLevel();
    }

    @ResponseBody
    @RequestMapping(value = "/questionType", method = RequestMethod.GET)
    public List<QuestionType> getQuestionType() {
        return iIndexService.getQuestionType();
    }

    @ResponseBody
    @RequestMapping(value = "/levelType", method = RequestMethod.GET)
    public List<LevelType> getQuestionLevelType(){
        return iIndexService.getQuestionLevelType();
    }

}
