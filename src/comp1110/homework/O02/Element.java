package comp1110.homework.O02;

import java.util.Arrays;

public enum Element {
    H(1,1,1),He(2,18,1),Li(3,1,2), Be(4,2,2), B(5,13,2);
    private final int[] facts;
    Element(int weight, int group, int period){
        this.facts =new int[3];
        this.facts[0] = weight;
        this.facts[1] = group;
        this.facts[2]= period;
    }
    public int[] getFacts(){
        return facts;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Element.B.facts));
    }
}

