package array;

import java.util.*;

public class sample1 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[50][50];
        System.out.println("enter the array size ");
        int size = sc.nextInt();
        System.out.println("Enter the array");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j2 = 0; j2 < size; j2++) {

                for (int j = 0; j < size - 1; j++) {

                    if (a[j][i] < a[j + 1][i]) {
                        int temp = a[j][i];
                        a[j][i] = a[j + 1][i];
                        a[j + 1][i] = temp;
                    }
                }
            }
        }

        // for (int i = 0; i < 4; i++) {
        //     for (int k = 0; k< 4; k++) {

        //         for (int j = 0; j < 3; j++) {

        //             if (a[j][i] < a[j + 1][i]) {
        //                 int temp = a[j][i];
        //                 a[j][i] = a[j + 1][i];
        //                 a[j + 1][i] = temp;
        //             }
        //         }
        //     }
        // }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
