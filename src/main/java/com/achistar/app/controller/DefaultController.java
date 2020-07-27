package com.achistar.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
  @RequestMapping("/")
  public String start() {
	  return "index";	
  }
}
