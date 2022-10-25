package extend;

public class rank extends Record {
    int index;
    rank(){
        super();
        index=0;
    }
    void highest(){
        for (int i = 1; i<4; i++) {
            if (rnk[index]>rnk[i]){
                index=i;
            }
        }
    }
    void display (){
        super.display();
        System.out.println(rnk[index]+"  rank\t"+name[index]);
    }
    public static void main (String ar[]){
        
        
        rank ob=new rank();
        ob.readValue();
        ob.highest();
        ob.display();


    }
}
