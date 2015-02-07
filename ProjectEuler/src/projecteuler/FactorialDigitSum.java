/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.IOException;

/**
 *
 * @author Sachin tripathi
 */
public class FactorialDigitSum {

    public static void main(String args[]) throws IOException {
        int n = 100;
        double factorial = fact(n);
        System.out.println(factorial);
        double sum = sum(factorial);
        System.out.println(sum);

    }

    private static double fact(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    private static double sum(double sum) {
        double s = sum;
        int temp = 0;
        while(s != 0 ){
            temp = temp + (int)s%10;
            s = s/10;
        }
        return temp;
    }
}
