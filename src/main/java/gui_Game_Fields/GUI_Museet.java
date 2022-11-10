package gui_Game_Fields;

import java.awt.*;

public class GUI_Museet extends GUI_Parentfield{
    public GUI_Museet() {
        super(Color.red, Color.black,mt.mp.get("museetT"), mt.mp.get("museetS"), mt.mp.get("museetD"));
    }

    @Override
    public int cost() {
        return 2;
    }
}
