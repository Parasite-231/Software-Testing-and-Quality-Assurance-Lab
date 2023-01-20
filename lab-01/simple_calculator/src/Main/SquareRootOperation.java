package Main;

import java.text.DecimalFormat;

public class SquareRootOperation {

    private double num1;

    private static final DecimalFormat df = new DecimalFormat("0.0000");

    public SquareRootOperation(double num1){

        this.num1 =  num1;


    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }



    public double getNum1() {
        return num1;
    }



    public double getResult(){
        if(getNum1() >  1000000000)
        {
            throw new RuntimeException("Input number is too much large !");
        }
        if(getNum1() < 0)
        {
            throw new ArithmeticException("Undefined Result !");
        }

        else return Double.parseDouble(df.format(Math.sqrt(getNum1())));

    }


}
