package com.xuexiang.xupdateservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账户管理服务api
 *
 * @author xuexiang
 * @since 2019/4/21 上午12:24
 */
@RestController
public class TestController {

    @RequestMapping(value = {"/testa"} ,method = RequestMethod.GET)
    public String showTestA(){
        return "testa";
    }

}
