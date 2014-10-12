import javax.swing.JOptionPane;

public class Ekstraoppgave_kap_4
{
   public static void main( String args[] )
   {
	   String navn;

	   int aar;
	   int klasse = 0;


	   navn = JOptionPane.showInputDialog("Skriv inn barnets fødselsår for barn født i perioden 2002-2008.");
	   aar = Integer.parseInt (navn);

	   while (aar >= 2002 && aar <= 2008)
	   	{
			if (aar <= 2002)
			klasse = 7;

			else if (aar <= 2003)
			klasse = 6;

			else if (aar <= 2004)
			klasse = 5;

			else if (aar <= 2005)
			klasse = 4;

			else if (aar <= 2006)
			klasse = 3;

			else if (aar <= 2007)
			klasse = 2;

			else if (aar <= 2008)
			klasse = 1;

			String utskrift = "";
			utskrift = "Barnet går i " + klasse + ". klasse i 2014.";

			JOptionPane.showMessageDialog (null, utskrift, "Klasser på barneskolen", JOptionPane.PLAIN_MESSAGE);

			navn = JOptionPane.showInputDialog("Skriv inn barnets fødselsår for barn født i perioden 2002-2008.");

			aar = Integer.parseInt (navn);

		}
		JOptionPane.showMessageDialog(null, "Du tastet utenfor lovlig tidsperiode, vi ses!");
	}
}


