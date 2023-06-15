package org.example;

import org.junit.jupiter.api.Test;

public class VilleTest {





    // test de la methode searchVille
    @Test
    void MotSupADeux() throws Exception {
        Ville listeVille = new Ville();
        listeVille.addCity();

        listeVille.searchCity("dub");
    }
    @Test
    void TesttoutAfficher() throws Exception {
        Ville listeVille = new Ville();
        listeVille.addCity();

        listeVille.searchCity("*");


    }


    @Test
    void TestComencePar() throws Exception {
        Ville listeVille = new Ville();
        listeVille.addCity();

        listeVille.searchCity("Va");


    }

    @Test
    void TestComenceParEnMinuscule() throws Exception {
        Ville listeVille = new Ville();
        listeVille.addCity();

        listeVille.searchCity("va");


    }

    @Test
    void TestContient() throws Exception {
        Ville listeVille = new Ville();
        listeVille.addCity();

        listeVille.searchCity("ew");


    }
}
