package array;

import java.util.Scanner;

public class check {
    public static void main(String ar[]){
        String str="Computer Science";
        String str1="";
        char chr;
        for(int a=0;a<str.length();a++)
        {
        chr=str.charAt(a);
        if(Character.isUpperCase(str.charAt(a)));
        if(a%2==0)
        str1=str1+Character.toLowerCase(str.charAt(a));
        else
        str1=str1+chr;
        }
        System.out.println(str1);
        
    }
}
