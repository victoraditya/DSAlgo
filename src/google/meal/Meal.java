package google.meal;

import java.util.*;

public class Meal {

    public static void main(String[] args) {
        Map<String,Integer> fridgeSuppliesMap = new HashMap<>();
        fridgeSuppliesMap.put("Chicken",5);
        fridgeSuppliesMap.put("greens",10);
        Fridge fridge = new Fridge(fridgeSuppliesMap);

        Map<String,Integer> itemsNeededMap = new HashMap<>();
        List<Item> itemsNeededList = new ArrayList<>();
        Item item1=new Item("Chicken",5);
        Item item2=new Item("greens",10);

        itemsNeededList.add(item1);
        itemsNeededList.add(item2);

        itemsNeededMap.put("Chicken",5);
        itemsNeededMap.put("greens",11);

        boolean ans = isMeal(fridge,itemsNeededMap);
        System.out.println(ans);



    }

    public static boolean isMeal(Fridge fridge,Map<String,Integer> itemsNeededMap){
        Set<String> quantityNames = itemsNeededMap.keySet();

        for(String quantityName:quantityNames){
            if(fridge.fridgeSuppliesMap.containsKey(quantityName)){
                Integer itemquantity = itemsNeededMap.get(quantityName);
                if(!(itemquantity==fridge.fridgeSuppliesMap.get(quantityName)))
                return false;
             }
        }
        return true;
    }



}

class Fridge{
    Map<String,Integer> fridgeSuppliesMap;

    Fridge(Map<String,Integer> fridgeSuppliesMap){
        this.fridgeSuppliesMap = new HashMap<>(fridgeSuppliesMap);
    }


}

class Item{
    String name;
    Integer quantity;

    Item(String name,Integer quantity){
        this.name=name;
        this.quantity=quantity;
    }
}

// Meal - recipes - items
