package game_Txt;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTextTest{

    @Test
    public void stringReaderTest() {
        FieldText mt =  FieldText.getInstance();
        String jailD = mt.mp.get("jailD");
        String jail = "Fængsel man skal betale 1M for at komme ud";
        System.out.println(jailD);
        System.out.println(jail);
        assertEquals("De to strings skal være de samme",true,jail.equals(jailD));


    }

}