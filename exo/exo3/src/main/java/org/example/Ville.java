package org.example;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ville {
    public List<String> cityName;

    public Ville() {

    }
    public List<String>  getCityName() {
        return cityName;
    }

    public void setCityName(List<String>  cityName) {
        this.cityName = cityName;
    }

    public void addCity() {
        this.cityName = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne",
                "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");
    }
    public void searchCity(String wordsearch) throws Exception {

        if (wordsearch.length()>=2 || wordsearch.equals("*")){
            if (wordsearch.equals("*")){
                for (String nameCity : cityName){
                    System.out.println(nameCity);
                }
            }else {


           int i = 0;
            for (String nameCity : cityName){
                String nameCityLowerCase = nameCity.toLowerCase();
                if (nameCityLowerCase.startsWith(wordsearch) || nameCity.contains(wordsearch)){
                    System.out.println(nameCity);
                    i++;
                }
            }

            if (i <= 0){

                throw new ExecutionControl.NotImplementedException("aucune ville de ce nom");
            }


            }
        } else {
            throw new ExecutionControl.NotImplementedException("le mot de recherche doit cintenir plus de deux lettre");
        }



    }

}
