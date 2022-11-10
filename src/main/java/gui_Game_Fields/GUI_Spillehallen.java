package gui_Game_Fields;

import java.awt.*;

public class GUI_Spillehallen extends GUI_Parentfield{

    public GUI_Spillehallen() {
        super(Color.pink, Color.black,mt.mp.get("spillehallenT"), mt.mp.get("spillehallenS"), mt.mp.get("spillehallenD"));
    }

    @Override
    public int cost() {
        return 3;
    }
}
