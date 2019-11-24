package com.lealpha.visualalpha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sistema")
public class SistemaController {

	@GetMapping("/versao")
    public String versao() {
        return "ok";
    }
}