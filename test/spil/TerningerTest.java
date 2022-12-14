package spil;
import org.junit.Test;


import static org.junit.Assert.*;
import static spil.Terninger.slaEnTerning;

public class TerningerTest {
    // test af om terningerul med 1 terning giver øjensum 1-6
    @Test
    public void TestSlaEnTerning () {
        for(int i=0;i<200;i++){
            if((slaEnTerning()<1)||(slaEnTerning()>6)){
                fail("Fejl: terningen slog ikke 1-6");    }}

        System.out.println("Test 1 bestået: terningen slår 1-6.");
        System.out.println();

//rul med to terninger 1000 gange, for at tjekke om øjensummen er normalfordelt
        int samme = 0;
        int[] antal = new int[6];
        int[] sum = new int[12];

        for (int i= 0; i < 1000; i++)
        //bruger samme rulle metode som fra spillet
        {
            int t1 = slaEnTerning();
            int t2 = slaEnTerning();

            antal[t1-1] +=1;
            antal[t2-1] +=1;
            sum[t1+t2-1] +=1;
            if (t1 == t2)
            {
                samme+=1 ;
            }
        }

        for (int i= 0; i< 6;i++)
        {
            //formel for at finde fejlmargin fra teoretisk sandsynlighed til udfaldet af de tusind terningkast: 1000 kast 2 terninger
            double fejlmargen=(((2000.0/6)-antal[i])/(2000.0))*100.0;

            //hvis fejlmargen er negativ, returnerer den samme tal, bare modsat fortegn
            if(fejlmargen<0){
                fejlmargen=((((2000.0/6)-antal[i])/(2000.0))*100.0)*-1;
            }

            //hvis fejlmargen er over 5%, fejler testen
            if((fejlmargen>5)){
                fail("Fejlmargin over 5%");
            }

            else {
                System.out.print("Antal " + (i + 1) + "'ere: " + antal[i] + " Fejlmargen er ");
                //formatering af fejlmargen resultat: 2 decimaler

                System.out.format("%.2f", (fejlmargen));
                System.out.print(" %\n");
            }
        }

        System.out.println("\nTest 2 bestået: terningerne har en fejlmargen på 5%");

        System.out.println( "\nDer var "+samme+ " gange hvor terning 1 og 2 var det samme\n");
        System.out.println("Summen af de to terninger der slås:");
        for (int i= 0; i< 12;i++)
        {
            System.out.println("Sum "+(i+1)+ ": "+sum[i]+" gange") ;
        }
    }
}
