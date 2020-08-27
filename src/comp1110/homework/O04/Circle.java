package comp1110.homework.O04;

public class Circle extends Shape{
    public double length;
    static final double PI = 3.141592653589793;
    public Circle(double length){
        this.length = length;
    }
    public  Circle(double length, double X, double Y){
        this.x = X;
        this.y = Y;
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 2*length*PI;
    }

    @Override
    public double area() {
        return length*length*PI;
    }

    @Override
    public boolean overlaps(Shape other) {
        if (other instanceof Circle){
            return Math.sqrt((x - other.x)*(x - other.x)+(y - other.y)*(y - other.y)) < length + ((Circle) other).length;
        }
        else{
            double testX = x;
            double testY = y;

            // which edge is closest?
            if (x < other.x - ((Square) other).length/2){testX = other.x-((Square) other).length/2;}     // test left edge
            else if (x > other.x +((Square) other).length/2) {testX = other.x + ((Square) other).length/2;}   // right edge
            if (y < other.y - ((Square) other).length/2){testY = other.y-((Square) other).length/2;}      // top edge
            else if (y > other.y +((Square) other).length/2) {testY = other.y + ((Square) other).length/2;}   // bottom edge

            // get distance from closest edges
            double distX = x-testX;
            double distY = y-testY;
            double distance = Math.sqrt(distX*distX+distY*distY);

            // if the distance is less than the radius, collision!
            if (distance < length) {
                return true;
            }
            else{return false;}
        }

    }
}