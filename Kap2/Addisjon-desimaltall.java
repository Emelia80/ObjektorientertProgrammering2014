import javax.swing.JOptionPane;

public class Addisjon-desimaltall
{
	public static void main( String args[] )
	{
		String f�rsteSifferstreng;
		String andreSifferstreng;
		
		double f�rstetall;
		double andretall;
		double sum;
		
		f�rsteSifferstreng = JOptionPane.showInputDialog(
		      		"Skriv inn f�rste desimal - bruk . og ikke ," );
		
		      andreSifferstreng =
		         JOptionPane.showInputDialog( "Skriv inn andre desimaltall - bruk . og ikke ," );
		
		      f�rstetall = Integer.parseInt( f�rsteSifferstreng );
		      andretall = Integer.parseInt( andreSifferstreng );
		
		      sum = f�rstetall + andretall;
		
		      String resultat;
		      resultat = f�rsteSifferstreng + " + " + andreSifferstreng + " = " + sum;
		
		      JOptionPane.showMessageDialog( null, resultat, "Resultater", JOptionPane.PLAIN_MESSAGE );
		   }
}