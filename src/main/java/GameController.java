
import com.sun.source.tree.CatchTree;
import game_Txt.FieldText;
import gui_Game_Fields.GUI_Chance;
import gui_Game_Fields.GUI_Jail;
import gui_Game_Fields.GUI_Start;
import gui_fields.*;
import gui_main.GUI;
import gui_Game_Fields.*;
import spil.GameFeatures;
import spil.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameController {
    final static String file = "src/main/resources/GameText.txt";
    public static FieldText mt = FieldText.getInstance();
    public static int max=-100;
    public static Player vinder;
    public static Boolean hasWon = false;
    public static void main(String[] args) {
        Player[] players = GameFeatures.playerstoadd();

           // System.out.println(readTextFromFile(file,"jailMessage"));
            GUI_Parentfield[] fields = istantiererFelter();
           GUI gui = new GUI(fields, Color.cyan);
           for (int i = 0; i < players.length; i++) {
               players[i].tilføjspillerGui(gui);
           }
           playGame(players,fields,gui);
       }
public static void playGame (Player[] players,GUI_Parentfield[] fields,GUI gui)
{
    while(hasWon ==false) {
        for (int i = 0; i < players.length; i++) {
            hasWon = players[i].spil(gui,fields);

        }

    }

    for (int i = 0; i < players.length; i++)
    {

        if (players[i].getKonto().getBalance() == max)
        {
            if(players[i].getKonto().getFieldvalue() > vinder.getKonto().getFieldvalue())
            {
                vinder = players[i];
            }
        }
        else if (players[i].getKonto().getBalance()>max)
      {

       vinder = players[i];
      }

    }
    gui.getUserButtonPressed(vinder.getName() + " har vundet med flest penge", "Okay");
    System.exit(1);

}

public static GUI_Parentfield[] istantiererFelter()
{
GUI_Start gStart = new GUI_Start();
GUI_GatekjøkkenetBurgerbaren gkBurgerbaren = new GUI_GatekjøkkenetBurgerbaren();
GUI_PizzahusetPizzariaet phPizzariaet = new GUI_PizzahusetPizzariaet();
GUI_GodteButikken gButikken = new GUI_GodteButikken();
GUI_Iskiosken isKiosken = new GUI_Iskiosken();
GUI_Chance chanceField1 = new GUI_Chance();
GUI_Jail jail = new GUI_Jail();

jail.setSubText(mt.mp.get("jailS"));
GUI_Museet museet = new GUI_Museet();
GUI_Biblioteket biblioteket = new GUI_Biblioteket();
GUI_Chance chanceField2 = new GUI_Chance();
GUI_SkaterParken skaterParken = new GUI_SkaterParken();
GUI_SwimmingPoolen swimmingPoolen = new GUI_SwimmingPoolen();
GUI_Parkering parkering = new GUI_Parkering();
GUI_Spillehallen spillehallen = new GUI_Spillehallen();
GUI_Biografen biografen=  new GUI_Biografen();
GUI_Chance chanceField3 = new GUI_Chance();
GUI_Legetøjsbutikken legetøjsbutikken = new GUI_Legetøjsbutikken();
GUI_Dyrebutikken dyrebutikken = new GUI_Dyrebutikken();
GUI_GoToJail goToJail = new GUI_GoToJail();
GUI_Bowlinghallen bowlinghallen = new GUI_Bowlinghallen();
GUI_Zoologiskhave zoologiskhave = new GUI_Zoologiskhave();
GUI_Chance chanceField4 = new GUI_Chance();
GUI_Vandlandet vandlandet = new GUI_Vandlandet();
GUI_Strandpromenaden strandpromenaden = new GUI_Strandpromenaden();

GUI_Parentfield[] fields ={gStart,gkBurgerbaren,phPizzariaet,chanceField1,gButikken,
        isKiosken,goToJail,museet,biblioteket,chanceField2, skaterParken,swimmingPoolen, parkering, spillehallen,
        biografen,chanceField3, legetøjsbutikken,dyrebutikken, jail,bowlinghallen,zoologiskhave,chanceField4,vandlandet, strandpromenaden};


return fields;
}

}
