package br.com.estudo.springboot.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/springboot")
public class HelloWorldController {

	@RequestMapping(value = "/helloworld")
	public String HelloWorld() {
		return("Hello World");
	}
}
