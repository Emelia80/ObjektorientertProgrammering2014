import javax.swing.JOptionPane;

public class sekundtilminutt
{
   public static void main( String args[] )
   {
	   String f�rsteSifferstreng;

	   int f�rstetall;
	   int minutt;
	   minutt = 60;
	   int kvotient;

	   f�rsteSifferstreng = JOptionPane.showInputDialog("Skriv inn antall hele sekunder du vil ha omgjort til hele minutter");

	   f�rstetall = Integer.parseInt( f�rsteSifferstreng );

	   kvotient = f�rstetall / minutt;

	   String resultat;
	   resultat = f�rstetall + " sekunder er omtrent lik " + kvotient + " minutter.";

	   JOptionPane.showMessageDialog( null, resultat, "Resultater", JOptionPane.PLAIN_MESSAGE );
	   	  		   }
}
