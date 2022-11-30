public class TestGeometricObject {
    public static void main(String[] args) {
        // Declare and initialize two geometric objects
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

        // Display circle
        displayGeometricObject(geoObject1);

        // Display rectangle
        displayGeometricObject(geoObject2);
    }

    /** A method for comparing the areas of two geometric objects */
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    /** A method for displaying a geometric object */
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
        }
    }

abstract class GeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on "+dateCreated+"\ncolor: "+color+ " and filled: "+filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Circle extends GeometricObject{
    private double radius;
    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void printCircle(){
        System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
    }
}

class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double getArea(){
        return width*height;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+height);
    }
}