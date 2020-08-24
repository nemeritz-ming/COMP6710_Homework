package comp1110.homework.J12;

public class Exchange<T>{
    public static <T> T[] swap(T[] a, int i, int j){
        if (Math.min(i,j) <0 || Math.max(i,j) >= a.length){
            return a;
        }
        T[] a0 = a.clone();
        T X, Y;
        X = a0[i];
        Y = a0[j];
        a0[i] = Y;
        a0[j] = X;
        return a0;
    }
}
