import javax.swing.JOptionPane;
public class Oppgave10 // oppretter klassen Oppgave10
{
	 public static void main( String args[] )
   {
	   int dag;
	   String ukedag = "";
	   String dialogboks = "";
	   dialogboks = JOptionPane.showInputDialog("Skriv inn et tall fra 1-7");
	   dag = Integer.parseInt (dialogboks);

	   while (dag > 0)
	   {

	   switch (dag)
	   {
		   case 1: ukedag = "mandag";
		   		break;
		   case 2: ukedag = "tirsdag";
		   		break;
		   case 3: ukedag = "onsdag";
		   		break;
		   case 4: ukedag = "torsdag";
		   		break;
		   case 5: ukedag = "fredag";
		   		break;
		   case 6: ukedag = "l�rdag";
		   		break;
		   case 7: ukedag = "s�ndag";
		   		break;
		   default: ukedag = "ukjent dag";
		   		break; // un�dvendig, men tas med for � huske overalt

	   }
	   JOptionPane.showMessageDialog(null, "Din ukedag ble: " + ukedag, "Ukedager", JOptionPane.PLAIN_MESSAGE);

	   dialogboks = JOptionPane.showInputDialog("Skriv inn et tall fra 1-7");
	   dag = Integer.parseInt (dialogboks); // s� det nullstilles f�r neste runde
   	   }

	}
}