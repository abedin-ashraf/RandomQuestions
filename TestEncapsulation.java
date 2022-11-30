public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());
    }
}

class Encapsulate{
    private String geekName;
    private int geekRoll;
    private int geekAge;

    //get method for access
    public int getAge(){ return geekAge;}
    public int getRoll(){ return geekRoll;}
    public String getName(){ return geekName;}

    //set method for change
    public void setAge(int newAge){ geekAge = newAge;}
    public void setRoll(int newRoll){ geekRoll = newRoll;}
    public void setName(String newName){ geekName = newName;}
}
