public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println(circle1.radius+"     "+circle1.getArea()+"    "+circle1.getPerimeter());
        circle1.radius = 100;
        System.out.println(circle1.radius+"     "+circle1.getArea()+"    "+circle1.getPerimeter());

    }
}

//Define the circle class with two constructors
class SimpleCircle{
    double radius;
    //construct a circle with radius 1
    SimpleCircle(){
        radius = 1;
    }
    //comstruct a circle with a specified radius
    SimpleCircle(double newRadius){
        radius = newRadius;
    }

    // Return the area of this circle
    double getArea(){
        return radius*radius*Math.PI;
    }
    // Return the perimeter of this circle
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    // Set a  new radius for thkis circle
    void setRadius(double newRadius){
        radius = newRadius;
    }
}