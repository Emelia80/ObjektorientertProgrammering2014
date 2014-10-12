import javax.swing.JOptionPane;

public class Oppgave11 // oppretter klassen Oppgave11
{
	 public static void main( String args[] )
   {
	   int antDager = 0;
	   String dialogboks = "";
	   String mnd = JOptionPane.showInputDialog("Tast inn en måned.");
	   mnd = mnd.toLowerCase();

	   switch (mnd)
	   {
		   case "april":
		   case "juni":
		   case "september":
		   case "november": antDager = 30;
		   			break;
		   case "februar":  antDager = 28;
		   			break;
		   case "januar":
		   case "mars":
		   case "mai":
		   case "juli":
		   case "august":
		   case "oktober":
		   case "desember": antDager = 31;
		   			break;
	   }
	   JOptionPane.showMessageDialog(null, "Det er " + antDager + " dager i " + mnd, "Dager i måneden", JOptionPane.PLAIN_MESSAGE);
   }
}
