
package geeksforgeeks;

import java.util.HashSet;
import java.util.Set;


public class FirstRepeatingElement {
    public static void main(String[] args) {	
		int[] arr = {1,3,2,6,2,8,8,2,11,3,6,22};
		//int[] arr = {1,2,3,4};
		FirstRepeatingElement frn=new FirstRepeatingElement();
		
		System.out.println("First repeating num is : "+frn.FirstRepeatingElement(arr));
	}
    
    public int FirstRepeatingElement(int[] arr){
    	Set<Integer> set= new HashSet<>();
    	int rptNum=-1;
    	for(int i=arr.length-1;i>=0;i--) {
    		 if(set.contains(arr[i])) {
    			  rptNum=arr[i];
    		 }else {
    			 set.add(arr[i]);
    		 }
    	}
    	
    	return rptNum;
	}
}
