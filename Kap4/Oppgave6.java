import javax.swing.JOptionPane;

public class Oppgave6
{
   public static void main( String args[] )
   {
      String f�rsteSifferstreng;

      double radius = 0;
      double pi;
      pi = 3.14;
      double produkt;
      double omkrets;

      f�rsteSifferstreng = JOptionPane.showInputDialog("F�r inn sirkelens radie som desimaltall (bruk desimalpunktum).");

      radius = Double.parseDouble (f�rsteSifferstreng);

      while ( radius >= 0)
	  {
      produkt = radius * radius * pi;
      omkrets = 2 * pi * radius;

      String resultat = "Sirkelens areal er " + produkt + ", og sirkelens omkrets er " + omkrets + ".";

      JOptionPane.showMessageDialog( null, resultat, "Resultater", JOptionPane.PLAIN_MESSAGE );

      f�rsteSifferstreng = JOptionPane.showInputDialog("F�r inn sirkelens radie som desimaltall (bruk desimalpunktum).");

      radius = Double.parseDouble (f�rsteSifferstreng);
      }
   }
}