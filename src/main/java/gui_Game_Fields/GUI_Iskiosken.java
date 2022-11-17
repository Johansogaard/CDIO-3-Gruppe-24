package gui_Game_Fields;

import java.awt.*;

public class GUI_Iskiosken extends GUI_Parentfield{

    public GUI_Iskiosken() {
        super(Color.MAGENTA, Color.black,mt.mp.get("iskioskenT"), mt.mp.get("iskioskenS"), mt.mp.get("iskioskenD"));
    }

    @Override
    public int cost() {
        return 1;
    }
}
