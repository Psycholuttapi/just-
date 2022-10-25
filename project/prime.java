package project;

import java.util.Scanner;

public class prime {
    boolean check(int n[])
    {
        int c=0;
        for (int i = 0; i < n.length; i++) {
            int temp=n[i];
            for (int j = 2; j < temp; j++) {
                if(temp%j!=0)
                {
                 c++;
                 break; 
                }
            }
            if(c==2&&temp<7)
            {
                return true;
            }
        }
        return false;
    }
    void display(int arr[]){
        System.out.println("the display part start from here");
        boolean br=check(arr);
        System.out.println(br);
        if(br==false)
        {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]+"fdgs");
            }
        }
        else
        {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]<7&&arr[i]==arr[j])
                    {
                        arr[j]=0;

                    }
                    
                }
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        
        prime oj=new prime();
        System.out.println("Enter the limit");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        oj.display(arr);
    }
}
