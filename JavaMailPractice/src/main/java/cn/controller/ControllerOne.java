package cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.Impl.SendServiceImpl;
import service.SendService;

@Controller
public class ControllerOne {

    @Autowired
    SendService sendService;

    @RequestMapping(value = "/index")
    public String index () {
        return "index";
    }
    @RequestMapping(value = "/sendMail")
    public String sendMail() throws Exception {
        sendService.sendMail();
        return "success";
    }

}
