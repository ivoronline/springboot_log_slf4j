package com.ivoronline.springboot_log_slf4j.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RestController
public class MyController {

  //========================================================
  // HELLO
  //========================================================
  @RequestMapping("Hello")
  String hello() {
    log.info("Hello from Controller");
    return "Hello from Controller";
  }

}
