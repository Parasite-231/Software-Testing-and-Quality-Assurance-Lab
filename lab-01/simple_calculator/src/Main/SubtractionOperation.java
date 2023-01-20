package Main;

public class SubtractionOperation {

    private double num1;
    private double num2;

    public SubtractionOperation(double num1, double num2){

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
        else return getNum1()-getNum2();

    }
}
