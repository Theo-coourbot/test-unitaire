package com.example.tpbataillenavale.service;

import com.example.tpbataillenavale.entity.Case;

import java.util.ArrayList;
import java.util.List;

public class PlateauService {

    List<Case> plateau = new ArrayList<>();
    int horizontal = 1;
    int vertical = 1;
    public List<Case> createGame(){
        while (vertical <= 10){
            while (horizontal <=10){
                horizontal ++;
            }
            vertical ++;
            horizontal = 1;


        }

        return plateau;
    }

}
