package com.mdpert.bluegreendeploydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/ver")
    public @ResponseBody String version() {
        System.out.println("######################## custom sysout log ################");
        log.info("######################## custom slf4j log ################");
        return "1.0.5";
    }
}
