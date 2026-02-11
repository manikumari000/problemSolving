// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of rooms:");
        int n=s.nextInt();
        System.out.println("enter gold coins");
        int k=s.nextInt();
        int arr[] =new int[n];
        System.out.println("enter coins in each room");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        //here goes our solution 
        int sum=0;
        int first=-1,last=-1;
        int i=0;
       for(int j=0;j<n;j++)
       {
           sum+=arr[j];
          
           while(sum>k && i<=j)
           {
               
               sum-=arr[i];
               i++;
           }
          if(sum==k)
           {
               first=i;
               last=j;
               break;
           }
       }
        System.out.println((first+1)+" "+(last+1));
        
    }
}
