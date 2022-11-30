

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, 10, "yellow", true);
        System.out.println(fan1.toString());

        System.out.println();

        Fan fan2 = new Fan(Fan.MEDIUM,5, "blue", false);
        System.out.println(fan2.toString());
    }
}
class Fan{
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius ;
    String color;
    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    public Fan(int speed,double radius,String color, boolean on){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        if(on == true){
            return "Fan speed: "+speed+", color: "+color+", radius: "+radius+". ";
        }
        else
            return "Fan color: "+color+", radius: "+radius+" and fan is off.";
    }
}