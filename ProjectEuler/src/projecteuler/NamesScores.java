/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Sachin tripathi
 */
public class NamesScores {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sachin tripathi\\Downloads\\p022_names.txt"));
        String letters[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        List<String> letterlist = Arrays.asList(letters);
        StringBuilder sb = null;
        try {
            sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
        } finally {
            br.close();
        }
        String names[] = sb.toString().split(",");
        Arrays.sort(names);
        for(String x : names) {
            int wordsum = 0;
            System.out.println(x);
            for(int i=0;i < x.length();i++){
                if(letterlist.contains(String.valueOf(x.charAt(i)))){
                    wordsum = wordsum + letterlist.indexOf(String.valueOf(x.charAt(i)));
                }
            }
            System.out.println(wordsum);
        }
    }
}
