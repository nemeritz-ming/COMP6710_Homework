package comp1110.homework.J05;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gra = in.nextInt();
        if (gra >= 0 & gra <= 49 ){
            System.out.println("N");
        }
        else if (gra >= 50 & gra <= 59){
            System.out.println("P");
        }
        else if (gra >= 60 & gra <= 69){
            System.out.println("C");
        }
        else if (gra >= 70 & gra <= 79){
            System.out.println("D");
        }
        else if (gra >= 80 & gra <= 100){
            System.out.println("HD");
        }
        else {
            System.out.println("Bad mark");
        }
    }
}
