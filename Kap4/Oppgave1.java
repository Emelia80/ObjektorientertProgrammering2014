import javax.swing.JOptionPane;

public class Oppgave1
{
   public static void main( String args[] )
   {
	   String førsteSifferstreng;
	   String resultat;

	   int førstetall;

	   førsteSifferstreng =
	   JOptionPane.showInputDialog( "Skriv inn et heltall:" );

	   førstetall = Integer.parseInt( førsteSifferstreng );
       resultat = "";

       if ( førstetall % 3 == 0 )
       resultat = "Tallet er delelig på 3";
       else
       resultat = "Tallet er ikke delelig på 3";

       JOptionPane.showMessageDialog( null, resultat, "Resultat", JOptionPane.INFORMATION_MESSAGE );
	      }
}