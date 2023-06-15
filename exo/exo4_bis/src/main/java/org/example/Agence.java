package org.example;

import jdk.jshell.spi.ExecutionControl;

public class Agence {

    public void dailyRoutine(Voiture voiture) throws ExecutionControl.NotImplementedException {

        int q = 0;
        if(voiture.getCondition() <= 0 || voiture.getCondition() >= 100) {
            throw new ExecutionControl.NotImplementedException("la condition est superieur a 100 ou inferieur 0");
        }



        if(voiture.getType().equals("ancienne")) {

                if(voiture.getRentDueLn() > 0) {
                    q = 2;
                }
                else {
                    q = (voiture.getCondition() >= 4) ? 4 : voiture.getCondition();
                }

        }

        else {

            if(voiture.getRentDueLn() > 0) {

                q = 1;
            }else {
                q = (voiture.getCondition() >= 2) ? 2 : voiture.getCondition();
            }
        }
        if(voiture.getType().equals("luxe")) {
            q = -1;
        }

        voiture.setCondition(voiture.getCondition() - q);
//        System.out.println(voiture.getCondition());
        voiture.setRentDueLn(voiture.getRentDueLn() - 1);
//        System.out.println(voiture.getRentDueLn());
    }
    }

