import javax.swing.JOptionPane;

public class oppgave15
{
   public static void main( String args[] )
   {
	   String f�rsteSifferstreng;
	   String andreSifferstreng;
	   String tredjeSifferstreng;
	   String resultat;

	   f�rsteSifferstreng =
       JOptionPane.showInputDialog( "Skriv inn f�rste heltall" );

       andreSifferstreng =
       JOptionPane.showInputDialog( "Skriv inn andre heltall" );

       tredjeSifferstreng =
       JOptionPane.showInputDialog( "Skriv inn tredje heltall" );

       int f�rstetall;
       int andretall;
       int tredjetall;

       f�rstetall = Integer.parseInt( f�rsteSifferstreng );
       andretall = Integer.parseInt( andreSifferstreng );
       tredjetall = Integer.parseInt ( tredjeSifferstreng );
       resultat = "";

       if ( (f�rstetall==andretall) && ( andretall == tredjetall) )
	            resultat = "Tallene er like store";

	   if ( (f�rstetall < andretall) && (f�rstetall < tredjetall) )
	            resultat = f�rstetall + " er minst";

	   if ( (andretall < f�rstetall) && (andretall < tredjetall) )
	            resultat = andretall + " er minst";

	   if ( (tredjetall < f�rstetall) && (tredjetall < andretall) )
	   			resultat = tredjetall + " er minst";

	   JOptionPane.showMessageDialog( null, resultat, "Sammenlikningsresultater",
	            JOptionPane.INFORMATION_MESSAGE );
	      }
}