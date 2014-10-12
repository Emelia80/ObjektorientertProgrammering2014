import javax.swing.JOptionPane;

public class Oppgave2
{
   public static void main( String args[] )
   {
	   int heltall = 0;
	   int biggestnr = 0;

	   	   for ( int i = 1; i < 11; i += 1 )
	   	   {
	   	   heltall=Integer.parseInt(JOptionPane.showInputDialog("Tast inn et heltall."));
	   	   biggestnr=storste(heltall,biggestnr);
	   	   }

	   	   JOptionPane.showMessageDialog(null, "Tallet " + biggestnr + " er størst.");
	}

		   private static int storste(int sisteTall, int storst)

	   	   {
	   	   if (sisteTall>storst)
	   	   storst=sisteTall;
	   	   return storst;
		   }
}
