import javax.swing.JOptionPane;

public class sekundtilminutt
{
   public static void main( String args[] )
   {
	   String førsteSifferstreng;

	   int førstetall;
	   int minutt;
	   minutt = 60;
	   int kvotient;

	   førsteSifferstreng = JOptionPane.showInputDialog("Skriv inn antall hele sekunder du vil ha omgjort til hele minutter");

	   førstetall = Integer.parseInt( førsteSifferstreng );

	   kvotient = førstetall / minutt;

	   String resultat;
	   resultat = førstetall + " sekunder er omtrent lik " + kvotient + " minutter.";

	   JOptionPane.showMessageDialog( null, resultat, "Resultater", JOptionPane.PLAIN_MESSAGE );
	   	  		   }
}
