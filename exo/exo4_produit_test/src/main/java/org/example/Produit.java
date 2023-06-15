package org.example;

import jdk.jshell.spi.ExecutionControl;

public class Produit {

    String name;

    String type;

    int selln;
    int quality;

    public Produit(String name, String type, int selln, int quality) {
        this.name = name;
        this.type = type;
        this.selln = selln;
        this.quality = quality;
    }

    public int getSelln() {
        return selln;
    }

    public void setSelln(int selln) {
        selln = selln;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void update() throws ExecutionControl.NotImplementedException {


        if (quality > 0 && quality <=50) {
            if (name.contains("brie vieilli")){
                quality ++;
            } else {
                if (selln == 0 && quality > 2) {

                    if (type.contains("produit laitiers")){
                        if (quality > 4){
                            quality += -4;
                        } else {
                            quality = 0;
                        }
                    } else {

                    quality += -2;
                    }


                } else {
                    quality --;
                    selln --;
                }
            }

            System.out.println(name + " " + type + " " +  selln + " " + quality);

        } else {
            System.out.println("la qualiter doit etre comprise entre 0 et 50");
        throw new ExecutionControl.NotImplementedException("la qualiter ne peut pas etre superieur a 50");
        }

    }

    @Override
    public String toString() {
        return "Produit{" +
                "name='" + name + '\'' +
                ", Selln=" + selln +
                ", quality=" + quality +
                '}';
    }
}
