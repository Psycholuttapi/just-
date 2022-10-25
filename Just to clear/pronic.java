import java.util.Scanner;

public class pronic {
    public static void main (String ar[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter any number");
        int num=sc.nextInt(),flag=0;
sc.close();
        for(int i=0;i<=num/2;i++)
        {
            if (i*(i+1)==num) {
                System.out.println("the number is pronic");
                flag=1;
                break;
            }
        }
        if (flag!=1) {
            System.out.println("the number is not pronic");
        }
    }
    
}
