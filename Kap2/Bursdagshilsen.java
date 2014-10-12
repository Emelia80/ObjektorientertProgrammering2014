import javax.swing.JOptionPane;

public class Bursdagshilsen
{
   public static void main( String args[] )
   {
	   String navn;
	   navn = JOptionPane.showInputDialog("Hva heter du?");

	   String foedselsaar;
	   foedselsaar = JOptionPane.showInputDialog("Hvilket år ble du født?");

		int førstetall;
		int idag;
		idag = 2014;
        int sum;

	    førstetall = Integer.parseInt( foedselsaar );

	    sum = idag - førstetall;

	   String utskrift;
		utskrift = "Hei og hopp, " + navn + ", i år fyller du " + sum + " år!";

		JOptionPane.showMessageDialog( null, utskrift, "Gratulerer!!", JOptionPane.PLAIN_MESSAGE );
			  		   }
}