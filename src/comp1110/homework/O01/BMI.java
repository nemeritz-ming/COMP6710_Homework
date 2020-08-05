package comp1110.homework.O01;

public class BMI {
    public String name;
    public double height;
    public double weight;
    public BMI (String name, double height, double weight){
        this.height = height;
        this.weight = weight;
        this.name = name;
    }
    public double getBMI(){
        return weight/ (height*height);
    }
    @Override
    public String toString(){
        return name + " is " + height + "m tall and is " + weight + "Kg and has a BMI of " + getBMI() + "Kg/m^2";
    }
    public static void main(String[] args) {
        BMI jj = new BMI("Leiming", 1.76, 75);
        System.out.println(jj.toString());
    }
}
