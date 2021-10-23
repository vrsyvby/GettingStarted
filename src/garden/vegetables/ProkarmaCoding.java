package garden.vegetables;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
    String id;
    String name;
    Employee(String id, String name){
        this.id=id;
        this.name=name;
    }

    public int hashCode(){

       return 1;
    }


    public boolean equals(Employee e1){
        if(this.hashCode()==e1.hashCode()){
            return true;
        }
        else if (e1.id==this.id && e1.name==this.name ){
            return true;
        }

        return false;
    }
}
public class ProkarmaCoding {

    public static void main(String args[]){


    }
}
