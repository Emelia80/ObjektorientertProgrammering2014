import javax.swing.JOptionPane;

public class Sirkelareal
{
   public static void main( String args[] )
   {
      String førsteSifferstreng;

      double førstetall;
      double pi;
      pi = 3.14;
      double produkt;

      førsteSifferstreng = JOptionPane.showInputDialog("Før inn sirkelens radie som desimaltall (bruk desimalpunktum");

      førstetall = Double.parseDouble (førsteSifferstreng);

      produkt = førstetall * førstetall * pi;

      String resultat;
      resultat = "Sirkelens areal er " + produkt;

      JOptionPane.showMessageDialog( null, resultat, "Resultater", JOptionPane.PLAIN_MESSAGE );
	  		   }
}