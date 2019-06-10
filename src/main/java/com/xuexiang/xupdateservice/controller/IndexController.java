package com.xuexiang.xupdateservice.controller;

import com.xuexiang.xupdateservice.api.request.PageQuery;
import com.xuexiang.xupdateservice.api.response.ApiResult;
import com.xuexiang.xupdateservice.api.response.LoginInfo;
import com.xuexiang.xupdateservice.component.annotation.CurrentAccount;
import com.xuexiang.xupdateservice.component.annotation.LoginRequired;
import com.xuexiang.xupdateservice.exception.ApiException;
import com.xuexiang.xupdateservice.model.Account;
import com.xuexiang.xupdateservice.service.AccountService;
import com.xuexiang.xupdateservice.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static com.xuexiang.xupdateservice.exception.ApiException.ERROR.COMMON_BUSINESS_ERROR;

/**
 * 账户管理服务api
 *
 * @author xuexiang
 * @since 2019/4/21 上午12:24
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/aa"} ,method = RequestMethod.GET)
    public String aa(){
        return "aa";
    }

    @RequestMapping(value = {"/test"} ,method = RequestMethod.GET)
    public String test(){
        return "/test";
    }

}
