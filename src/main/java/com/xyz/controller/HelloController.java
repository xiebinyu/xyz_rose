package com.xyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

  @RequestMapping("/hello")
  @ResponseBody
  public String hello() {
    return "hello";
  }

  @RequestMapping("/")
  @ResponseBody
  public String init() {
    return "";
  }

  @RequestMapping("/rose")
  public String rose() {
    return "rose";
  }
}
