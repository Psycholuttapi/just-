package assignment;

import java.util.*;

public class pronic {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit ");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();

        for (int i = l1; i < l2; i++) {

            System.out.println(i + "*" + (i + 1 )+ "= " + i * (i + 1));

        }

    }

}
