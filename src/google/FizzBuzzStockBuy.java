package google;/*
package google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzzStockBuy {
    public static void main(String[] args) {
        Model input1 = new Model("Fizz","Alice",5);
        Model input2 = new Model("Buzz","Bob",3);
        Model input3 = new Model("Buzz","Catherine",4);
        Model input4 = new Model("Fizz","Alice",4);
        Model input5 = new Model("Buzz","Bob",2);

        List<Model> list = new ArrayList<>();
        fizzBuzz(list);

    }

}

public static void fizzBuzz(List<Model> list){
    Map<String,Model> fizzMap = new HashMap<>();
    Map<String,Model> buzzMap = new HashMap<>();

    for(Model item: list){
        if(item.type.equals("Fizz"))
            fizzMap.put(item.name,item);
        else
            buzzMap.put(item.name,item);
    }

    for(int i=0;i<buzzMap.size();i++){
       Model fizzItem =  fizzMap.get(i);
       Model buzzItem =  buzzMap.get(i);
       int resultFizzItem = fizzItem.quantity-buzzMap.get(i).quantity;
       fizzItem.quantity=resultFizzItem;
    }

}

class Model {
    String type;
    String name;
    int quantity;

    Model(String type,String name,int quantity){
        this.type=type;
        this.name=name;
        this.quantity=quantity;
    }
}
*/
