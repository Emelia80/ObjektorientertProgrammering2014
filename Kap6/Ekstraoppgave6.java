import javax.swing.JOptionPane;
import javax.swing.JTextArea;

// Lag en metode som leser inn en tekst fra skjermen og sjekker at den innleste verdien
// er et tall innenfor et bestemt intervall. Hvis den innleste verdien ikke er et tall,
// skal dette komme fram i en feilmelding. Hvis verdien er et tall utenfor intervallet,
// skal dette komme fram i en feilmelding. Hvis den innleste verdien er et tall innenfor intervallet,
// skal metoden returnere tallet.

public class Ekstraoppgave6
{

	public static void main( String args[] )
	{
		String input = JOptionPane.showInputDialog("Tast inn et tall mellom 0 og 9.");
		int tall = Integer.parseInt(input);

		if (tall < 0 || tall > 9)
		JOptionPane.showMessageDialog(null, "Du har tastet inn et tall utenfor tidsintervallet.");

		else
		JOptionPane.showMessageDialog(null, "Tallet du har tastet inn, er: " + tall);

	}
}




