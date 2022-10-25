import java.util.*;
class magic{
    public static void main (String ar[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
sc.close();
        while(num>9){
            int num1=num,sum=0;
            while(num1>0){
                sum=sum+num1%10;
                num1=num1/10;
            }
            num=sum;
        }
        if(num==1){
            System.out.println("it is a magic number");
        }else{
            System.out.println(" it is not a magic number");
        }
    }
}