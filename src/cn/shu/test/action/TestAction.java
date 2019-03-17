package cn.shu.test.action;

import cn.shu.test.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;

public class TestAction extends ActionSupport {


    @Resource
    TestService testService;


    public String execute(){

        testService.say();

        return SUCCESS;
    }
}
