package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    Map <String, ArrayList<Integer>> Box = new HashMap<>();
    public void addItem(String name, int stock, int price){
        ArrayList<Integer> stockAndPrice = new ArrayList<>();
        stockAndPrice.add(stock);
        stockAndPrice.add(price);
        Box.put(name,stockAndPrice);
    }
    public void addItem(String name, int stock, int price, int rate, int reorderdays){
        boolean in = false;
        for(Map.Entry<String, ArrayList<Integer>> m: Box.entrySet()) {
            if(m.getKey().equals(name)) {
                m.getValue().add(rate);
                m.getValue().add(reorderdays);
                in = true;
            }
        }
        if(!in){
            ArrayList<Integer> stockAndPrice = new ArrayList<>();
            stockAndPrice.add(stock);
            stockAndPrice.add(price);
            stockAndPrice.add(rate);
            stockAndPrice.add(reorderdays);
            Box.put(name,stockAndPrice);
        }
    }
    public int totalStockValue(){
        int res = 0;
        for(Map.Entry<String, ArrayList<Integer>> m: Box.entrySet()) {
            res += m.getValue().get(0)*m.getValue().get(1);
        }
        return res;
    }
    public HashMap reorder(){
        HashMap<String,Integer> reOrder = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> m: Box.entrySet()) {
            if(m.getValue().size() == 4){
                int neededNum = m.getValue().get(2)*m.getValue().get(3) -m.getValue().get(0);
                if (neededNum > 0){
                    neededNum = m.getValue().get(2)*7-m.getValue().get(0);
                    reOrder.put(m.getKey(),neededNum);
                }
            }
        }
        return reOrder;
    }
}
