/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Sachin tripathi
 */
public class SmallestMultiple {
    public static void main(String args[]) throws IOException {
        int num = 20;
        Set<Integer> primeFactorSet = new HashSet<Integer>();
        /*
        while(true) {
            if(num%1==0 && num%2==0 && num%3==0 && num%4==0 && num%5==0 && num%6==0 && num%7==0 && num%8==0 && num%9==90 && num%10==0 && num%11==0 && num%12==0 && num%13==0 && num%14==0 && num%15==0 && num%16==0 && num%17==0 && num%18==0 && num%19==0 && num%20==0 ) 
                break;
            num++;
            System.out.println("increment "+ num);
        }
        System.out.println("number is "+ num);
        */
        for(int i=1; i<=num; i++) {
            int temp = i;
            for(int j=2; j<=temp; j++) {
                while(temp%j == 0){
                    primeFactorSet.add(j);
                    temp = temp/j;
                }
            }
        }
        System.out.println(primeFactorSet);
        Integer fac[] = new Integer[primeFactorSet.size()];
        Iterator<Integer> it = primeFactorSet.iterator();
        int i=0;
        while(it.hasNext()) {
            fac[i] = it.next();
            i++;
        }
        int len = fac.length;
        
        for(int x=1;;x++) {
            boolean check = allDivide(fac,x);
            if(check==true) {
                System.out.println("Smallest Divisible number "+x);
                break;
            }
        }
    }
    
    public static boolean allDivide(Integer fac[], int n) {
        boolean isDivisible = true;
        for(int i=0;i<fac.length;i++) {
            if(n%fac[i]!=0) {
                isDivisible = false;
            }
        }
        return isDivisible;
    }
        
}
