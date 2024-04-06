package Main;

import java.text.DecimalFormat;

public class LogOperation {

    private double num1;

    private static final DecimalFormat df = new DecimalFormat("0.0000");



    public LogOperation(double num1){

        this.num1 =  num1;


    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }



    public double getNum1() {
        return num1;
    }



    public double getResult(){

        if(getNum1() <= 0 ){
            throw new ArithmeticException("Undefined Result !");
        }
        if(getNum1() > 2000000000 ){
            throw new RuntimeException("Input number is too much large !");
        }



        return Double.parseDouble(df.format(Math.log(getNum1())));

    }
}
