import javax.swing.JOptionPane;

public class Oppgave12 // oppretter klassen Oppgave12
{
	 public static void main( String args[] )
   {
	   int år = 0;
	   String dialogboks = JOptionPane.showInputDialog("Tast inn et årstall for å sjekke om det er skuddår.");
	   String utskrift = "";
	   år = Integer.parseInt(dialogboks);
	   {
		   if (år%4==0 && år%100!=0)
		   utskrift = "Året " + år + " er et skuddår.";

		   else if (år%400==0)
		   utskrift = "Året " + år + " er et skuddår.";

		   else
		   utskrift = "Året " + år + " er ikke et skuddår.";

		   JOptionPane.showMessageDialog(null,utskrift,"Skuddår",JOptionPane.PLAIN_MESSAGE);
	   }
   }
}
