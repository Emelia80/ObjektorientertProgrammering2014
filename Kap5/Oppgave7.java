import javax.swing.JOptionPane;

public class Oppgave7 // oppretter klassen Oppgave7
{
	 public static void main( String args[] )
   {

	String resultat = "";
	int x = 0;
	int telling = 0;
	int ovregrense = 50;
	int nedregrense = 10;

	x = Integer.parseInt(JOptionPane.showInputDialog("Tast inn et heltall, kj�re deg!")); // Dialogboks brukeren skal f� opp

		while (x >= 0)
		{
		   if ((x > nedregrense) && (x < ovregrense))
		   telling++;

		   x = Integer.parseInt(JOptionPane.showInputDialog("Tast inn et nytt heltall, kj�re deg!"));
	    }
		   resultat = "Du har tastet inn " + telling + " heltall mellom 10 og 50, kj�re deg!";

	    JOptionPane.showMessageDialog( null, resultat, "Resultater", JOptionPane.PLAIN_MESSAGE );
	}
}