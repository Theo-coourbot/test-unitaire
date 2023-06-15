package org.example;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Voiture {

    String type;
    int rentDueLn;
    int condition;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRentDueLn() {
        return rentDueLn;
    }

    public void setRentDueLn(int rentDueLn) {
        this.rentDueLn = rentDueLn;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
