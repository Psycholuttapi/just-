import java.util.Scanner;

public class rotate {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the limit of array");
        int lim=sc.nextInt();
        int arr[]=new int[lim];
        
        System.out.println("enter the array");
        for (int i=0;i<lim;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
}
