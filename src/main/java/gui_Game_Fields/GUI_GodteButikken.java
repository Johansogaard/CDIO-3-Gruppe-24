package gui_Game_Fields;

import java.awt.*;

public class GUI_GodteButikken extends GUI_Parentfield{
    public GUI_GodteButikken() {
        super(Color.MAGENTA, Color.black,mt.mp.get("godteButikkenT"), mt.mp.get("godteButikkenS"), mt.mp.get("godteButikkenD"));
    }

    @Override
    public int cost() {
        return 1;
    }
}
