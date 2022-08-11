import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {
        System.out.println("Please tell me the weather and the temperature, I will guide you what to wear:)");
        System.out.println("Please input your weather:");
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();
        switch (weather){
            case "Rainy":
                System.out.println("with your umbrella");
                break;
            case "Sunny":
                System.out.println("enjoying the sunshine");
                break;
            case "Snow":
                System.out.println("with your scarf");
                break;
            case "Cloudy":
                System.out.println("not with your hat");
                break;
        }

        System.out.println("Please input your temperature:");
        int temperature = reader.nextInt();
        if(temperature < 10){
            System.out.println("A coat");
        } else if(25 >=temperature && temperature>=10){
            System.out.println("A hoodie");
        }else if (temperature>=26)
        {
            System.out.println("A T-shirt");
        }
        System.out.println("The suggest is" + temperature + weather);





    }
}
