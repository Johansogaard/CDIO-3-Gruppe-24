package spil;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import gui_Game_Fields.GUI_Parentfield;

public class Player {
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    private int pos=0;
    Konto konto = new Konto(0);
    Terninger terninger = new Terninger();
    GUI_Player pl;
    GUI_Field fpos;
    GUI gui;



    private boolean jail= false;
    public boolean isJail() {
        return jail;
    }

    public void setJail(boolean jail) {
        this.jail = jail;
    }
    private int t1=0;
    private int t2=0;
    private String name;
    public Player(String name, int bal, int postiotion)
    {
        konto.update(bal);
        pos = postiotion;

        this.name = name;

    }
    //Getter
    public void tilføjspillerGui(GUI gui)
    {
        GUI_Player player = new GUI_Player(name,konto.getBalance());
        gui.addPlayer(player);
        GUI_Field field = gui.getFields()[pos];
        field.setCar(player,true);
        fpos = field;
        pl=player;
        this.gui = gui;
    }
    public Konto getKonto(){

        return konto;
    }
    public String getName()
    {
        return name;
    }
    //spiller en runde for den spiller der er kaldt
    public void spil(GUI gui, GUI_Parentfield[] fields)
    {

        while (true) {
            if (isJail())
            {
                setJail(false);
                gui.getUserButtonPressed(name + " du er i fængsel og betaler 1M for at komme ud i næste runde", "Okay");
                konto.update(-1);
                pl.setBalance(konto.getBalance());
                break;
            }
            if (gui.getUserButtonPressed(name + " Press button to roll dice", "Roll Dice") == "Roll Dice") {
                turn();
                pos=(pos+t1 +t2)%24;
                gui.setDice(t1, t2);
                setCar(pos, gui);
                displayCard(pos,gui);
                fields[pos].hit(this);
             //   pl.setBalance(konto.getBalance());

                if (konto.getBalance() >= 3000) {
                    if (gui.getUserButtonPressed(name + " Vandt spillet tryk ok for at afslutte", "ok") == "ok") {
                        System.exit(0);
                    }

                }
                if (t1+t2 != 10) {
                    break;
                }

            }

        }
    }
    public void turn()
    {
        t1 = terninger.slaEnTerning();
        t2 = terninger.slaEnTerning();

    }
    public void setCar(int tsum,GUI gui)
    {
        fpos.setCar(pl,false);
        GUI_Field felt = gui.getFields()[tsum];
        felt.setCar(pl,true);
        fpos = gui.getFields()[tsum];
    }
    public void displayCard(int pos, GUI gui)
    {
        GUI_Field f = gui.getFields()[pos];
        gui.displayChanceCard(f.getTitle()+"\n"+ f.getDescription());
    }

    public void payRent(int cost, Player owner, String title)
    {
        gui.getUserButtonPressed(pl.getName() + " landed on " + title+" and needs to pay rent to " + owner.getName(), "Okay");
        pl.setBalance(cost);


    }
    public void getRent(int cost)
    {
        pl.setBalance(cost);
    }


    public void buyField(int cost, String title)
    {
        gui.getUserButtonPressed(pl.getName() + " bought " + title+"", "Okay");
        pl.setBalance(cost);

    }
    public void injail()
    {
        pos =18;
        setCar(18,gui);
        setJail(true);
        gui.getUserButtonPressed(name + " du er i fængsel og bliver sprunget over i næste runde", "Okay");
    }
}

