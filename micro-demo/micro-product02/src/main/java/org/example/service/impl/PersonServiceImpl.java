package org.example.service.impl;

import org.example.dao.PersonDao;
import org.example.entity.Person;
import org.example.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Person)表服务实现类
 *
 * @author liux
 * @since 2020-10-10 14:57:07
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    public String getPerson() {
        return "person02";
    }
}