package garden.vegetables;

import java.util.ArrayList;
import java.util.List;

class Nod{
    int value;
    Nod left;
    Nod right;

    Nod(int value){
        this.value= value;
        this.left=null;
        this.right=null;
    }
}

public class BST {

    Nod root;
    int length;

    public void insert(int value){
        Nod node= new Nod(value);
        if(this.length==0){
            root= node;
        }else{
            Nod element= root;

            while(true){

                if(value<element.value){
                    if(element.left==null){
                        element.left=node;
                        break;
                    }
                    element= element.left;

                  //  System.out.println("left"+element);
                }else{
                    if(element.right==null){
                        element.right=node;
                        break;
                    }
                    element= element.right;
                }



            }



           // System.out.println(element);
        }


        this.length++;
    }

    private void traversal(Nod element){
        if(element!=null){
            System.out.print(element.value+" ");
            traversal(element.left);
            traversal(element.right);

        }


    }

    public void traversal(){

        traversal(root);

    }

    public boolean lookup(int value){

        Nod element= root;
        while(true){
            if(element!=null){
                if(element.value==value){
                    return true;

                }else if(element.value<value){
                    element=element.right;
                }else{
                    element=element.left;
                }
            }else{
                return false;
            }



        }


    }

    public boolean remove(int value){

//        search for v
//
//        if v is a leaf
//
//        delete leaf v
//
//else if v has 1 child
//
//        bypass v
//
//else replace v with successor


        Nod currentNode= root;
        Nod parentNode=null;
        while(currentNode!=null){
            if(currentNode.value==value){

                if(currentNode.left==null && currentNode.right==null) {

                    if (parentNode.value < value) {
                        parentNode.right = null;
                    } else {
                        parentNode.left = null;
                    }
                    return true;
                }else if(currentNode.left==null || currentNode.right==null){

                    currentNode= currentNode.left==null?currentNode.right:currentNode.left;

                    if(parentNode==null){
                        root=currentNode;
                    }else {
                        if (parentNode.value < value) {
                            parentNode.right = currentNode;

                        } else {
                            parentNode.left = currentNode;
                        }
                    }

                }else{
                    Nod holdingnode= currentNode.right;
                    Nod leftNode= currentNode.right.left;
                    while(leftNode!=null && leftNode.left!=null){
                        leftNode=leftNode.left;
                    }
                    if(leftNode!=null){
                        currentNode.right.left=null;
                        if(parentNode==null){
                            Nod left= root.left;
                            Nod right= root.right;
                            root=leftNode;
                            leftNode.left=left;
                            leftNode.right=right;
                            return true;
                        }
                        if(parentNode.value<value){
                            parentNode.right=leftNode;
                        }else{
                            parentNode.left=leftNode;
                        }
                        leftNode.right=holdingnode;
                    }else{
                        if(parentNode==null){
                            Nod left= root.left;
                            root= root.right;
                            root.left=left;
                            return true;
                        }

                        if(parentNode.value<value){
                            parentNode.right=holdingnode;

                        }else{
                            parentNode.left=holdingnode;
                        }

                        holdingnode.left=currentNode.left;

                    }
                   return true;
                }


         }else if(currentNode.value<value){
                parentNode=currentNode;
                currentNode= currentNode.right;
            }else{
                parentNode=currentNode;
                currentNode= currentNode.left;
            }
     }

        return false;

    }

    public boolean breadthFristSearch(){

        /*
         problems:
         1.)   9
             4   20
          1   6 15  170

            2.)   go from completing all nodes from level0->1->2, left to right

         */


        Nod[] queue= new Nod[this.length];
        int pointer=0;
        int queueindex=0;
        Nod currentNode= root;
        queue[queueindex]=currentNode;
        while(pointer<this.length){

            currentNode=queue[pointer];
            System.out.println(currentNode.value);
            if(currentNode.left!=null){
                queue[++queueindex]=currentNode.left;
            }

            if(currentNode.right!=null){
                queue[++queueindex]=currentNode.right;
            }

            ++pointer;
          //  System.out.println(pointer);


        }



        return false;


    }

    void breadthFristSearchRecursively( Nod[] queue, int queueindex, int position){

        if(position==this.length){
           return ;
        }
        Nod currentNode= queue[position];
        System.out.println(currentNode.value);



        if(queueindex<this.length-1){
            queue[++queueindex]=currentNode.left;
            queue[++queueindex]=currentNode.right;

        }


        position++;
        breadthFristSearchRecursively(queue,queueindex,position);
    }


    void breadthFristSearchRecursively(){


        /*

         1.) solve BFS recursively.
         2.)   9
             4   20
          1   6 15  170

        3.)   go from completing all nodes from level0->1->2, left to right

         // Base function


        //        breadthFristSearchRecursively(currentNode.left);
        //        breadthFristSearchRecursively(currentNode.right);--> this will make it DFS

                //recursive call

         */

        Nod[] queue= new Nod[this.length];

        int pointer=0;
        int queueindex=0;

        queue[queueindex]=root;
        breadthFristSearchRecursively(queue, queueindex,pointer);







    }




    /**
     *       9
     *   4     20
     * 1  6  15  170
     *
     *
     * InOrder[1,4,6,9,15,20,170]
     * PreOrder[9,4,1,6,20,15,170]
     * PostOrder[1,6,4,15,170,20,9]
     *
     * inorder traversal for DFS
     *
     */

     void dFSInorder(Nod currentNode, List<Integer> values){

         if(currentNode.left!=null){
             dFSInorder(currentNode.left,values);
         }
         values.add(currentNode.value);
         if(currentNode.right!=null){
             dFSInorder(currentNode.right,values);
         }


    }


    void dFSPreOrder(Nod currentNode, List<Integer> values){
        values.add(currentNode.value);
        if(currentNode.left!=null){
            dFSPreOrder(currentNode.left,values);
        }

        if(currentNode.right!=null){
            dFSPreOrder(currentNode.right,values);
        }


    }

    void dFSPostOrder(Nod currentNode, List<Integer> values){

        if(currentNode.left!=null){
            dFSPostOrder(currentNode.left,values);
        }

        if(currentNode.right!=null){
            dFSPostOrder(currentNode.right,values);
        }

        values.add(currentNode.value);
    }






    public static void main(String[] args){

        BST bst = new BST();
        System.out.println(bst.lookup(6));
        System.out.println(bst.lookup(9));
        bst.insert(9);
        bst.insert(20);
        bst.insert(4);
        bst.insert(1);
        bst.insert(6);
        bst.insert(15);
        bst.insert(170);
        bst.traversal();

        System.out.println(bst.lookup(170));
        System.out.println(bst.lookup(190));
        System.out.println(bst.lookup(390));
        System.out.println(bst.lookup(6));
       // System.out.println(bst.remove(1));
        //System.out.println(bst.remove(4));
        //System.out.println(bst.remove(20));
//        System.out.println(bst.remove(9));
//        bst.traversal();
//         System.out.println(bst.remove(1));
//        bst.traversal();
//        System.out.println(bst.remove(4));
//        bst.traversal();
//        System.out.println(bst.remove(20));
//        bst.traversal();

        System.out.println("--------------------------------");
        bst.breadthFristSearch();
        System.out.println("--------------------------------");
        bst.breadthFristSearchRecursively();
        List<Integer> values= new ArrayList<>();
        bst.dFSInorder(bst.root, values);
        System.out.println("--------------------------------");
        values.forEach(System.out::println);
        List<Integer> values1= new ArrayList<>();
        bst.dFSPreOrder(bst.root, values1);
        System.out.println("--------------------------------");
        values1.forEach(System.out::println);

        List<Integer> values2= new ArrayList<>();
        bst.dFSPostOrder(bst.root, values2);
        System.out.println("--------------------------------");
        values2.forEach(System.out::println);

        //9
      //4  20
    //1 6 15 170

    }
}
