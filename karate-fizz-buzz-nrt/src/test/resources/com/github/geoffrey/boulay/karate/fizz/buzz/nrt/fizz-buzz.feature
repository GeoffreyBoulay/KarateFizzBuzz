Feature: Fizz Buzz demo

    Background:
        * configure connectTimeout = 3000
        * configure readTimeout = 3000
        * url serverUrl

    Scenario Outline: unit fizz buzz : <Case>
        Given path "/fizzbuzz/standard/unit"
        And param input = "<Input>"
        When method GET
        Then status 200
        And assert response.input === <Input>
        And assert response.result === "<Result>"
    Examples:
        | Case                    | Input | Result    |
        | 1 must return 1         | 1     | 1         |
        | 2 must return 2         | 2     | 2         |
        | 3 must return Fizz      | 3     | Fizz      |
        | 4 must return 4         | 4     | 4         |
        | 5 must return Buzz      | 5     | Buzz      |
        | 6 must return Fizz      | 6     | Fizz      |
        | 7 must return 7         | 7     | 7         |
        | 15 must return FizzBuzz | 15    | FizzBuzz  |

    Scenario: interval fizz buzz : 1 to 100
      * def ordered = read('classpath:ordered.js')
      * def byOne = function(one,two) {return one.input == two.input - 1;}
      Given path "/fizzbuzz/standard/interval"
      And param from = "1"
      And param to = "100"
      When method GET
      Then status 200
      And match response == '#[_ === 100]'
      And match each response contains
        """
           {
              input: "#number? _ >= 1 && _ <= 100",
              result: "#string"
           }
        """
      And assert response[0].input === 1
      And assert ordered(response, byOne)














