import javax.swing.JOptionPane;

public class Oppgave1
{
   public static void main( String args[] )
   {
	   String f�rsteSifferstreng;
	   String resultat;

	   int f�rstetall;

	   f�rsteSifferstreng =
	   JOptionPane.showInputDialog( "Skriv inn et heltall:" );

	   f�rstetall = Integer.parseInt( f�rsteSifferstreng );
       resultat = "";

       if ( f�rstetall % 3 == 0 )
       resultat = "Tallet er delelig p� 3";
       else
       resultat = "Tallet er ikke delelig p� 3";

       JOptionPane.showMessageDialog( null, resultat, "Resultat", JOptionPane.INFORMATION_MESSAGE );
	      }
}