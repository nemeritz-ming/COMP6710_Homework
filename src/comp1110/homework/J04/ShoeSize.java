package comp1110.homework.J04;

import java.util.Scanner;

public class ShoeSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height = in.nextDouble();
        height = height * 5.0;
        System.out.println(Math.round(height));
    }
}
