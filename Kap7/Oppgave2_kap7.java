import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave2_kap7
{
	public static void main( String args[] )
	{
		int [] liste = new int [10];
		int input = 0;

		JTextArea tekstomr�de = new JTextArea();
		tekstomr�de.setText("Tall vist i stjerner\n");

		for (int i=0; i<liste.length; i++)
				{
				input = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall."));
				liste[i] = input;

				if (liste[i] >0 && liste[i] <51)
				{
						if (liste [i] !=0)
						{
							for (int j=1; j<liste[i]+1; j++)
							tekstomr�de.append("*");
						}
						tekstomr�de.append("\n");
				}
				else
				{
					liste[i] = 0;
					tekstomr�de.append("\n");
				}
				}
				JOptionPane.showMessageDialog(null, tekstomr�de);
	}
}