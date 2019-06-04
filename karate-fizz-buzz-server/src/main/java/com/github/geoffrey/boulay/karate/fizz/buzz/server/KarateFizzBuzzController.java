package com.github.geoffrey.boulay.karate.fizz.buzz.server;

import com.github.geoffrey.boulay.karate.fizz.buzz.server.bean.FizzBuzzConfig;
import com.github.geoffrey.boulay.karate.fizz.buzz.server.bean.FizzBuzzConfigEntry;
import com.github.geoffrey.boulay.karate.fizz.buzz.server.bean.FizzBuzzResult;
import com.github.geoffrey.boulay.karate.fizz.buzz.server.service.FizzBuzzService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KarateFizzBuzzController {



    @Autowired
    private FizzBuzzService service;

    @GetMapping("/fizzbuzz")
    public ResponseEntity<FizzBuzzResult> getFizzbuzz(@RequestParam(value = "input", required = false) final int value) {
        return new ResponseEntity<FizzBuzzResult>(service.eval(value),HttpStatus.OK);


    }

}
