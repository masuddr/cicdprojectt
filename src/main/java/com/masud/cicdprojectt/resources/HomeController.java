package com.masud.cicdprojectt.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {


    @GetMapping("/list")
    public List<String> getList(){
        List<String> list = new ArrayList<String>();
        list.add("BMW");
        list.add("AUDI");
        list.add("MERCEDES");
        list.add("TOYOTA");
        list.add("VOLKSWAGEN");

        return list;
    }


}
