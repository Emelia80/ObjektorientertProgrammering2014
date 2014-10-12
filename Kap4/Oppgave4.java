import javax.swing.JOptionPane;

public class Oppgave4
{
   public static void main( String args[] )
   {
			int time;
			int minutt;
			int sekund;
			int sekundTime = 3600;
			int sekundMinutt = 60;

			String tast = JOptionPane.showInputDialog("Tast inn antall hele sekunder du vil ha omgjort til hele timer, minutter og sekunder.");
			int svar = Integer.parseInt(tast);

	   		while ( svar >= 0 )
	   		{
	  	  	    time = svar / sekundTime;
				svar = svar % sekundTime;
				minutt = svar / sekundMinutt;
				svar = svar % sekundMinutt;
	  	  	    sekund = svar;

	  	  	    String utskrift = "";
			{
				if (time > 0 )
	  	  	    utskrift = time + " t ";
			}
		    {
	  	  	    if (minutt > 0)
				utskrift = utskrift + minutt + " m ";

		    }
		  		utskrift = utskrift + sekund + " s ";

				JOptionPane.showMessageDialog (null, utskrift, "Resultat", JOptionPane.PLAIN_MESSAGE);

				tast = JOptionPane.showInputDialog("Tast inn antall hele sekunder du vil ha omgjort til hele timer, minutter og sekunder. Vil du ikke mer, trykk inn et negativt tall.");

				svar = Integer.parseInt(tast);
			}
	}
}