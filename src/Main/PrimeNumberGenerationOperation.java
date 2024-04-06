package Main;

import java.util.ArrayList;

import static java.sql.Types.NULL;

public class PrimeNumberGenerationOperation {



    public static ArrayList <Integer> firstNPrimes(int n) {
        int ncounter = 0;
        int isPrime = 2;
        ArrayList<Integer> primes= new ArrayList<Integer>();
        while (ncounter < n) {
            boolean prime = true;
            for (int j = 2; j < isPrime; j++) {
                if (isPrime % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes.add(isPrime);
                ncounter++;
            }
            isPrime++;
        }
        if(n == NULL){
            throw new ArrayIndexOutOfBoundsException("Array Length is not specified correctly !");
        }
        if(n <= 0){
            throw new ArrayIndexOutOfBoundsException("Array Length is not specified correctly !");
        }
        if(n > 50 ){
            throw new ArrayIndexOutOfBoundsException("Array Length is not specified correctly !");
        }
        return primes;
    }


}
