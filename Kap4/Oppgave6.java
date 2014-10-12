import javax.swing.JOptionPane;

public class Oppgave6
{
   public static void main( String args[] )
   {
      String førsteSifferstreng;

      double radius = 0;
      double pi;
      pi = 3.14;
      double produkt;
      double omkrets;

      førsteSifferstreng = JOptionPane.showInputDialog("Før inn sirkelens radie som desimaltall (bruk desimalpunktum).");

      radius = Double.parseDouble (førsteSifferstreng);

      while ( radius >= 0)
	  {
      produkt = radius * radius * pi;
      omkrets = 2 * pi * radius;

      String resultat = "Sirkelens areal er " + produkt + ", og sirkelens omkrets er " + omkrets + ".";

      JOptionPane.showMessageDialog( null, resultat, "Resultater", JOptionPane.PLAIN_MESSAGE );

      førsteSifferstreng = JOptionPane.showInputDialog("Før inn sirkelens radie som desimaltall (bruk desimalpunktum).");

      radius = Double.parseDouble (førsteSifferstreng);
      }
   }
}