import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {
        System.out.println("Please tell me the weather and the temperature, I will guide you what to wear:)");
        System.out.println("Please input the weather here:");
        System.out.println("Please input the temperature with only number here:");
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();
        int temperature = reader.nextInt();
        switch (weather){
            case "Rainy":
                System.out.println("with your umbrella");
            case "Sunny":
                System.out.println("enjoying the sunshie");
            case "Snow":
                System.out.println("with your scarf");
            case "Cloudy":
                System.out.println("not with your hat");
        }
        if(temperature < 10){
            System.out.println("A coat");
        } else if(25 >=temperature && temperature>=10){
            System.out.println("A hoodie");
        }else (temperature >= 26){
            System.out.println("A T-shirt");
        }




    }
}
