/*
 Suppose a meteorology station records the temperature and humidity every hour of every day, 
and stores the data for the past 10 days in a text file named Weather.txt (see liveexample
.pearsoncmg.com/data/Weather.txt). Each line of the file consists of four numbers that indicate the day, hour, temperature, and humidity. 
 Your task is write a program that calculates the average daily temperature and humidity for the 10 days.
*/

import java.util.Scanner;
public class Weather {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        for(int k=0; k<NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++){
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day-1][hour-1][0]=temperature;
            data[day-1][hour-1][1]=humidity;
        }
        for(int i=0; i<NUMBER_OF_DAYS; i++){
            double dailyTemperatureTotal =0, dailyHumidityTotal =0;
            for(int j=0; j<NUMBER_OF_HOURS; j++){
                dailyTemperatureTotal+=data[i][j][0];
                dailyHumidityTotal+=data[i][j][1];
            }
            System.out.println("Day "+(i+1)+"'s average temperature is "+dailyTemperatureTotal/NUMBER_OF_HOURS);
            System.out.println("Day "+(i+1)+"'s average humidity is "+dailyHumidityTotal/NUMBER_OF_HOURS);

        }
    }
}
