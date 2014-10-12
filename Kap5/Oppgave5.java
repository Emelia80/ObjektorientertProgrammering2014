import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave5 // oppretter klassen Oppgave5
{
   public static void main( String args[] )
   {

	   int andrepotens = 0;
	   int tredjepotens = 0;

	   JTextArea tekstområde = new JTextArea(); // oppretter et tekstområde

	   tekstområde.setText("Tall\tAndrepotens\tTredjepotens\n"); // lager overskrifter inkl. mellomrom i tekstområdet

	   for (int Potens = 0; Potens < 11; Potens += 1) // Start med tallet 0, avslutt med tallet 11, øk med 1.
	   {
		   andrepotens = Potens*Potens; // Formel for å regne andrepotensen
		   tredjepotens = Potens*Potens*Potens; // Formel for å regne tredjepotensen

		   tekstområde.append( Potens + "\t" + andrepotens + "\t" + tredjepotens + "\n"); // Tilføying til tekstområdet

	   } // for-løkken avsluttes

	   JOptionPane.showMessageDialog( null, tekstområde, "Potenstabell", JOptionPane.INFORMATION_MESSAGE); // Viser resultatboks

   } // Avslutter main
} // Avslutter klassen Oppgave5

