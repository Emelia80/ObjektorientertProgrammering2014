import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave5 // oppretter klassen Oppgave5
{
   public static void main( String args[] )
   {

	   int andrepotens = 0;
	   int tredjepotens = 0;

	   JTextArea tekstomr�de = new JTextArea(); // oppretter et tekstomr�de

	   tekstomr�de.setText("Tall\tAndrepotens\tTredjepotens\n"); // lager overskrifter inkl. mellomrom i tekstomr�det

	   for (int Potens = 0; Potens < 11; Potens += 1) // Start med tallet 0, avslutt med tallet 11, �k med 1.
	   {
		   andrepotens = Potens*Potens; // Formel for � regne andrepotensen
		   tredjepotens = Potens*Potens*Potens; // Formel for � regne tredjepotensen

		   tekstomr�de.append( Potens + "\t" + andrepotens + "\t" + tredjepotens + "\n"); // Tilf�ying til tekstomr�det

	   } // for-l�kken avsluttes

	   JOptionPane.showMessageDialog( null, tekstomr�de, "Potenstabell", JOptionPane.INFORMATION_MESSAGE); // Viser resultatboks

   } // Avslutter main
} // Avslutter klassen Oppgave5

