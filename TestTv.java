public class TestTv {
    public static void main(String[] args) {

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("TV1's channel is "+tv1.channel+ " and volume level is "+tv1.volumeLevel);
        System.out.println("TV2's channel is "+tv2.channel+ " and volume level is "+tv2.volumeLevel);

    }
}
class TV{
    int channel = 1; //Default channel is 1
    int volumeLevel = 1; //Default volume level is 1
    boolean on = false;

    TV(){

    }
    void turnOn(){
        on = true;
    }
    void turnOff(){
        on=false;
    }
    void setChannel(int newChannel){
        if(on && newChannel >=1 && newChannel <=120 )
            channel = newChannel;
    }
    void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel >=1 && newVolumeLevel<=7)
            volumeLevel = newVolumeLevel;
    }
    void channelUp(){
        if(on && channel < 120)
            channel++;
    }
    void channelDown(){
        if(on && channel > 1)
            channel--;
    }
    void volumeUp(){
        if(on && volumeLevel<7)
            volumeLevel++;
    }
    void volumeDown(){
        if(on && volumeLevel>1)
            volumeLevel--;
    }
}