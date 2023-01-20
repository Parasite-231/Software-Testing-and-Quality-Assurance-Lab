package Main;

import java.util.ArrayList;

public class FibonacciNumberCheckingOperation {

    static boolean isPerfectSquare(int num)
    {
        int n = (int)(Math.sqrt(num));
        return (n * n == num);
    }

    public static ArrayList<Integer> checkFib(int[] array, double n)
    {
        ArrayList<Integer> fibonacci= new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPerfectSquare(5 * array[i] * array[i] + 4) || isPerfectSquare(5 * array[i] * array[i] - 4)) {
                fibonacci.add(i);
                count++;
            }
        }

        if (count == 0)
            System.out.println("None Present");
        if(n == 0){ throw  new RuntimeException("Number of terms is not specified !");
        }
        if(n > 100){ throw  new RuntimeException("Number of terms is too large !");
        }
        if(n < 0){ throw  new RuntimeException("Number of terms cannot be negative !");
        }
        if(Math.ceil(n)-n!=0){ throw  new RuntimeException("Number of terms cannot be fractional !");
        }

        return fibonacci;
    }
}
