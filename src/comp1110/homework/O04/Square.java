package comp1110.homework.O04;

public class Square extends Shape {
    public double length;
    public Square(double length){
        this.length = length;
    }
    public Square(double length, double X, double Y){
        this.length = length;
        this.x = X;
        this.y = Y;
    }

    @Override
    public double perimeter() {
        return length*4;
    }

    @Override
    public double area() {
        return length*length;
    }

    @Override
    public boolean overlaps(Shape other) {
        if (other instanceof Circle){
            double testX = other.x;
            double testY = other.y;

            // which edge is closest?
            if (other.x < x - length/2) {testX = x- length/2;}      // test left edge
            else if (other.x > x + length/2) {testX = x + length/2;}   // right edge
            if (other.y < y - length/2) {testY = y- length/2;}      // top edge
            else if (other.y > y + length/2) {testY = y + length/2;}   // bottom edge

            // get distance from closest edges
            double distX = other.x-testX;
            double distY = other.y-testY;
            double distance = Math.sqrt(distX*distX+distY*distY);

            // if the distance is less than the radius, collision!
            if (distance < ((Circle) other).length){
                return true;}
            else{return false;}
        }
        else{
            return Math.abs(x - other.x) < length / 2+ ((Square) other).length / 2 && Math.abs(y - other.y) < length / 2 + ((Square) other).length / 2;
        }
    }
}
