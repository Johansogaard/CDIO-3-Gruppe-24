package gui_Game_Fields;

import java.awt.*;

public class GUI_GatekjøkkenetBurgerbaren extends GUI_Parentfield {
    public GUI_GatekjøkkenetBurgerbaren() {
        super(Color.WHITE, Color.black,mt.mp.get("gatekjøkkenetBurgerbarenT"), mt.mp.get("gatekjøkkenetBurgerbarenS"), mt.mp.get("gatekjøkkenetBurgerbarenD"));
    }

    @Override
    public int cost() {
        return 1;
    }
}
