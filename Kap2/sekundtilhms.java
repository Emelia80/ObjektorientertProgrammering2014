import javax.swing.JOptionPane;

public class sekundtilhms
{
   public static void main( String args[] )
   {
	   String førsteSifferstreng;

	   int førstetall;
	   int minutt;
	   minutt = 60;
	   int time;
	   time = 3600;
	   int kvotienten;
	   int kvotientto;
	   int faktor;
	   int faktorto;
	   int minus;
	   int minusto;

	   førsteSifferstreng = JOptionPane.showInputDialog("Skriv inn antall hele sekunder du vil ha omgjort til hele timer, minutter og sekunder");

	   førstetall = Integer.parseInt( førsteSifferstreng );

	   kvotienten = førstetall / time; // regner ut hele timer
	   faktor = kvotienten * time; // regner ut hvor mange sekunder timene er
	   minus = førstetall - faktor; // regner ut hvor mange sekunder det er igjen til minuttene
	   kvotientto = minus / minutt; // regner ut hele minutter
	   faktorto = kvotientto * minutt; // regner ut hvor mange sekunder minuttene er
	   minusto = minus - faktorto; // regner ut hele sekunder

	   String resultat;
	   resultat = førstetall + " sekunder er lik " + kvotienten + " timer, " + kvotientto + " minutter og " + minusto + " sekunder.";

	   JOptionPane.showMessageDialog( null, resultat, "Resultater", JOptionPane.PLAIN_MESSAGE );
	}
}

