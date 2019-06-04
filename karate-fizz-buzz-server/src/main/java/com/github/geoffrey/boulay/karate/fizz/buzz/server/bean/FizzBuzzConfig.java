package com.github.geoffrey.boulay.karate.fizz.buzz.server.bean;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class FizzBuzzConfig {

    @Singular private List<FizzBuzzConfigEntry> entries;

}
