package array;

import java.util.Scanner;

public class caseArrangement {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String store="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                System.out.print(ch);
            }
            else{
            store=store+ch;
        }}
        System.out.print(store);
    }
}
