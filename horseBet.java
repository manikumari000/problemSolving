// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of horses");
        int n=s.nextInt();
        System.out.println("enter k value");
        int k=s.nextInt();
        int arr[] =new int[n];
        System.out.println("enter each horse bet price");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        //here goes our solution 
        int sum=0;
       int max=0;
       int i=0;
       for(int j=0;j<n;j++)
       {
           sum+=arr[j];
           while(i<=j && sum>=k)
           {
               sum-=arr[i];
               i++;
           }
               max=Math.max(max,j-i+1);
           
           
       }
       System.out.println("max no of horses is "+max);
    }
}
