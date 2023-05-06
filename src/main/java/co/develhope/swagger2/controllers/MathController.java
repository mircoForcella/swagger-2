package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    public String welcomeMathMsg(){
        return " Welcome to Math API controller";
    }

    @GetMapping("/division-info")
    public ArithmeticOperation divisionInfo(){
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.setName("division");
        arithmeticOperation.setMinNumberOfOperands(2);
        arithmeticOperation.setDescription("dividend / divisor = quotient,where dividend is the numerator and divisor is the denominator");
        arithmeticOperation.setProperties(new String[]{"Non-associativity", "Non-commutativity", "Inverse element"});
        return arithmeticOperation;
    }

    @GetMapping("/multiplication")
    public int multiplication(@RequestParam int x, @RequestParam int y){
        return x * y;
    }

    @GetMapping("/square/{n}")
    public int square(@PathVariable int n){
        return n * n;
    }

}
