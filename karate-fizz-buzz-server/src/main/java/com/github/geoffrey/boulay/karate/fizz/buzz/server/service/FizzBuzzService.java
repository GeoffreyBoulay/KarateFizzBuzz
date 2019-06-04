package com.github.geoffrey.boulay.karate.fizz.buzz.server.service;

import com.github.geoffrey.boulay.karate.fizz.buzz.server.bean.FizzBuzzConfig;
import com.github.geoffrey.boulay.karate.fizz.buzz.server.bean.FizzBuzzConfigEntry;
import com.github.geoffrey.boulay.karate.fizz.buzz.server.bean.FizzBuzzResult;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {


    private static final FizzBuzzConfig STANDARD_CONFIG = FizzBuzzConfig.builder()
        .entry(new FizzBuzzConfigEntry(3, "Fizz"))
        .entry(new FizzBuzzConfigEntry(5, "Buzz"))
        .build();

    public FizzBuzzResult eval(final int value) {
        return eval(value, STANDARD_CONFIG);
    }

    public FizzBuzzResult eval(final int value, final FizzBuzzConfig config) {
        final String output = fizzBuzz(value, config);
        return FizzBuzzResult.builder().
            input(value)
            .result(output)
            .build();
    }

    public String fizzBuzz(final int value, final FizzBuzzConfig config) {
        final StringBuilder builder = new StringBuilder();
        for (final FizzBuzzConfigEntry entry : config.getEntries()) {
            if(value % entry.getMultiple() == 0) {
                builder.append(entry.getOutput());
            }
        }
        if(builder.length() == 0) {
            builder.append(value);
        }
        return builder.toString();
    }

}
