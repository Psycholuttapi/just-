package linkedList;

import java.util.Scanner;

public class node {
    int data;
    node link;

    node() {
        data = 0;
        link = null;
    }

    void create() {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first data");
        this.data = in.nextInt();
        System.out.println("Enter the number of node");
        n = in.nextInt();
        node temp;
        node ptr = this;
        for (int i = 1; i <=n; i++) {
            temp = new node();
            System.out.println("Enter the data");
            temp.data = in.nextInt();
            temp.link = null;
            ptr.link = null;
            temp = null;
            ptr = ptr.link;

        }
    }

    void display() {
        node ptr=this;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.link;
        }
    }
    public static void main(String ar[])
    {
        node oj=new node();
        oj.create();
        oj.display();
    }

}
