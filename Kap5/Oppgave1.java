import javax.swing.JOptionPane;

public class Oppgave1
{
   public static void main( String args[] )
   {
	   int sum = 0; // skal inneholde summen

	   for ( int i = 2; i < 100; i += 2 ) // (initialisering - starter på 2; test - mindre enn 100; oppdatering - øke med 2)
	   sum += i; // instruksjon

	   JOptionPane.showMessageDialog( null, "Summen er " + sum ); //dialogboks som vises til slutt
   }
}
