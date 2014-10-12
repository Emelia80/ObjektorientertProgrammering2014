import javax.swing.JOptionPane;

public class Oppgave3
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

	  	    	String utskrift = "Omgjort blir det " + time + " timer " + minutt + " minutter og " + sekund + " sekunder.";

				JOptionPane.showMessageDialog (null, utskrift, "Resultat", JOptionPane.PLAIN_MESSAGE);

				tast = JOptionPane.showInputDialog("Tast inn antall hele sekunder du vil ha omgjort til hele timer, minutter og sekunder. Vil du ikke mer, trykk inn et negativt tall.");

				svar = Integer.parseInt(tast);
			}
	}
}
