package comp1110.homework.J06;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String x0 = Integer.toBinaryString(x);
        int ans = 0;
        for (int i = 0;i < x0.length(); ++i){
            if(x0.charAt(i) == 49){
                ans = ans + +1;
            }
        }
        System.out.println(ans);
    }
}
