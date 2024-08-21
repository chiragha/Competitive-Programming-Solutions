package geeksforgeeks;

//Input: n = 5, arr[] = {1,2,3,4,5}
 // Output: 2 1 4 3 5

public class WaveArray {
       public static void convertToWave(int n, int[] arr) {
        // code here
        int t = n%2 ==0 ? n-1 : n-2;
        
        for(int i=0; i<=t;){
            int a = arr[i];
            
            arr[i] = arr[i+1];
            arr[i+1] =a;
            i+=2;
        }
    }
}
