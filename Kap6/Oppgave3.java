import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave3
{
	public static void main( String args[] )
	{
		JTextArea tekstområde = new JTextArea();
		tekstområde.setText("Slumptall fra terning\n");

		Terning terningen = new Terning();
		int antKast = 100;

		for (int i = 1; i <= antKast; i++)
		{
			terningen.kast();
			int verdi = terningen.getVerdi();

			tekstområde.append(verdi + "\t");

				if (i % 10 == 0)
				{
				tekstområde.append("\n");
				}
		}
		JOptionPane.showMessageDialog( null, tekstområde, "Slumptall", JOptionPane.PLAIN_MESSAGE);
	}
}
