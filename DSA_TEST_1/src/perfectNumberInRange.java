import java.io.*;
import java.util.*;
public class perfectNumberInRange {
	 public static ArrayList<Integer> perfect(int n) {
	     if(n==1){
	         ArrayList<Integer> result=new ArrayList<Integer>();
	         //result.add(null);
	         return result;
	     }
	     ArrayList<Integer> result=new ArrayList<Integer>();
	     result =  perfect(n-1);
	     
	     if(n==(int)isPerfect(n,1)){
	         result.add(n);
	     }
	     return result;
	 }

	    
	 public static long isPerfect(int n,int i) {
	        // your solutions goes here..
		 if(i==n/2+1) {
			 return 0;
		 }
		 long sum=isPerfect(n,i+1);
		 if(n%i==0) {
			 sum=sum+i;
		 }
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
