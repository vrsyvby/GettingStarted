package garden.vegetables;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graphs {

    private Map<Integer, List<Integer>> adjacentList = new HashMap<>();

    public void addVertex(int nod1){
        if(!adjacentList.containsKey(nod1)){
            adjacentList.put(nod1, new ArrayList<>());
        }
    }

    public void addEdge(int nod1, int nod2){
        List<Integer> connections= adjacentList.get(nod1);
        connections.add(nod2);
        connections=adjacentList.get(nod2);
        connections.add(nod1);
    }

    public void traversal(){

                for(Map.Entry<Integer, List<Integer>> entries: adjacentList.entrySet()) {
                        System.out.println(entries.getKey()+" "+ entries.getValue().toString());
                }
    }


    public static void main(String[] args){
        Graphs graph= new Graphs();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

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
