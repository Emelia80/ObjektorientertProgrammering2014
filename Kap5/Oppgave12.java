import javax.swing.JOptionPane;

public class Oppgave12 // oppretter klassen Oppgave12
{
	 public static void main( String args[] )
   {
	   int �r = 0;
	   String dialogboks = JOptionPane.showInputDialog("Tast inn et �rstall for � sjekke om det er skudd�r.");
	   String utskrift = "";
	   �r = Integer.parseInt(dialogboks);
	   {
		   if (�r%4==0 && �r%100!=0)
		   utskrift = "�ret " + �r + " er et skudd�r.";

		   else if (�r%400==0)
		   utskrift = "�ret " + �r + " er et skudd�r.";

		   else
		   utskrift = "�ret " + �r + " er ikke et skudd�r.";

		   JOptionPane.showMessageDialog(null,utskrift,"Skudd�r",JOptionPane.PLAIN_MESSAGE);
	   }
   }
}
