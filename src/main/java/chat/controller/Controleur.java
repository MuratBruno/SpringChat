package chat.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import chat.beans.HelloBean;
import chat.beans.HelloBeanFactoryFrancais;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(value = "/hello")
public class Controleur {

    @GetMapping
    public void ditHello() {
    	HelloBeanFactoryFrancais helloBeanFactoryFrancais = new HelloBeanFactoryFrancais();
    	HelloBean hello=helloBeanFactoryFrancais.CreerHelloDefault();
        System.out.println(hello.getGreetings());
    }
}
