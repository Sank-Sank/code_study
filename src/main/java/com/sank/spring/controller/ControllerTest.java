package com.sank.spring.controller;

import com.sank.spring.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoInfo")
public class ControllerTest {

    @Autowired
    Person person;


    @RequestMapping("/test")
    public Person testController() {
        Logger logger = LoggerFactory.getLogger(getClass());
        //日志级别从低到高
        logger.trace("这是trace信息");
        logger.debug("这是debug信息git ");
        //SpringBoot默认使用的是Info界别的，不指定的话只会输出Info以上的信息
        logger.info("这是Info信息");
        logger.warn("这是warn信息");
        logger.error("这是errer信息");
        return person;
    }

}
