package ru.evilcorp.myFirstProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutPutClass {

    @GetMapping("/")
    public String theEnd(){
        return "Приветствию тебя смотрящий в эту страницу!!!";
    }

}
