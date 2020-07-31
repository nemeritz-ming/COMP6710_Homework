package comp1110.homework.J06;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 1; i <= x; i++ ){
            if (isEven(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isEven(int k){
        return Math.abs(k) % 2 == 0;
    }
}
