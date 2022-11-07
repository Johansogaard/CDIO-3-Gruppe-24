
import game_Txt.FieldText;
import gui_Game_Fields.GUI_Start;
import gui_fields.*;
import gui_main.GUI;
import gui_Game_Fields.*;
import java.awt.*;

public class GameController {
    final static String file = "src/main/resources/GameText.txt";
    public static FieldText mt = FieldText.getInstance();
    public static void main(String[] args) {
       // System.out.println(readTextFromFile(file,"jailMessage"));
        GUI gui = new GUI(istantiererFelter(),Color.cyan);

    }



public static GUI_Field[] istantiererFelter()
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

GUI_Field[] fields ={gStart,gkBurgerbaren,phPizzariaet,chanceField1,gButikken,
        isKiosken,jail,museet,biblioteket,chanceField2, skaterParken,swimmingPoolen, parkering, spillehallen,
        biografen,chanceField3, legetøjsbutikken,dyrebutikken, goToJail,bowlinghallen,zoologiskhave,chanceField4,vandlandet, strandpromenaden};


return fields;
}
   /* public static String readTextFromFile(String file, String stringName)
    {
        String message;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String currentLine = reader.readLine();
            //"Loop begin indtil der ikke er mere at læse"
           // læs én linie.
            // "Loop end
            while (true) {
               if (currentLine.equals( stringName))
                {
                    currentLine = reader.readLine();
                    break;
                }
                currentLine = reader.readLine();
            }
            message = currentLine;
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return message;


    }*/
}
