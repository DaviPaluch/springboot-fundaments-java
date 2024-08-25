package com.paluch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class PrimeiraController {

  @GetMapping("/")
  public String getMethodName() {
    return "Meu primeiro metodo";
  }

}
