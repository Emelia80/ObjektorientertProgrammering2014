import javax.swing.JOptionPane;

public class oppgave15
{
   public static void main( String args[] )
   {
	   String førsteSifferstreng;
	   String andreSifferstreng;
	   String tredjeSifferstreng;
	   String resultat;

	   førsteSifferstreng =
       JOptionPane.showInputDialog( "Skriv inn første heltall" );

       andreSifferstreng =
       JOptionPane.showInputDialog( "Skriv inn andre heltall" );

       tredjeSifferstreng =
       JOptionPane.showInputDialog( "Skriv inn tredje heltall" );

       int førstetall;
       int andretall;
       int tredjetall;

       førstetall = Integer.parseInt( førsteSifferstreng );
       andretall = Integer.parseInt( andreSifferstreng );
       tredjetall = Integer.parseInt ( tredjeSifferstreng );
       resultat = "";

       if ( (førstetall==andretall) && ( andretall == tredjetall) )
	            resultat = "Tallene er like store";

	   if ( (førstetall < andretall) && (førstetall < tredjetall) )
	            resultat = førstetall + " er minst";

	   if ( (andretall < førstetall) && (andretall < tredjetall) )
	            resultat = andretall + " er minst";

	   if ( (tredjetall < førstetall) && (tredjetall < andretall) )
	   			resultat = tredjetall + " er minst";

	   JOptionPane.showMessageDialog( null, resultat, "Sammenlikningsresultater",
	            JOptionPane.INFORMATION_MESSAGE );
	      }
}