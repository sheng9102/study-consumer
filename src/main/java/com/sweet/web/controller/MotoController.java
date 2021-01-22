package com.sweet.web.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.SchoolInterface;

@RestController
@RequestMapping(value = "/moto")
public class MotoController {
    @Reference
    private SchoolInterface schoolInterface;

    // restful
    // http://127.0.0.1:8081/moto/gogo/1
    @GetMapping(value = "/gogo/{km}")
    String gogoing(@PathVariable("km") int km) {
        String classMateName = schoolInterface.getClassMateName(km);
        return "I will gogoing" + classMateName + "Km";
    }


}
