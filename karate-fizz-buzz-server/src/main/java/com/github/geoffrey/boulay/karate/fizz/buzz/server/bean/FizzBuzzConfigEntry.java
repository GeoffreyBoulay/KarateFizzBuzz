package com.github.geoffrey.boulay.karate.fizz.buzz.server.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class FizzBuzzConfigEntry {

    private Integer multiple;

    private String output;

}
