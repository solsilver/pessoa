package com.example.nathan.aula5.controller;

import com.example.nathan.aula5.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Pessoa")
public class PessoaController {
@Autowired
private PessoaService pessoaService;


}
