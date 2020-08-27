package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.Scanner;

public class Mean{
    ArrayList<Double> box = new ArrayList<>();
    public void Printmean(){
        if(box.size() ==0){
            System.out.println(0);
        }
        else{
            double sum = 0;
            for(double i:box){
                sum += i;
            }
            System.out.println(sum/box.size());
        }
    }
    public static void main(String[] args) {
        Mean A = new Mean();
        Scanner scanner = new Scanner(System.in);
        try {
            while (scanner.hasNextLine()) {
                double balls = scanner.nextDouble();
                A.box.add(balls);
            }
        }catch (Exception e) {
            A.Printmean();
        }
    }
}
