/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sachin tripathi
 */
public class HighlyDivisibleTriangular {
    public static void main(String args[]) throws IOException {
        List<Integer> triangularNumber = new ArrayList<>();
        int sum;
        for(int i=1; i <= 10; i++) {
            sum = 0;
            for(int j = 1; j <= i ;j++) {
                sum = sum + j;
            }
            triangularNumber.add(sum);
        }
        System.out.println(triangularNumber);
        
        int x = getPrimeFactors(triangularNumber);
        System.out.println(x);
        
    }
    
    public static int getPrimeFactors(List<Integer> triangularnumbers){
        List<Integer> factorList = new ArrayList<>();
        
        for(int j = 0; j < triangularnumbers.size(); j++) {
            int temp = triangularnumbers.get(j);
            for(int i = 2;i <= temp; i++){
                while(temp%i == 0){
                    factorList.add(i);
                    temp=temp/i;
                }
            }
            if(factorList.size() > 5) {
                return triangularnumbers.get(j);
            }
        }
        return 0;
    }
}
