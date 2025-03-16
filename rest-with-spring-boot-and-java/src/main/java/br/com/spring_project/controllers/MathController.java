package br.com.spring_project.controllers;

import br.com.spring_project.response.MathResponse;
import br.com.spring_project.services.MathServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    MathServices mathServices;

    @RequestMapping("sum/{numberOne}/{numberTwo}")
    public MathResponse sum(@PathVariable("numberOne") String numberOne,
                            @PathVariable("numberTwo") String numberTwo) throws Exception{
        return mathServices.sum(numberOne,numberTwo);
    }

    @RequestMapping("subtract/{numberOne}/{numberTwo}")
    public MathResponse subtract(@PathVariable("numberOne") String numberOne,
                           @PathVariable("numberTwo") String numberTwo) throws Exception{

        return mathServices.subtract(numberOne,numberTwo);
    }

    @RequestMapping("multiply/{numberOne}/{numberTwo}")
    public MathResponse multiply(@PathVariable("numberOne") String numberOne,
                           @PathVariable("numberTwo") String numberTwo) throws Exception{

        return mathServices.multiply(numberOne,numberTwo);
    }

    @RequestMapping("divide/{numberOne}/{numberTwo}")
    public MathResponse divide(@PathVariable("numberOne") String numberOne,
                           @PathVariable("numberTwo") String numberTwo) throws Exception{
        return mathServices.divide(numberOne,numberTwo);
    }

    @RequestMapping("avg/{numberOne}/{numberTwo}")
    public MathResponse average(@PathVariable("numberOne") String numberOne,
                           @PathVariable("numberTwo") String numberTwo) throws Exception{
        return mathServices.avg(numberOne,numberTwo);
    }

    @RequestMapping("squareRoot/{numberOne}/{numberTwo}")
    public MathResponse squareRoot(@PathVariable("numberOne") String numberOne,
                           @PathVariable("numberTwo") String numberTwo) throws Exception{
        return mathServices.sqrt(numberOne,numberTwo);
    }

}
