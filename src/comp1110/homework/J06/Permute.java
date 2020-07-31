package comp1110.homework.J06;

import java.util.Scanner;
import java.util.Arrays;

public class Permute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String y = in.nextLine();
        char[] x0 = x.toCharArray();
        char[] y0 = y.toCharArray();
        Arrays.sort(x0);
        Arrays.sort(y0);
        if(Arrays.equals(x0,y0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}