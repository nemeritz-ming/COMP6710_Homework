package comp1110.homework.J14;

import java.util.*;

public class Cost {
    public List<Integer> res = new ArrayList<>();
    public ArrayList<Item> al= new ArrayList<>();
    public static class Item implements Comparable<Item>{
        String name;
        int cost;   // in cents
        public Item(String n, int c) {
            this.name = n;
            this.cost = c;
        }
        public String toString() {
            return name + " " + cost;
        }
        @Override
        public int compareTo(Item x) {
            if(cost == x.cost){
                for(int k = 0; k < Math.min(x.name.length(),name.length());k++) {
                    if (this.name.charAt(k) < x.name.charAt(k)) {return 1; }
                    else if (this.name.charAt(k) > x.name.charAt(k)){return 0;}
                }
            }
            else if(this.cost < x.cost){ return 1;}
            return 0;
        }
    }
    public void addItem(String name, int cost){
        Item New = new Item(name, cost);
        int Size = al.size();
        if (al.size() == 0){al.add(New);}
        else{
            for(int j = 0; j< al.size();++j) {
                if (al.get(j).compareTo(New) == 0){
                    al.add(j,New);
                    break;
                }
            }
            if (Size == al.size()){al.add(New);}
        }
    }
    public void printCost(){
        for (Item item : al) {
            System.out.println(item.toString());
        }
    }
    public void fun(List<Integer> can, int tot, int target){
        if (tot<target){
            for(int i=0; i<can.size();++i){
                tot = tot + can.get(i);
                fun(can.subList(i,can.size()),tot, target);
                if(target - tot > 0){
                    res.add(target - tot);
                }
            }
        }
    }
    public int voucherWaste(int value){
        List<Integer> box = new ArrayList<>();
        for(Item item: al){
            if (item.cost < value){box.add(item.cost);}
        }
        if ((box.size() == 1 && box.get(0) > value) || box.size() == 0){return value;}
        fun(box,0, value);
        return Collections.min(res);
    }
}
