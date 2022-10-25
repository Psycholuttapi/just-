import java.util.*;
class menu{

    public static void main(String a[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("1.D to B \n2.B to D");
        int ch=sc.nextInt();
        int i=0;
        switch (ch) {
            case 1:
            System.out.println("Enter the decimal number");
           int dec=sc.nextInt();
            int bin[]=new int[100];
            while(dec!=0){
                bin[i]=dec%2;
                dec=dec/2;
                i++;
            }
            for (int j = i-1; j >=0; j--) {
                System.out.print(bin[j]);
            }
                break;
                case 2:
                System.out.println("Enter the binary number");
                int b=sc.nextInt();
                double dec1=0;
                while(b!=0){
                    dec1=dec1+(b%10)*Math.pow(2,i);
                    b=b/10;
                    i++;
                }
                System.out.println(dec1);
                break;
            default:
            System.out.println("wrong choice");
                break;
        }
        sc.close();
    }
}