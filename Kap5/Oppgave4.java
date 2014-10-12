import javax.swing.JOptionPane;

public class Oppgave4
{
   public static void main( String args[] )
   {
	   // sikre at variablene er nullstilt
	   int sum=0;
	   int big=0;
	   int low=0;

	   // til utskriftene senere
	   String utskrift="";

	   // for at brukeren skal skrive inn grensene
	   big=Integer.parseInt(JOptionPane.showInputDialog("Tast inn øvre grense for summeringen."));
	   low=Integer.parseInt(JOptionPane.showInputDialog("Tast inn nedre grense for summeringen."));

	   // if-setning som sjekker at det som er satt inn som nedre grense virkelig er det laveste tallet
	   if (low<big)
	   {
		   // gjør at programmet summerer
		   sum=summen(low,big);

		   utskrift+="Summen av alle hele tall mellom grensene er " + sum;
		   JOptionPane.showMessageDialog( null, utskrift );
   	   }

	   // hvis ikke tallet som var satt inn som nedre grense virkelig var det laveste tallet
	   else
	   {
	   		utskrift+="Øvre grense er mindre enn eller lik nedre grense, programmet avsluttes derfor.";
	   		JOptionPane.showMessageDialog( null, utskrift );
       }
   }

       // metode som gjør at formelen for summering i if-setningen fungerer
       private static int summen(int low2, int big2)

	   {
	   int summen=0;
	   // (initialisering; test; oppdatering - løkken skal starte med den nedre grensen og summere alle heltall fram til den kommer til den øvre grensen)
	   for ( int i = low2; i < big2; i += 1 )
	   {
	   // instruksjon - at programmet skal summere heltallene mellom øvre og nedre grense
	   summen+=i;
   	   }
   	   return summen;
       }
   }



