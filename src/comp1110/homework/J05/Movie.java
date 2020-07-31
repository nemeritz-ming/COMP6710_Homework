package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int time = in.nextInt();
        int h = time / 60;
        int min = time % 60;
        if (h>1 & min>1){
            System.out.println(name+ " runs for "+h+" hours and "+min+" minutes");
        }
        else if (h>1 & min ==1){
            System.out.println(name+ " runs for "+h+" hours and "+min+" minute");
        }
        else if (h>1 & min ==0){
            System.out.println(name+ " runs for "+h+" hours");
        }
        else if (h==1 & min>1){
            System.out.println(name+ " runs for "+h+" hour and "+min+" minutes");
        }
        else if (h==1 & min ==1){
            System.out.println(name+ " runs for "+h+" hour and "+min+" minute");
        }
        else if (h==1 & min ==0){
            System.out.println(name+ " runs for "+h+" hour");
        }
        else if (h<1 & min > 1){
            System.out.println(name+ " runs for "+min+" minutes");
        }
        else if (h<1 & min ==1) {
            System.out.println(name+ " runs for " + min + " minute");
        }
    }
}
