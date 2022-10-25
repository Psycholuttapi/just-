import java.util.Scanner;

public class magicNo {
    int ar[], n;

    magicNo() {
        n = 0;
        
    }

    magicNo(int nx) {
        n = n+nx;
        ar = new int[150];
    }

    void inputnumber() {
        System.out.println("Enter the number in string");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
sc.close();
    }

    void find() {
        for (int i = 0; i < n; i++) {
            int num = ar[i];
            int num1 = num;
            while (num1 > 9) {
                int sum = num1;
                num1 = 0;
                while (sum > 0) {
                    num1 = sum % 10 + num1;
                    sum = sum / 10;
                }
            }
            if(num1==1)
                System.out.println(num+"is a magic number");
            else
            System.out.println(num+"is not a magic number");
        }

    }
    public static void main (String arg[]){
        magicNo sc=new magicNo(9);
        
        sc.inputnumber();
        sc.find();
    }
}
