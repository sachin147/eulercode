package projecteuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sachin tripathi
 */
public class AmicableNumbers {

    public static void main(String args[]) throws IOException {
        List<Integer> amicableNumbers = new ArrayList<Integer>();
        int amicableSum = 0;
        boolean isAmicableNumber;
        for (int i = 1; i < 10000; i++) {
            int sum1 = amicableFunc(i);
            int sum2 = amicableFunc(sum1);
            if (sum1 == sum1 && i == sum2) {
                amicableSum = amicableSum + sum1 + sum2;
            }
        }
        System.out.println(amicableSum);
    }

    public static int amicableFunc(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return 0;
    }
}
