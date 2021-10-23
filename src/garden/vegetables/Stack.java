package garden.vegetables;

public class Stack {

    Node top;
    Node bottom;
    Integer length;

    public Stack(){
     this.top
             =null;
     this.bottom=null;
     this.length=0;
    }

    public Stack push(String value){
        Node newNode= new Node(value);
        if(this.length==0){
            this.top= newNode;
            this.bottom= newNode;
       }else{
            Node holdingPointer= this.top;
            this.top= newNode;
            this.top.next=holdingPointer;
        }


        //this.bottom=tempNode;
        this.length++;

        return this;


    }

    public Node peek(){
        return this.top;
    }

    public Node pop(){
        if(this.length==0){
            return null;
        }

        Node holdingpointer= this.top;
        this.top= this.top.next;
        return holdingpointer;
    }

    public String toString(){
        Node currentNode= this.top;
        String out="";
        while(currentNode!=null){
            out+= " value: "+currentNode.value+ " next node: ";
            currentNode=currentNode.next;
        }

        return out;
    }

    public static void main(String args[]){
        Stack sck= new Stack();
        System.out.println(sck.peek());
        sck.push("10");
        System.out.println(sck);
        sck.push("20");
        System.out.println(sck);
        sck.push("30");
        System.out.println(sck);
        System.out.println(sck.peek());
        System.out.println(sck.pop());
        System.out.println(sck);
    }


}
