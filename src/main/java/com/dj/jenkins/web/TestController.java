package com.dj.jenkins.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author Caohj
 * @Date 2020/11/3
 * @Version 1.0
 */
@RestController
public class TestController {

    @PostMapping("test")
    public String test(){
        return "test";
    }
}
