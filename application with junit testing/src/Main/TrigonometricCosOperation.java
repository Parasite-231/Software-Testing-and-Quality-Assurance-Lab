package Main;

import java.text.DecimalFormat;

public class TrigonometricCosOperation {
    private double num1;

    private static final DecimalFormat df = new DecimalFormat("0.0000");

    public TrigonometricCosOperation(double num1){

        this.num1 =  num1;


    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }



    public double getNum1() {
        return num1;
    }



    public double getResult(){
        if(getNum1() > 200 || getNum1() < -200 ){
            throw new RuntimeException("Input Number is too large !");
        }
        else return   Double.parseDouble(df.format(Math.floor(Math.cos(getNum1()))));


    }
}
