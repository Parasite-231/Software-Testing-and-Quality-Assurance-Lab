package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        AdditionOperation sum = new AdditionOperation(2,3);
        System.out.println("Addition Operation : "+ sum.getResult());

        SubtractionOperation subtract = new SubtractionOperation(2,3);
        System.out.println("Subtraction Operation : "+ subtract.getResult());

        MultiplicationOperation multiply = new MultiplicationOperation(2,3);
        System.out.println("Multiplication Operation : "+ multiply.getResult());


        DivisionOperation division = new DivisionOperation(4,2);
        System.out.println("Division Operation : "+ division.getResult());


        ModuloOperation moduloOperation = new ModuloOperation(4,2);
        System.out.println("Modulo Operation : "+ moduloOperation.getResult());


        ExponentialOperation exponential = new ExponentialOperation(0);
        System.out.println("Exponential Operation : "+ exponential.getResult());

        PowerOperation powerOperation = new PowerOperation(2,2);
        System.out.println("Power Operation : "+ powerOperation.getResult());

        SquareRootOperation squareOperation = new SquareRootOperation(4);
        System.out.println("Square Operation : "+ squareOperation.getResult());

        LogOperation logOperation = new LogOperation(1);
        System.out.println("Log Operation : "+ logOperation.getResult());

        PrimeNumberCheckingOperation primeNumberCheck = new PrimeNumberCheckingOperation(2);
        System.out.println("Is the input number a Prime Number  : "+ primeNumberCheck.getResult());

        PrimeNumberGenerationOperation primeNumberGeneration = new PrimeNumberGenerationOperation();
        System.out.println("Prime Number generated  : "+ primeNumberGeneration.firstNPrimes(5));

        FibonacciNumberCheckingOperation fibonacciNumberGeneration = new FibonacciNumberCheckingOperation();
        System.out.println("Fibonacci Number generated  : "+ fibonacciNumberGeneration.checkFib(new int[]{4, 2, 8, 5, 20, 1, 40, 13, 23},9));

        IntegerInputNumberToBinaryConversion binary = new IntegerInputNumberToBinaryConversion(4);
        System.out.println("Binary Number  : "+ binary.getResult());

        IntegerInputNumberToHexConversion hexadecimal = new IntegerInputNumberToHexConversion(15);
        System.out.println("Hexadecimal Number  : "+ hexadecimal.getResult());

        TrigonometricSineOperation geometry1 = new TrigonometricSineOperation(90);
        System.out.println("Trigonometric Sine Value  : "+ geometry1.getResult());

        TrigonometricCosOperation geometry2 = new TrigonometricCosOperation(90);
        System.out.println("Trigonometric Cos Value  : "+ geometry1.getResult());

        TrigonometricTanOperation geometry3 = new TrigonometricTanOperation(45);
        System.out.println("Trigonometric Tan Value  : "+ geometry3.getResult());



    }
}
