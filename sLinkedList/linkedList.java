package sLinkedList;

public class linkedList {
    node head;
    node tail;
    
    void addNode(int data){
        node oj=new node(data);

        if (head==null) {
            head=oj;
        }else{
            tail.next=oj;
        }
        tail=oj;
    }
    void display(){
        if (head==null) {
            System.out.println("empty");
        }
        else{
            node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    void delete(int num){
        if (head==null) {
            System.out.println("It's empty");
        }
        else if(head.data==num){
            node temp=head;
            
            head=temp.next;
        }
        else{
            node temp=head;
            
            head=temp.next;
            while (temp!=null) {
                
                if (temp.data==num) {
                    break;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        linkedList ob = new linkedList();
        ob.addNode(32);
        ob.addNode(43);
        ob.addNode(23);
        ob.display();
        
    }
}
