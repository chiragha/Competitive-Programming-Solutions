package geeksforgeeks;
public class Alterposandnegnum {
    void rearrange(int arr[], int N) {
        // code here
        int[] p=new int[N];int p1=0,s1=0;
        int[] n=new int[N];int n1=0,s2=0;
        for(int i=0;i<N;i++){
            if(arr[i]>=0){
                p[p1]=arr[i];
                s1++;p1++;
            }
            else{
                n[n1]=arr[i];
                s2++;n1++;
            }
        }
              int i=0,j=0,k=0;
           while(i<s1 && j<s2){
               arr[k]=p[i];
               k++;
               arr[k]=n[j];
               k++;
               i++;j++;
           }
           while(i<s1){
               arr[k]=p[i];
               i++;k++;
           }
           while(j<s2){
               arr[k]=n[j];
               j++;k++;
           }
       }
    
}
