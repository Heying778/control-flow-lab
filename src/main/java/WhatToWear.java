import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {


        System.out.println("Please tell the temperature and the weather, I will guide you what to wear:)");
        System.out.println("Please input your temperature:");
        int temperature = reader.nextInt();
        reader.nextLine();
        System.out.println("Please input your weather:");
        String weather = reader.nextLine();

        String tempSuggestion = "";
        String weatherSuggestion = "";

        if (temperature< 10){
            tempSuggestion = " A coat";
        }else if (temperature >=10 && temperature < 25){
            tempSuggestion = "A hoodie";
        }else if (temperature >=25){
            tempSuggestion = "A T-shirt";
        }

        switch (weather) {
            case "Rainy":
                weatherSuggestion = "with your umbrella";
                break;
            case "Sunny":
                weatherSuggestion = "enjoying the sunshine";
                break;
            case "Snow":
                weatherSuggestion = "with your scarf";
                break;
            case "Cloudy":
                weatherSuggestion = "not with your hat";
                break;
        }

        System.out.println("Your suggest is  " + tempSuggestion + weatherSuggestion);
    }
}
