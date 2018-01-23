package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Object doubleThis(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return new ErrorResponse("Please provide an input!");
    } else {
      return new Doubling(input);
    }

  }

  @GetMapping("/greeter")
  public Object greetThis(@RequestParam(value = "name", required = false) String name
                            , @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorResponse("Please provide a name!");
    } else if (title == null) {
      return new ErrorResponse("Please provide a title!");
    } else {
      return new Greeting(name, title);
    }

  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable(value = "appendable") String appendable) {
    if (appendable == null) {
      throw new ResourceNotFoundException();
    } else {
      return new AppendA(appendable);
    }
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable(value = "what") String operator
                        ,@RequestBody Until until) {
    if (until.getUntil() == null) {
      return new ErrorResponse("Please provide a number!");
    } else {
      return new DoUntil(operator, until);
    }
  }

  @PostMapping("/arrays")
  public Object calculateArray(@RequestBody CalcArray calcArray) {

    if (calcArray.getNumbers().length == 0) {
      return new ErrorResponse("Please provide some numbers!");
    } else if (calcArray.getWhat() == null) {
      return new ErrorResponse("Please provide what to do with the numbers!");
    } else {
      return new CalculateArray(calcArray.getWhat(), calcArray);
    }

  }
 // eg. /arrays with {"what": "sum", "numbers": [1,2,5,10]} will respond {"result": 18}
 // eg. /arrays with {"what": "multiply", "numbers": [1,2,5,10]} will respond {"result": 100}
 // eg. /arrays with {"what": "double", "numbers": [1,2,5,10]} will respond {"result": [2,4,10,20]}
}
