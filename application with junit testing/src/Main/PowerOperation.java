package Main;

import java.text.DecimalFormat;

public class PowerOperation {

    private double num1;
    private double num2;
    private static final DecimalFormat df = new DecimalFormat("0.0000");

    public PowerOperation(double num1, double num2){

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
        if(getNum1() > 10 || getNum2() > 9)
        {
            throw new RuntimeException("Input number is too much large !");
        }
        if(getNum1() == 0 && getNum2() == 0)
        {
            throw new ArithmeticException("Undefined Result !");
        }
        else return Double.parseDouble(df.format(Math.pow(getNum1(), getNum2())));

    }
}
