import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave2_kap7
{
	public static void main( String args[] )
	{
		int [] liste = new int [10];
		int input = 0;

		JTextArea tekstområde = new JTextArea();
		tekstområde.setText("Tall vist i stjerner\n");

		for (int i=0; i<liste.length; i++)
				{
				input = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall."));
				liste[i] = input;

				if (liste[i] >0 && liste[i] <51)
				{
						if (liste [i] !=0)
						{
							for (int j=1; j<liste[i]+1; j++)
							tekstområde.append("*");
						}
						tekstområde.append("\n");
				}
				else
				{
					liste[i] = 0;
					tekstområde.append("\n");
				}
				}
				JOptionPane.showMessageDialog(null, tekstområde);
	}
}