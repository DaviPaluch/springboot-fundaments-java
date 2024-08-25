package com.paluch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/path")
public class RequisitionParams {

  // PATH PARAMS
  @GetMapping("/rota/{id}")
  public String getMethodName(@PathVariable("id") String id) {
    return "O parametro no path é " + id;
  }

  // QUERY PARAMS
  @GetMapping("/rota/queryParams")
  public String getQueryParams(@RequestParam String nome) {
    return "O parametro no query é " + nome;
  }

  @GetMapping("/rota/queryParams2")
  public String getQueryParams2(@RequestParam Map<String, String> allParams) {
    return "O todos os parametros no query é " + allParams.entrySet();
  }

  // BODY PARAMS
  @PostMapping("/rota/bodyParams")
  public String getBodyParams(@RequestBody Usuario usuario) {
    return "parametro no body: nome=" + usuario.name() + " e idade=" + usuario.idade();
  }

  // record é usado para criar uma classe simples sem construtor ou
  // getters/setters
  public record Usuario(String name, int idade) {
  }

  // HEADER PARAMS
  @PostMapping("/rota/headerParams")
  public String getHeaderParams(@RequestHeader("name") String nomeNoHeader) {
    return "parametro no header é " + nomeNoHeader;
  }

  // HEADER PARAMS
  @PostMapping("/rota/listHeaderParams")
  public String getListHeaderParams(@RequestHeader Map<String, String> headers) {
    return "parametro no header é " + headers.entrySet();
  }

  // RESPONSE ENTITY
  // ResponseEntity é uma classe que usada para retornar
  // respostas com status e corpo diferentes dependendo do contexto
  @GetMapping("/rota/responseEntity/{id}")
  public ResponseEntity<Object> getResponseEntity(@PathVariable Long id) {

    var usuario = new Usuario("paluch", 30);
    if (id > 5) {
      return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    return ResponseEntity.badRequest().body("Numero menor que 5");
  }

}
