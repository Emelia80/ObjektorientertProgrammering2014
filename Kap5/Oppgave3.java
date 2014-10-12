import javax.swing.JOptionPane;

public class Oppgave3
{
   public static void main( String args[] )
   {
	   int heltall = 0;
	   int biggestnr = 0;
	   int nestbiggestnr = 0;

	   	   for ( int i = 1; i < 11; i += 1 )
	   	   {
	   	   heltall=Integer.parseInt(JOptionPane.showInputDialog("Tast inn et heltall."));

	   	   if(heltall>biggestnr)
	   	   {	nestbiggestnr=storste(biggestnr,nestbiggestnr);
	   	   	    biggestnr=storste(heltall,biggestnr);
	   	   }
	   	   else
	   	   		nestbiggestnr=storste(heltall,nestbiggestnr);
		   }

	   	   JOptionPane.showMessageDialog(null, "Tallet " + biggestnr + " er størst, mens tallet " + nestbiggestnr + " er nest størst.");
	}

		   private static int storste(int sisteTall, int storst)

	   	   {
	   	   if (sisteTall>storst)
	   	   storst=sisteTall;
	   	   return storst;
		   }
}
