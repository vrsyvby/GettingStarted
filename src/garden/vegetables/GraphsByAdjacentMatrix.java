package garden.vegetables;

import java.util.HashMap;
import java.util.Map;

public class GraphsByAdjacentMatrix {

    int[][] adjacentmatrix= new int[7][7];
    Map<Integer,Integer> vertices= new HashMap<>();
    int count=0;
    GraphsByAdjacentMatrix(){
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                adjacentmatrix[i][j]=0;
            }
        }
    }

    public void addVertex(int nod1){

        vertices.put(nod1,count++);

    }

    public void addEdge(int nod1, int nod2){
        int indx1=vertices.get(nod1);
        int indx2=vertices.get(nod2);
        adjacentmatrix[indx1][indx2]=1;
        adjacentmatrix[indx2][indx1]=1;
    }

    public void traversal(){
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(adjacentmatrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        GraphsByAdjacentMatrix graph= new GraphsByAdjacentMatrix();
        graph.addVertex(0);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(1);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.traversal();


    }
}
