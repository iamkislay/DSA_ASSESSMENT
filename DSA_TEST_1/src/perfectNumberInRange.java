import java.io.*;
import java.util.*;
public class perfectNumberInRange {
	 public static ArrayList<Integer> perfect(int n) {
	     if(n==1){
	         ArrayList<Integer> result=new ArrayList<Integer>();
	         result.add(1);
	         return result;
	     }
	     ArrayList<Integer> result=new ArrayList<Integer>();
	     result =  perfect(n-1);
	     
	     if(n==isPerfect(n,1,0)){
	         result.add(n);
	     }
	     return result;
	 }

	    
	 public static long isPerfect(int n,int i,long sum) {
	        // your solutions goes here..
		    
	        if(i>n/2) {
	        	return 0;
	        }
	        if(n%i==0)
	        	sum=isPerfect(n,i+1,sum)+i;
	        
	        return sum;
	    }
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 
	        // Reading N and K
	        String str = bufferedReader.readLine().trim();
	        int n = Integer.parseInt(str);
	        
	       
	        System.out.println(perfect(n));
	    }

}
