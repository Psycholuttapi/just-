package assignment;

import java.util.*;

public class magic {
    
        public static void main(String ar[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter the range");
            int r1=sc.nextInt();
            int r2=sc.nextInt();
            System.out.println("It is a magic number ");
            for (int i = r1; i < r2; i++) {
                
            
            int num = i;
            int sum;
            while (num > 9) {
                sum=num;
                num=0;
                while (sum > 0) {
                    num=sum%10+num;
                    sum=sum/10;
                }
            } 
            if(num==1)
            System.out.println(i);
            
        }
    }
}
