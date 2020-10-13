package org.example.service;

import org.example.callback.PersonServiceFallbackFacotry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * (Person)表服务接口
 *
 * @author liux
 * @since 2020-10-10 14:35:27
 */
@FeignClient(value = "product",fallbackFactory = PersonServiceFallbackFacotry.class)
public interface PersonService  {

    @RequestMapping(value = "/getPerson",method = RequestMethod.GET)
    String getPerson();

}