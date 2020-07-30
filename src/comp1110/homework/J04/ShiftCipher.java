package comp1110.homework.J04;

import java.util.Scanner;

public class ShiftCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String plaintext = in.nextLine();
        int shiftvalue = in.nextInt();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++){
            if (!Character.isLetter(plaintext.charAt(i))){
                ans.append(plaintext.charAt(i));
            }
            else if (Character.isUpperCase(plaintext.charAt(i))){
                int ascii = plaintext.charAt(i);
                ascii = (ascii - 65 + shiftvalue) % 26 + 65;
                char shiftchar = (char) ascii;
                ans.append(shiftchar);
            }
            else{
                int ascii = plaintext.charAt(i);
                ascii = (ascii - 97 + shiftvalue) % 26 + 97;
                char shiftchar = (char) ascii;
                ans.append(shiftchar);
            }
        }
        System.out.println(ans);
    }
}
