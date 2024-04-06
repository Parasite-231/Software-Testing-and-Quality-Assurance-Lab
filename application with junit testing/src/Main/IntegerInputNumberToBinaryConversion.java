package Main;

public class IntegerInputNumberToBinaryConversion {

    private double num1;


    public IntegerInputNumberToBinaryConversion(double num1){

        this.num1 =  num1;


    }

    public void setNum1(long num1) {
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

        else return  Integer.toBinaryString(Math.toIntExact((long) getNum1()));

    }

}
