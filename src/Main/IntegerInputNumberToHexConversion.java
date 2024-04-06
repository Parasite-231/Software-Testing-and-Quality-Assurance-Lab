package Main;

public class IntegerInputNumberToHexConversion {

    private double num1;


    public IntegerInputNumberToHexConversion(double num1){

        this.num1 =  num1;


    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }



    public double getNum1() {
        return num1;
    }



    public String getResult(){
        if(getNum1() < 0 ){
            throw new RuntimeException("Input number cannot be negative !");
        }
        if(getNum1() > 1000 ){
            throw new ArrayIndexOutOfBoundsException("Input number is too much large !");
        }
        if(Math.ceil(getNum1())-getNum1()!=0){ throw  new RuntimeException("Input number cannot be fractional !");
        }

        return  Integer.toHexString(Math.toIntExact((long) getNum1()));

    }
}
