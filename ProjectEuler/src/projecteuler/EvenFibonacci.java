/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sachin tripathi
 */
public class EvenFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        String sum="";
        for(int i=0;i<n ;i++){
            sum+=fibonacci(i) + ",";
        } 
        System.out.println(sum);
        
        //sum= sum.substring(0,sum.length());
        System.out.println("sum "+sum);
        String num[]=sum.split(",");
        int temp=0;
        for(int i=0; i<num.length; i++){
            if(i%2==0){
                temp=temp+Integer.parseInt(num[i]); 
            }
        }
        System.out.println(temp);
    }
    
    public static int fibonacci(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else 
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
