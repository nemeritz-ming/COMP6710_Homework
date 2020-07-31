package comp1110.homework.J06;

import java.util.Scanner;

public class Prime {
    public static boolean isprime(int a){
        if (a == 2){return true; }
        for(int i =2; i < a; ++i){
            if(a % i == 0){
                return false;
            }
        }
            return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 2; i <= x; ++i){
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }
}
