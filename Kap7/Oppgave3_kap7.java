import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave3_kap7
{
	public static void main( String args[] )
	{
		Terning terningen = new Terning ();
		int antKast = 6000;

		JTextArea tekstområde = new JTextArea();
		tekstområde.setText("Frekvenstabell for terningkast\n");

		int [] frekvens = new int [6];

		for (int i=1; i<=antKast; i++)
		{
			terningen.kast();
			int verdi = terningen.getVerdi();

			frekvens [verdi-1] = frekvens [verdi-1]+1;
		}
		tekstområde.append( (i + 1) + ": " frekvens[i] + "\t" );
	}
	JOptionPane.showMessageDialog(null, tekstområde);
}