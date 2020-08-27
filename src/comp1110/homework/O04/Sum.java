package comp1110.homework.O04;

import java.util.ArrayList;

public class Sum extends ArrayList<Integer> {
    public int sum(){
        int tot = 0;
        for (Integer integer : this) {
            tot += integer;
        }
        return tot;
    }
}
