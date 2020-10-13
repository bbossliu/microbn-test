package org.example.controller;

import org.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Person)表控制层
 *
 * @author liux
 * @since 2020-10-10 14:57:08
 */
@RestController
public class PersonController{
    /**
     * 服务对象
     */
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/getPerson")
    public String getPerson(){
        return personService.getPerson();
    }
}