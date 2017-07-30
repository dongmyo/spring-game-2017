package com.nhnent.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    // TODO: name 파라미터로 전달받은 이름이 출력되도록 수정하시오.
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

}
