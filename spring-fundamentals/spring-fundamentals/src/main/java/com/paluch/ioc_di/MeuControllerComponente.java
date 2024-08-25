package com.paluch.ioc_di;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/component")
public class MeuControllerComponente {

  // Autowired é usado para injetar o componente em nosso controller
  // ou seja estamos dizendo ao Spring que ele gerenciar o ciclo de
  // vida do componente
  @Autowired
  MeuComponente meuComponente;

  @GetMapping("/")
  public String chamandoComponent() {

    var resultado = meuComponente.chamarMeuComponente();
    return resultado;

  }

}
