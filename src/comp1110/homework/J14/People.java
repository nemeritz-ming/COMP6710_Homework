package comp1110.homework.J14;

import java.util.*;

public class People {
    Map<String, Integer> map = new HashMap<>();
    public void addNameAndAges(String names, Integer ages){
        map.put(names,ages);
    }
    public void printLastValues(String lastOne){
        boolean Output = false;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getKey().equals(lastOne)){
                System.out.println(entry.getValue());
                Output = true;
            }
        }
        if (!Output) {System.out.println("unknown");}
    }
    public static void main(String[] args) {
        People A =new People();
        String lastname = "";
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String namesAges = in.nextLine();
            String[] N = namesAges.split(" ");
            List<String> New = new ArrayList<String>(Arrays.asList(N));
            if(New.size() == 1){
                lastname  = New.get(0);}
            else{A.addNameAndAges(New.get(0), Integer.parseInt(New.get(1)));}
        }
        in.close();
        A.printLastValues(lastname);
    }
}
