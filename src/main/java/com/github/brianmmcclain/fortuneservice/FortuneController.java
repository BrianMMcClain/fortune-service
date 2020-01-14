package com.github.brianmmcclain.fortuneservice;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FortuneController {

    @Autowired
    FortuneRepository fortuneRepo;

    @RequestMapping(value = "/random", method = RequestMethod.GET)
    @ResponseBody
    public String randomFortune() {
        long count = fortuneRepo.count();
        long minId = 1000;
        long maxId = minId + count;
        long randId = minId + (long) (Math.random() * (maxId - minId));
        Fortune randFortune = fortuneRepo.getOne(randId);
        return randFortune.toString();
    }
}