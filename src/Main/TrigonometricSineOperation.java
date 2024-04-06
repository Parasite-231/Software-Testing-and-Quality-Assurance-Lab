package Main;

import java.text.DecimalFormat;

public class TrigonometricSineOperation {

    private double num1;

    private static final DecimalFormat df = new DecimalFormat("0.0000");

    public TrigonometricSineOperation(double num1){

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

        else return  Double.parseDouble(df.format(Math.ceil(Math.sin(getNum1()))));

    }

}
