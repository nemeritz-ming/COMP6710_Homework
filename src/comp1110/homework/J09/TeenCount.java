package comp1110.homework.J09;



import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class TeenCount {
    private static boolean applyPredicate(int value, IntPredicate predicate) {
        return predicate.test(value);}
    public static int[] teenLess(int[] array){
        List<Integer> num = new ArrayList<>();
        for (int k : array) {
            if (applyPredicate(k, x -> x >= 19) || applyPredicate(k, x -> x < 13)) {
                num.add(k);
            }
        }
        int[] res = new int[num.size()];
        for (int j = 0; j< num.size(); j++){
            res[j] = num.get(j);
        }
        return res;
    }
}
