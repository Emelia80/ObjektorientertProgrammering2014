import javax.swing.JOptionPane;

public class Bursdagshilsen
{
   public static void main( String args[] )
   {
	   String navn;
	   navn = JOptionPane.showInputDialog("Hva heter du?");

	   String foedselsaar;
	   foedselsaar = JOptionPane.showInputDialog("Hvilket �r ble du f�dt?");

		int f�rstetall;
		int idag;
		idag = 2014;
        int sum;

	    f�rstetall = Integer.parseInt( foedselsaar );

	    sum = idag - f�rstetall;

	   String utskrift;
		utskrift = "Hei og hopp, " + navn + ", i �r fyller du " + sum + " �r!";

		JOptionPane.showMessageDialog( null, utskrift, "Gratulerer!!", JOptionPane.PLAIN_MESSAGE );
			  		   }
}