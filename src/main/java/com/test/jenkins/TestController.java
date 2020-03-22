package com.test.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Eric
 * @Description
 * @Date2020/3/22 11:18
 **/
@RestController
public class TestController {

    @RequestMapping("/test")
    public Object test(){
        return "112211";
    }
}
