package example;

import org.example.Produit;
import org.junit.jupiter.api.Test;

public class ProduitTest {





    // test de la methode searchVille
    @Test
    void UpdatequaliterNonNegative() throws Exception {
        Produit produit = new Produit("cerise","fruit",0,1);
        produit.update();
    }
    @Test
    void UpdatequaliterNonNegativeInferieurADeux() throws Exception {
        Produit produit = new Produit("cerise","fruit",0,1);
        produit.update();
    }


    @Test
    void UpdateBriQualiter() throws Exception {
        Produit produit = new Produit("brie vieilli","fruit",0,30);
        produit.update();

    }

    @Test
    void UpdateTypeProduitLaitier() throws Exception {
        Produit produit = new Produit("fromage","produit laitiers",0,30);
        produit.update();

    }
    @Test
    void UpdateTypeProduitLaitierQualiterInfAQuatre() throws Exception {
        Produit produit = new Produit("fromage","produit laitiers",0,3);
        produit.update();


    }







}
