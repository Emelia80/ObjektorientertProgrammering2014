import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave3
{
	public static void main( String args[] )
	{
		JTextArea tekstomr�de = new JTextArea();
		tekstomr�de.setText("Slumptall fra terning\n");

		Terning terningen = new Terning();
		int antKast = 100;

		for (int i = 1; i <= antKast; i++)
		{
			terningen.kast();
			int verdi = terningen.getVerdi();

			tekstomr�de.append(verdi + "\t");

				if (i % 10 == 0)
				{
				tekstomr�de.append("\n");
				}
		}
		JOptionPane.showMessageDialog( null, tekstomr�de, "Slumptall", JOptionPane.PLAIN_MESSAGE);
	}
}
