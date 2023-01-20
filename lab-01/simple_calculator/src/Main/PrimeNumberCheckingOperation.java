package Main;

public class PrimeNumberCheckingOperation {

    private double num1;


    public PrimeNumberCheckingOperation(double num1){

        this.num1 =  num1;


    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }



    public double getNum1() {
        return num1;
    }


    public boolean getResult(){

        if(getNum1() > 1000000000000d){
            throw new RuntimeException("Number is too large !");
        }
        if(Math.ceil(getNum1())-getNum1()!=0){
            throw new RuntimeException("Number is not integer !");

        }
        if(getNum1() < 2 && getNum1() > 1){
            throw new RuntimeException("Number is less than 2 !");
        }
        if(getNum1() < 0){
            throw new RuntimeException("Number is a negative number !");
        }
        if(getNum1()<=1)
        {
            return false;
        }
        for(int i=2;i<=getNum1()/2;i++)
        {
            if((getNum1()%i)==0)
                return  false;
        }
        return true;
    }
}
