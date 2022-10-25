import java.util.*;
class menu{

    public static void main(String a[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("1.D to B \n2.B to D");
        int ch=sc.nextInt();
        int dec=0,bin1;
        String bin="";
        double sum=0.0;
        switch (ch) {
            case 1:
            System.out.println("Decimal number");
            String bin2="";       
            dec=sc.nextInt();
            while(dec>0){
                bin=bin+ dec%2;
                dec=dec/2;
            }
            for (int i = bin.length()-1; i >=0 ; i--) {
                bin2=bin2+bin.charAt(i);
            }
            System.out.println("the binary number"+bin2);
                break;
                case 2:
                System.out.println("binary number");
                bin1=sc.nextInt();
                dec=0;
                int n=0;
                while(bin1!=0){
                    int temp=bin1%10;
                    sum=sum+temp*Math.pow(2,n);
                    bin1=bin1/10;
                    n=n+1;
                }
                System.out.println(" the decimal number is"+sum);
                break;
            default:
            System.out.println("wrong choice");
                break;
        }sc.close();
    }
}