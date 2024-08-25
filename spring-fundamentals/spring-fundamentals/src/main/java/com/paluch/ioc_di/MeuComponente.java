package com.paluch.ioc_di;

import org.springframework.stereotype.Component;

// Component são annotations que indicam que uma classe será injetada

@Component
public class MeuComponente {
  public String chamarMeuComponente() {
    return "chamando o componente";
  }
}

// Poderiamos usar @Service que é uma extensão do @Component e seria uma boa
// prática usar nesse contexto.