/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sachin tripathi
 */
public class LargestPrimeFactor {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        int n = Integer.parseInt(br.readLine());
        List<Integer> primes = listPrimeNumbers(n);
        for(Integer num : primes){
            System.out.print(num + ",");
        }
        System.out.println();
        List<Integer> primefactors = getPrimeFactors(n);
        for(Integer num : primefactors){
            System.out.print(num + ",");
        }
    }
    
    public static List<Integer> listPrimeNumbers(int number){
        List<Integer> primeList = new ArrayList<Integer>();
        int i=1;
        while(i!=number){
            boolean prime = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    prime=false;
                    break;
                }
            } 
            if(prime)
                primeList.add(i);
            i++;
        }
        return primeList;
    }
    
    public static List<Integer> getPrimeFactors(int number){
        List<Integer> factorList = new ArrayList<>();
        int temp = number;
        for(int i=2;i<=temp; i++){
            while(temp%i == 0){
                factorList.add(i);
                temp=temp/i;
            }
        }
        return factorList;
    }
}
