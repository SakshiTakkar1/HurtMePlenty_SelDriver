package com.epam.com.Service;

import com.epam.com.model.Calculator;

import java.io.IOException;

public class CalculatorModel {

    public static final String NUMBER_OF_INSTANCES = "testData.valueOfNumberOfInstances";

    Calculator calculator;
    public Calculator getCalculatorData() throws IOException {
        System.out.println(TestDataReader.getTestData(NUMBER_OF_INSTANCES));
        calculator = new Calculator(TestDataReader.getTestData(NUMBER_OF_INSTANCES));
        //calculator.setNumberOfInstances( PropertyReader.readProperty(NUMBER_OF_INSTANCES));
        return calculator;

    }

//    public static void main(String[] args) throws IOException {
//        System.out.println(new CalculatorModel().getCalculatorData().getNumberOfInstances());
//    }

}
