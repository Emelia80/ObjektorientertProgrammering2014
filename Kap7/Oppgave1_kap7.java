import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave1_kap7
{
	public static void main( String args[] )
	{
	int [] liste = new int [10];
	int input = 0;

	JTextArea tekstomr�de = new JTextArea();
	tekstomr�de.setText("Heltall i motsatt rekkef�lge\n");

	for (int i=0; i<liste.length; i++)
		{
		input = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall."));
		liste [i] = input;
		}

	for (int i=liste.length-1; i>-1; i--)
		{
		tekstomr�de.append(liste[i] + "\n");
		}
		JOptionPane.showMessageDialog(null, tekstomr�de);
	}
}