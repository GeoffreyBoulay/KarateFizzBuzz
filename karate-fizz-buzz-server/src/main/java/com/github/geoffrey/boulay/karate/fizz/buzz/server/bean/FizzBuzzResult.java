package com.github.geoffrey.boulay.karate.fizz.buzz.server.bean;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FizzBuzzResult {

    private Integer input;

    private String result;

}
