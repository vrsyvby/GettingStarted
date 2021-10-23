package garden.vegetables;

import java.util.ArrayList;
import java.util.List;


class Edges{
    int nod1;
    int nod2;

    Edges( int nod1, int nod2){
        this.nod1= nod1;
        this.nod2=nod2;
    }
    public boolean equals(Edges o2){
        if(this.nod1==o2.nod1 && this.nod2==o2.nod2) return true;
        return false;
    }

    public String toString(){
        return "["+nod1+" , "+nod2+"]";
    }
}
public class GraphsByEdgeList {

    List<Edges> edgelist= new ArrayList<>();

    public void addEdge(int nod1, int nod2){
        Edges edges= new Edges(nod1, nod2);
        if(!edgelist.stream().filter(edge-> edge.equals(edges)).findFirst().isPresent()){
            edgelist.add(edges);
        }
    }

    public void traversal(){
        edgelist.forEach(System.out::println);
    }

    public static void main(String[] args){
        GraphsByEdgeList graph= new GraphsByEdgeList();
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(0,1);
        graph.traversal();


    }
}
