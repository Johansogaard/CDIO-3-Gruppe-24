package spil;

import gui_main.GUI;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class PlayerTest{

    @Test
    public void checkIfPassedStartTest() {
    GUI gui = new GUI();

    Player testPlayer = new Player("TestPlayer",20,0);
    testPlayer.tilføjspillerGui(gui);
        Random random = new Random();
        int overstart =0;
        int ikkeoverstart=0;
    for(int i = 0; i<1000;i++) {
        testPlayer.updatePlayerBalance(20-testPlayer.getKonto().getBalance());
       int r = random.nextInt(2,36);

        testPlayer.checkIfPassedStart(r);
        if (r>=24)
        {
            assertEquals(true,testPlayer.getKonto().getBalance()==22);
            overstart++;
        }
        else {
            assertEquals(true, testPlayer.getKonto().getBalance() == 20);
            ikkeoverstart++;
        }

    }
        System.out.println("Antal gange over start = "+overstart+"\nAntal gange ikke over start = "+ ikkeoverstart);


}
}