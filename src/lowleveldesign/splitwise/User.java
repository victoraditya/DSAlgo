package lowleveldesign.splitwise;/*
package lowleveldesign.splitwise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {

    int id;
    String name;
    List<Map<User,Double>> userExpenseSheet;
    Double totalExpenseSoFar;
    int getUniqueId();

    public void addToUserExpenseSheet(User user,Double value){
        if(this==user) return;

        this.totalExpenseSoFar+=value;
        for(Map<User,Double> newExpense : userExpenseSheet){
            if(newExpense.get(user)==user){

            }
        }
    }

    public int getId() {
        return id;
    }

    User(String name){
        this.name=name;
        this.id=getUniqueId();
        this.totalExpenseSoFar= Double.valueOf(0);
        this.userExpenseSheet= new ArrayList<Map<User,Double>>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<User, Double> getUserExpenseSheet() {
        return userExpenseSheet;
    }

    public void setUserExpenseSheet(Map<User, Double> userExpenseSheet) {
        this.userExpenseSheet = userExpenseSheet;
    }
}
*/
