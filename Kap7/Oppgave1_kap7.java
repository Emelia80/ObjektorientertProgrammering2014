import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave1_kap7
{
	public static void main( String args[] )
	{
	int [] liste = new int [10];
	int input = 0;

	JTextArea tekstområde = new JTextArea();
	tekstområde.setText("Heltall i motsatt rekkefølge\n");

	for (int i=0; i<liste.length; i++)
		{
		input = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall."));
		liste [i] = input;
		}

	for (int i=liste.length-1; i>-1; i--)
		{
		tekstområde.append(liste[i] + "\n");
		}
		JOptionPane.showMessageDialog(null, tekstområde);
	}
}