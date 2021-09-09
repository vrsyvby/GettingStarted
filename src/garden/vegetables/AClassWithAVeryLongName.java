package garden.vegetables;

public class AClassWithAVeryLongName {

    private String name;

    public AClassWithAVeryLongName(){

    }


    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "A Class with a very Long Name{" +
                "name='"+name+'\''+'}';
    }


}
