package main;

import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza capriciosa = PizzaFactory.create(31.99,Arrays.asList("cheese","champignons","ham"),PizzaType.CAPRICIOSA);
        Pizza margherita = PizzaFactory.create(29.99,Arrays.asList("cheese","sauce"),PizzaType.CAPRICIOSA);
        capriciosa.showPizzaInfo();
        margherita.showPizzaInfo();
    }

}
