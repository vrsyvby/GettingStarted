package garden.vegetables;

public class Queue {

    String value;
    Node first;
    Node last;
    Integer length;

    public Queue(){
        this.value=value;
        this.first=null;
        this.last
                =null;
        this.length=0;
    }

    public Node peek(){
        return this.first;
    }

    public Queue enqueue(String value){
        Node newNode= new Node(value);
        if(this.length==0){
            this.first=newNode;
            this.last=newNode;
        }else{
           this.last.next= newNode;
           this.last=newNode;
      }

        this.length++;
        return this;
    }

    public Queue dequeue(){
        Node  holdingNode= this.first;
        this.first= this.first.next;
        return this;
    }

    public String toString(){
        Node currentNode= this.first;
        String out="";
        while(currentNode!=null){
            out+= " value: "+currentNode.value+ " next node: ";
            currentNode=currentNode.next;
        }

        return out;
    }

    public static void main(String[] args){

        Queue queue= new Queue();
        queue.enqueue("10") ;
        queue.enqueue("20") ;
        queue.enqueue("30") ;
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
    }

}
