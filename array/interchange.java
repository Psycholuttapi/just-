
package array;

import java.util.*;

public class interchange {

    public static void main(String ar[]) {
        int arr[][]=new int[50][50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
System.out.println("the array is ");
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"  ");

            }
            System.out.println();
        }


        for(int i=0;i<n;i++){
            int temp=arr[i][0];
            arr[i][0]=arr[i][2];
            arr[i][2]=temp;
        }
        System.out.println("Array after interchange ");
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"  ");

            }
            System.out.println();
        }
    }

}
