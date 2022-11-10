package gui_Game_Fields;

import java.awt.*;

public class GUI_Biografen extends GUI_Parentfield{

    public GUI_Biografen() {
        super(Color.pink, Color.black,mt.mp.get("biografenT"), mt.mp.get("biografenS"), mt.mp.get("biografenD"));
    }


    @Override
    public int cost() {
        return 3;
    }
}
