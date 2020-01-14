package com.github.brianmmcclain.fortuneservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneController {

    @Autowired
    FortuneRepository fortuneRepo;

    @GetMapping("/random")
    public Fortune randomFortune() {
        long count = fortuneRepo.count();
        long minId = 1000;
        long maxId = minId + count;
        long randId = minId + (long) (Math.random() * (maxId - minId));
        Fortune randFortune = fortuneRepo.getOne(randId);
        return randFortune;
    }
}