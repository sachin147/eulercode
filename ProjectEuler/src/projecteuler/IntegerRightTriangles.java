package projecteuler;

import java.io.IOException;

public class IntegerRightTriangles {
	public static void main(String args[]) throws IOException {
		long result = 0, resultSolutions = 0;
		 
		for (long p = 2; p <= 1000; p += 2) {
		    int numberOfSolutions = 0;
		    for (long a = 2; a < (p/3); a++) {
		          if(p*(p-2*a) % (2*(p-a)) == 0){
		              numberOfSolutions++;
		          }
		      }
		      if(numberOfSolutions > resultSolutions){
		        resultSolutions = numberOfSolutions;
		        result = p;
		    }
		}
		System.out.println(result);
	}
}
