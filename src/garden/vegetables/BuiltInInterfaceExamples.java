package garden.vegetables;

import java.util.List;
import java.util.function.*;

class Item{

    private String sku;
    private String description;

    Item(){
        this.sku="21312";
        this.description="sdfadssd";
   }

   Item(String sku){
        this.sku=sku;
        this.description="dsfads";
   }

   Item(String sku, String description){
        this.sku=sku;
        this.description=description;
   }

    protected Item clone(){
        return new Item("sdfad","sdfad");
   }


}


public class BuiltInInterfaceExamples {


    public static void main(String[] args){

        Supplier<Item> s1= Item::new;
        Supplier<Item> s2= ()-> new Item("1234232413");
        UnaryOperator<Item> s3= (s)-> new Item("1234232413","dfasdfads");
        UnaryOperator<Item> s4= Item::clone;

        BiFunction<String,String,Item> bifunction1= (s,t)-> new Item(s,t);
        Consumer<List>s6= s-> s.add(new Item("asdfds","adsfsadsdfasd"));
        Predicate<List> s7= s-> s.add(new Item("sdfasd","sdfasdsd"));







    }


}
