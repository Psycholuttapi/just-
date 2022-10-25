package extend;

import java.util.Scanner;

/**
 * record
 */
public class Record{
  
    String name[]=new String[8];
    int  rnk[]=new int[8];

    Record(){

        for (int i = 0; i < 4; i++) {
            name[i]="";
            rnk[i]=0;
        }
    }

    void readValue(){
        
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i <4; i++) {
            System.out.println("enter the names");
            name[i]=sc.next();
            System.out.println("enter the rank");
            rnk[i]=sc.nextInt();
        }
        sc.close();
       
    }
    void display(){
        System.out.println("The names and ranks are");
        for (int i = 0; i <4; i++) {
            System.out.println(rnk[i]+"\t"+name[i]);
           
        }
    }
}