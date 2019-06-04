package com.github.geoffrey.boulay.karate.fizz.buzz.nrt;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@CucumberOptions(features = "classpath:com/github/geoffrey/boulay/karate/fizz/buzz/nrt/fizz-buzz.feature", tags = "~@ignore")
public class FizzBuzzNrtTest {

}
