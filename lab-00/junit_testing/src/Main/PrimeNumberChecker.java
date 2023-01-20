package Main;

public class PrimeNumberChecker {

    public static boolean isTheNumberPrime(double numberToBeChecked){


        if(numberToBeChecked > 1000000000000d){
            throw new RuntimeException("Number is too large!");
        }
        if(Math.ceil(numberToBeChecked)-numberToBeChecked!=0){
            throw new RuntimeException("Number is not integer!");

        }
        if(numberToBeChecked < 2 && numberToBeChecked > 0){
            throw new RuntimeException("Number is less than 2!");
        }
        if(numberToBeChecked < 0){
            throw new RuntimeException("The number is a negative number!");
        }
        if(numberToBeChecked<=1)
        {
            return false;
        }
        for(int i=2;i<=numberToBeChecked/2;i++)
        {
            if((numberToBeChecked%i)==0)
                return  false;
        }
        return true;
    }
}
