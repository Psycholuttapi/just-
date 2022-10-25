package assignment;

import java.util.Scanner;

public class menu {
   static int limit;

   double value(int x,int lim){
        int fac=1;
        double sum=1;
        for (int i = 1; i <lim; i++) {
            fac=fac*i;
            sum=sum+Math.pow(x,i);
        }
        return sum;
    }
    int value(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value X");
        int x=sc.nextInt();
        System.out.println("Enter the limit ");
        limit=sc.nextInt();
        
        return x;
    }

    public static void main(String ar[]){
        menu ob=new menu();
        int x=ob.value();
        double k=ob.value(x,limit);
        System.out.println("the final answer is "+k);
    }
}
