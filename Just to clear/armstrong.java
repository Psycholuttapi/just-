import java.util.*;

public class armstrong {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int num1=num;
        sc.close();
        while(num>0){
            int a=num%10;
            num=num/10;
            sum=a*a*a+sum;
        }
        if(sum==num1)
        System.out.println("it is armstrong");
        else
        System.out.println(" not a armstrong");
    }
    
}
