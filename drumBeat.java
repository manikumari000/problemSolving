//tcs previous year paper

import java.util.*;
class Main {
    public static boolean isEqual(int[] a1,int[] a2)
    {
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]!=a2[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n");
         int n=s.nextInt();
        int[] stu=new int[n];
        for(int i=0;i<n;i++)
        {
            stu[i]=i+1;
        }
        int[] board=new int[n];
        System.out.println("enter board elemnet");
        for(int i=0;i<n;i++)
        {
            board[i]=s.nextInt();
        }
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(board[i]==stu[i])
            {
                k++;
            }
        }
        if(k==n)
        {
            System.out.println(1);
        }
        //real starts from here
        
        int[] res =new int[n];
        int c=0;
        int[] temp=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[i]=stu[i];
        }
        do
        {
            for(int i=0;i<n;i++)
            {
                int num=stu[i];
                res[board[i]-1]=num;
            }
            for(int i=0;i<n;i++)
            {
                stu[i]=res[i];
            }
            c++;
        }while(!isEqual(stu,temp));
        
        System.out.println("no of drum beats are "+c);
      }
}
