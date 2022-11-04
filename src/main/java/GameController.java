
import gui_fields.GUI_Field;
import gui_main.GUI;
import gui_Game_Fields.*;
import java.awt.*;
import java.io.*;

public class GameController {
    final static String file = "src/main/resources/GameText.txt";

    public static void main(String[] args) {
       // System.out.println(readTextFromFile(file,"jailMessage"));
        GUI gui = new GUI(istantiererFelter(),Color.cyan);

    }



public static GUI_Field[] istantiererFelter()
{
gui_Start gStart = new gui_Start();
gui_GatekjøkkenetBurgerbaren gkBurgerbaren = new gui_GatekjøkkenetBurgerbaren();
GUI_Field[] fields ={gStart,gkBurgerbaren};
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
