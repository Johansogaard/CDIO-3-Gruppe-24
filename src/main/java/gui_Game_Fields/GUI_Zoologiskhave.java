package gui_Game_Fields;

import java.awt.*;

public class GUI_Zoologiskhave extends GUI_Parentfield{

    public GUI_Zoologiskhave() {
        super(Color.green, Color.black,mt.mp.get("zoologiskhaveT"), mt.mp.get("zoologiskhaveS"), mt.mp.get("zoologiskhaveD"));
    }

    @Override
    public int cost() {
        return 4;
    }
}
