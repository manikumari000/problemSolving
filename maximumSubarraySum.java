// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int maxSubSum1(int[] arr,int k)
    {
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                    max=Math.max(max,j-i+1);
                    
                }
            }
        }
        return max;
    }
      public static void maxSubSum2(int[] arr,int k)
      {
        int max=Integer.MIN_VALUE,sum=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(hm.containsKey(sum-k))
            {
                max=Math.max(max,i-hm.get(sum-k));
            }
            if(!hm.containsKey(sum))
            {
                hm.put(sum,i);
            }
        }
       System.out.println("optimised version of max sub array sum length is "+max); 
      }
      
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n size");
        int n= s.nextInt();
        int[] arr =new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("enter k value");
        int k=s.nextInt();
       System.out.println("max subarray size is "+ maxSubSum1(arr,k));
        maxSubSum2(arr,k);
    }
}
