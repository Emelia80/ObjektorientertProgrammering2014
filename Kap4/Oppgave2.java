import javax.swing.JOptionPane;

public class Oppgave2
{
   public static void main( String args[] )
   {
	   String dialogboks;
	   String resultat = "";

	   int vekt;

	   dialogboks = JOptionPane.showInputDialog( "Skriv inn brevets vekt i hele gram." );
	   vekt = Integer.parseInt(dialogboks);

	   int porto = 0;
	   if(vekt <= 20)
	       porto = 9;
	   else if(vekt <= 50)
	       porto = 14;
	   else if(vekt <= 100)
	       porto = 17;
	   else if(vekt <= 350)
	       porto = 27;
	   else if(vekt <= 1000)
	       porto = 67;
	   else if(vekt <= 2000)
	       porto = 145;

	   if (vekt > 2000)
	       resultat = "Brevet er for tungt til å postes.";
	   else
	       resultat = "Det koster " + porto + " kroner å poste dette brevet.";

	   JOptionPane.showMessageDialog ( null, resultat, "Resultat", JOptionPane.INFORMATION_MESSAGE );
   	}
}