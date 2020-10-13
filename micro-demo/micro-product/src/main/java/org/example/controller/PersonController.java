package org.example.controller;

import org.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * (Person)表控制层
 *
 * @author liux
 * @since 2020-10-10 14:52:53
 */
@RestController
public class PersonController {
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