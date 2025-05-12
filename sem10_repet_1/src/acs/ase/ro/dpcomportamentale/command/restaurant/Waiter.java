package acs.ase.ro.dpcomportamentale.command.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<FoodOrder> orderList = new ArrayList<>();

    public void addOrder(FoodOrder order){
        orderList.add(order);
    }

     public void sendOrder(){
         for(FoodOrder order:orderList){
             order.prepare();
         }
         orderList.clear();
     }
}
