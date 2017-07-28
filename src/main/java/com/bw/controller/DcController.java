package com.bw.controller;

import com.google.common.collect.Maps;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by a on 2017/7/24.
 */
@RestController
public class DcController {
    @Autowired
private DcClient dcClient;


@GetMapping("/add")
    public String add(){

    return dcClient.add();
}
@GetMapping("login")
    public String login(){
        return dcClient.login();
}
}
