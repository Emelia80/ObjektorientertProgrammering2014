import javax.swing.JOptionPane;

public class Addisjon-desimaltall
{
	public static void main( String args[] )
	{
		String førsteSifferstreng;
		String andreSifferstreng;
		
		double førstetall;
		double andretall;
		double sum;
		
		førsteSifferstreng = JOptionPane.showInputDialog(
		      		"Skriv inn første desimal - bruk . og ikke ," );
		
		      andreSifferstreng =
		         JOptionPane.showInputDialog( "Skriv inn andre desimaltall - bruk . og ikke ," );
		
		      førstetall = Integer.parseInt( førsteSifferstreng );
		      andretall = Integer.parseInt( andreSifferstreng );
		
		      sum = førstetall + andretall;
		
		      String resultat;
		      resultat = førsteSifferstreng + " + " + andreSifferstreng + " = " + sum;
		
		      JOptionPane.showMessageDialog( null, resultat, "Resultater", JOptionPane.PLAIN_MESSAGE );
		   }
}