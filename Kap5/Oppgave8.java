import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class Oppgave8 // oppretter klassen Oppgave8
{
	 public static void main( String args[] )
   {

	int x = 0;
	int telling = 0;
	int ovregrense = 50;
	int nedregrense = 10;
	double gjennomsnitt = 0;
	int sum = 0;

	String resultat = "";
	String formateringsstreng = "0.00";

	JTextArea tekstomr�de = new JTextArea(); // oppretter et tekstomr�de
	DecimalFormat formateringsobjekt = new DecimalFormat(formateringsstreng);

	x = Integer.parseInt(JOptionPane.showInputDialog("Tast inn et heltall, kj�re deg!")); // Dialogboks brukeren skal f� opp

		while (x >= 0)
		{
		   if ((x > nedregrense) && (x < ovregrense))
		   telling++; // teller hvor mange tall som er innafor grensene

		   sum = sum + x; // tar summen og legger til det nye tallet

		   x = Integer.parseInt(JOptionPane.showInputDialog("Tast inn et nytt heltall, kj�re deg!"));
		   // Ny dialogboks som brukes fram til det leses inn et negativt tall
	    }


	       String utskrift = formateringsobjekt.format(gjennomsnitt);

	       gjennomsnitt = sum / telling;

	       tekstomr�de.append("Du har tastet inn " + telling + " heltall mellom 10 og 50, kj�re deg!");
	       tekstomr�de.append("\nGjennomsnittet er " + gjennomsnitt);

	    JOptionPane.showMessageDialog( null, tekstomr�de, "Resultater", JOptionPane.PLAIN_MESSAGE );
	}
}