import javax.swing.JOptionPane;

public class Sirkelareal
{
   public static void main( String args[] )
   {
      String f�rsteSifferstreng;

      double f�rstetall;
      double pi;
      pi = 3.14;
      double produkt;

      f�rsteSifferstreng = JOptionPane.showInputDialog("F�r inn sirkelens radie som desimaltall (bruk desimalpunktum");

      f�rstetall = Double.parseDouble (f�rsteSifferstreng);

      produkt = f�rstetall * f�rstetall * pi;

      String resultat;
      resultat = "Sirkelens areal er " + produkt;

      JOptionPane.showMessageDialog( null, resultat, "Resultater", JOptionPane.PLAIN_MESSAGE );
	  		   }
}