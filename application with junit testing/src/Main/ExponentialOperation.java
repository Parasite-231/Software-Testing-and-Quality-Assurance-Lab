package Main;

import java.text.DecimalFormat;

public class ExponentialOperation {

    private double num1;

    private static final DecimalFormat df = new DecimalFormat("0.0000");



    public ExponentialOperation(double num1){

        this.num1 =  num1;


    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }



    public double getNum1() {
        return num1;
    }



    public double getResult(){
        if(getNum1() > 1000000000 || getNum1() < -1000000000  ){
            throw new RuntimeException("Input Number is too large !");
        }

        else return Double.parseDouble(df.format(Math.exp(getNum1())));

    }
}
