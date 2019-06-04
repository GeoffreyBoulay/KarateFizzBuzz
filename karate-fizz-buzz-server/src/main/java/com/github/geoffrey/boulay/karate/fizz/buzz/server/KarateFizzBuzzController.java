package com.github.geoffrey.boulay.karate.fizz.buzz.server;

import com.github.geoffrey.boulay.karate.fizz.buzz.server.bean.FizzBuzzResult;
import com.github.geoffrey.boulay.karate.fizz.buzz.server.service.FizzBuzzService;
import java.util.ArrayList;
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

    @GetMapping("/fizzbuzz/standard/unit")
    public ResponseEntity<FizzBuzzResult> standardUnitFizzbuzz(@RequestParam(value = "input") final int input) {
        return new ResponseEntity<>(service.eval(input), HttpStatus.OK);
    }

    @GetMapping("/fizzbuzz/standard/interval")
    public ResponseEntity<List<FizzBuzzResult>> intervalUnitFizzbuzz(@RequestParam(value = "from") final int from, @RequestParam(value = "to") final int to) {
        final List<FizzBuzzResult> results = new ArrayList<>();
        for(int i = from ; i <= to ; i++) {
           results.add(service.eval(i));
        }
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

}
