import java.util.Scanner;

public class binary {
    public static void main (String ar[]){
        int arr[]=new int[5];
        Scanner sc=new Scanner (System.in);
        System.out.println(" enter the array");
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number to be serched");
        int scr=sc.nextInt();
        int mid=0,flag=0;

        int f=0,l=4;
        while (f<=l) {
        mid=(f+l)/2;
        if (arr[mid]<scr ) {
            f=mid+1;
            
        }else if (arr[mid]>scr) {
            l=mid-1;
        }else{
            flag=1;
            break;
        }
        }
        if(flag==1){
            System.out.println("the number is found at"+mid);

        }else{
            System.out.println("the number is not found");
        }
        sc.close();
    }
}
