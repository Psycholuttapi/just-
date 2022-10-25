package array;

import java.util.Scanner;

/**
 * push
 */
public class pushPop {

    int st[] = new int[20];
    int top, n;

    pushPop(int nn) {
        for (int i = 0; i < 20; i++)
            st[i] = 0;
        top = -1;
        n = nn;
    }

    void push(int data) {
        if (top == (n - 1))
            System.out.println("stack overflow");
        else {
            top++;
            st[top] = data;
        }
    }

    void pop() {
        int item;
        if (top == -1) {
            System.out.println("Stack overflow");
        } else {
            item = st[top];
            System.out.println("popped element is" + item);
            top--;

        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            System.out.println("The stack is");
            for (int i = top; i >=0; i--) {
                System.out.println(st[i]);
            }
        }
    }

    public static void main(String ar[]) {
       
        boolean ch = true;
        Scanner sc = new Scanner(System.in);
        
        pushPop ob = new pushPop(5);
        while (ch) {
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
        
            switch (choice) {
                case 1:
                    System.out.println("Enter the data");
                    int num = sc.nextInt();
                    ob.push(num);
                    break;

                case 2:
                    ob.pop();
                    break;

                case 3:
                    ob.display();
                    break;

                case 4:
                    System.exit(0);
                    
                default:
                    System.out.println("wrong choice");
            }
        }
    }

}