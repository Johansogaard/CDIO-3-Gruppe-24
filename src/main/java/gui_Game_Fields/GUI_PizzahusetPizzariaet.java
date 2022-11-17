package gui_Game_Fields;

import java.awt.*;

public class GUI_PizzahusetPizzariaet extends GUI_Parentfield {
    public GUI_PizzahusetPizzariaet() {
        super(Color.WHITE, Color.black,mt.mp.get("pizzahusetPizzariaetT"), mt.mp.get("pizzahusetPizzariaetS"), mt.mp.get("pizzahusetPizzariaetD"));
    }

    @Override
    public int cost() {
        return 1;
    }
}
