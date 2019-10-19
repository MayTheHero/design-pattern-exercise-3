package pizza;

import java.util.List;

public class PizzaFactory {

    public static Pizza create(double cost, List components, PizzaType pizzaType) {
        if (PizzaType.MARGHERITA.equals(pizzaType)) {
            return new MargheritaPizza(cost,components,pizzaType);
        } else if(PizzaType.CAPRICIOSA.equals(pizzaType)) {
            return new CapriciosaPizza(cost,components,pizzaType);
            } else if (PizzaType.HAWAII.equals(pizzaType)){
            return new HawaiPizza(cost,components,pizzaType);
        } else {
            return null;
        }
    }
}
