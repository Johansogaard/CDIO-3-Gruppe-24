package gui_Game_Fields;

import spil.Konto;
import spil.Player;

import java.awt.*;

public class GUI_Biblioteket extends GUI_Parentfield{

    public GUI_Biblioteket() {
        super(Color.red, Color.black,mt.mp.get("biblioteketT"), mt.mp.get("biblioteketS"), mt.mp.get("biblioteketD"));



    }

    @Override
    public int cost() {
        return 2;
    }


    }

