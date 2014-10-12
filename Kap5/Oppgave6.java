import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave6 // oppretter klassen Oppgave6
{
   public static void main( String args[] )
   {
	   JTextArea tekstomr�de = new JTextArea(); // oppretter et tekstomr�de

	   tekstomr�de.setText("Uttrukne tall\n\n"); // lager overskrift i tekstomr�det + dobbel linjeskift

	   int nedregrense = 1;
	   int ovregrense = 100;
	   int storst = nedregrense;
	   int neststorst = nedregrense;
	   int minst = ovregrense;
	   int nestminst = ovregrense;

	   for (int x = nedregrense; x <= ovregrense; x += 1)
	   {

	   int Tall = (int)(Math.random()*100);
	   tekstomr�de.append(Tall + "\t" ); // tilf�ying til tekstomr�det - lager mellomrom mellom talla, som gj�r at det blir kolonner.

	   if (x % 10 == 0 && x > 0) // N�r tallet kan deles p� 10, og er st�rre enn null, blir det linjeskift.
	   {
		   tekstomr�de.append("\n");
	   }

	   if (Tall > storst) // De neste fire if-setningene leiter etter st�rste, nestst�rste, nestminste og minste tallet.
	   {
		   neststorst = storst;
		   storst = Tall;
	   }
	   if (Tall > neststorst && Tall < storst)
	   neststorst = Tall;

	   if (Tall < minst)
	   {
		   nestminst = minst;
		   minst = Tall;
	   }

	   if (Tall < nestminst && Tall > minst)
	   nestminst = Tall;

       }

       tekstomr�de.append("\n\n Det st�rste uttrukne tallet er: " + storst); // utskrifter
       tekstomr�de.append("\n Det nestst�rste uttrukne tallet er: " + neststorst);
       tekstomr�de.append("\n Det nestminste uttrukne tallet er: " + nestminst);
       tekstomr�de.append("\n Det minste uttrukne tallet er: " + minst);
       JOptionPane.showMessageDialog( null, tekstomr�de, "Slumptall", JOptionPane.PLAIN_MESSAGE); // Viser resultatboks
   } // Avslutter main
} // Avslutter klassen Oppgave6