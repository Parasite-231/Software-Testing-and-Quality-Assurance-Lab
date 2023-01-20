package Main;

import java.text.DecimalFormat;

public class DivisionOperation {
    private double num1;
    private double num2;
    private static final DecimalFormat df = new DecimalFormat("0.0000");

    public DivisionOperation(double num1, double num2){

        this.num1 =  num1;
        this.num2 = num2;

    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult(){
        if(getNum1() > 1000000000 || getNum2() > 1000000000 || getNum1() < -1000000000 || getNum2() < -1000000000 ){
            throw new RuntimeException("Input Number is too large !");
        }

        if(getNum2() == 0){

            throw new ArithmeticException("Undefined Result !");
        }
        if(getNum1() == 0 && getNum2() == 0){

            throw new ArithmeticException("Undefined Result !");
        }

        else return Double.parseDouble(df.format(getNum1()/getNum2()));

    }

}
