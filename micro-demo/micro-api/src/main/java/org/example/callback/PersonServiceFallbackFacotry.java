package org.example.callback;

import feign.hystrix.FallbackFactory;
import org.example.service.PersonService;
import org.springframework.stereotype.Component;

/**
 * @date: 2020/10/10
 * @description: 2020/10/10
 **/
@Component
public class PersonServiceFallbackFacotry implements FallbackFactory<PersonService> {

    public PersonService create(Throwable throwable) {
       throwable.printStackTrace();
        return new PersonService() {
            @Override
            public String getPerson() {
                return "触发熔断保护";
            }
        };
    }
}
