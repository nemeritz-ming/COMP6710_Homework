package comp1110.homework.J11;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String GivenS = in.nextLine();
        int num = 1;
        StringBuilder ans = new StringBuilder();
        if (GivenS.length() == 1 || GivenS.length() == 0 ){
            System.out.println(GivenS);
        }
        else{
            ans.append(GivenS.charAt(0));
        for (int i = 0; i < GivenS.length()-1; i++){
            if(GivenS.charAt(i) == GivenS.charAt(i+1)){
                if(i != GivenS.length()-2){
                num += 1;}
                else{ num += 1;
                ans.append(num);}
            }
            else{
                if(num != 1){
                ans.append(num).append(GivenS.charAt(i + 1));
                num = 1;}
                else{
                    ans.append(GivenS.charAt(i + 1));}}
            }
        System.out.println(ans);}
    }
}
