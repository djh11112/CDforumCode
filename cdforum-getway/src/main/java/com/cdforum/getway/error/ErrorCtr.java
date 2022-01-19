package com.cdforum.getway.error;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorCtr {

    @ResponseBody
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String errorMsg(){
        return "请先登录!";
    }
}
