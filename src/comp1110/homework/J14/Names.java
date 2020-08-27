package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Names {
    ArrayList<String> names = new ArrayList<>();
    public void addToNames(String name){
        names.add(name);
    }
    public void printName(){
        Collections.reverse(names);
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Names A = new Names();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String ns = scanner.nextLine();
            A.addToNames(ns);
        }
        scanner.close();
            A.printName();
    }
}
