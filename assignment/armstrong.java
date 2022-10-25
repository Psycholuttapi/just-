package assignment;

import java.util.*;

public class armstrong {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        for (int i = l1; i < l2; i++) {
            int num = i;

            int sum = 0;
            while (num > 0) {
                int a = num % 10;
                num= num / 10;
                sum = a * a * a + sum;
            }
            if (sum == i)
                System.out.println(i);
            
        }
    }
}
