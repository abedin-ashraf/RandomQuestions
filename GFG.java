import java.io.*;
public class GFG {
    public static void main(String[] args) {
        Geek geek1 = new Geek();
        Geek geek2 = new Geek("Ashraf");
        Geek geek3 = new Geek("Abedin", 21);
        Geek geek4 = new Geek(32434323);
    }
}
class Geek{
    int num;
    String name;

    Geek(){
        System.out.println("Constructor called");

    }
    Geek(String name) {
        System.out.println("Constructor with one argument - String : " + name);
    }
    Geek(String name, int age){
        System.out.println("Constructor with two arguments : String and Integer : "+name+" "+age);
    }
    Geek(long id){
        System.out.println("Constructor with one argument : Long : "+id );
    }
}

