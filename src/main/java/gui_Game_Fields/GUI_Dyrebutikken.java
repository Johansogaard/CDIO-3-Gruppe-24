package gui_Game_Fields;

import java.awt.*;

public class GUI_Dyrebutikken extends GUI_Parentfield{

    public GUI_Dyrebutikken() {
        super(Color.yellow, Color.black,mt.mp.get("dyrebutikkenT"), mt.mp.get("dyrebutikkenS"), mt.mp.get("dyrebutikkenD"));
    }

    @Override
    public int cost() {
        return 3;
    }
}
