package com.bw.controller;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;



/**
 * Created by a on 2017/7/24.
 */
@FeignClient("goodluck-sizhongmin-provider")
public interface DcClient {
    @GetMapping("add.action")
        String add();
    @GetMapping("login.action")
    String login();
  /* String consumer();
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    String get(@RequestParam("username") String username);*/
}
