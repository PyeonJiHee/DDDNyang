package com.dddn.DDDNyang.controller;

import com.dddn.DDDNyang.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class MemberController {

    private MemberService testService;

    @Autowired
    MemberController(MemberService testService){
        this.testService = testService;
    }

    @GetMapping("/hi")
//    @ResponseBody
    public ModelAndView getEmployee(){
        List<Map<String,Object>> list = testService.getEmployee();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("list", list);
        return mv;
    }
}