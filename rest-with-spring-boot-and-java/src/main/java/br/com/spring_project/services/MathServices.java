package br.com.spring_project.services;

import br.com.spring_project.exception.UnsupportedMathOperationException;
import br.com.spring_project.response.MathResponse;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MathServices {

    private static Double value;

    public MathResponse sum(String numberOne, String numberTwo){
        consistir(numberOne, numberTwo);

        value = convertToDouble(numberOne) + convertToDouble(numberTwo);
        return  new MathResponse(new Date(),value);
    }

    public MathResponse subtract(String numberOne, String numberTwo){
        consistir(numberOne, numberTwo);

        value = convertToDouble(numberOne) - convertToDouble(numberTwo);
        return  new MathResponse(new Date(),value);
    }

    public MathResponse multiply(String numberOne, String numberTwo){
        consistir(numberOne, numberTwo);

        value = convertToDouble(numberOne) * convertToDouble(numberTwo);
        return  new MathResponse(new Date(),value);
    }

    public MathResponse divide(String numberOne, String numberTwo){
        consistir(numberOne, numberTwo);

        value = convertToDouble(numberOne) / convertToDouble(numberTwo);
        return  new MathResponse(new Date(),value);
    }

    public MathResponse avg(String numberOne, String numberTwo){
        consistir(numberOne, numberTwo);

        value = (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
        return  new MathResponse(new Date(),value);
    }

    public MathResponse sqrt(String numberOne, String numberTwo){
        consistir(numberOne, numberTwo);

        value = Math.sqrt(convertToDouble(numberOne) + convertToDouble(numberTwo));
        return  new MathResponse(new Date(),value);
    }

    private static void consistir(String numberOne, String numberTwo) {
        if(isNotNumeric(numberOne)){
            throw new UnsupportedMathOperationException("The value: "+ numberOne + " is invalid, input a valid one.");
        }
        if(isNotNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("The value: "+ numberTwo + " is invalid, input a valid one.");
        }
    }

    private Double convertToDouble(String strNumberTwo) {

        if(strNumberTwo == null || strNumberTwo.isEmpty()){
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        String number = strNumberTwo.replace(",", ".");
        return Double.parseDouble(number);
    }

    private static boolean isNotNumeric(String strNumber) {

        if(strNumber == null || strNumber.isEmpty()){
            return true;
        }

        String number = strNumber.replace(",", ".");

        return !number.matches("[+-]?[0-9]*\\.?[0-9]+");

    }
}
