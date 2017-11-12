package org.xxz.user.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Maps;

@RestController
public class HomeController {
    
    @RequestMapping(value = {"/", "/index"})
    public Map<String, Object> index() {
        Map<String,Object> map = Maps.newHashMap();
        return map; 
    }

}
