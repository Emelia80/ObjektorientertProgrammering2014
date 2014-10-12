import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave6 // oppretter klassen Oppgave6
{
   public static void main( String args[] )
   {
	   JTextArea tekstområde = new JTextArea(); // oppretter et tekstområde

	   tekstområde.setText("Uttrukne tall\n\n"); // lager overskrift i tekstområdet + dobbel linjeskift

	   int nedregrense = 1;
	   int ovregrense = 100;
	   int storst = nedregrense;
	   int neststorst = nedregrense;
	   int minst = ovregrense;
	   int nestminst = ovregrense;

	   for (int x = nedregrense; x <= ovregrense; x += 1)
	   {

	   int Tall = (int)(Math.random()*100);
	   tekstområde.append(Tall + "\t" ); // tilføying til tekstområdet - lager mellomrom mellom talla, som gjør at det blir kolonner.

	   if (x % 10 == 0 && x > 0) // Når tallet kan deles på 10, og er større enn null, blir det linjeskift.
	   {
		   tekstområde.append("\n");
	   }

	   if (Tall > storst) // De neste fire if-setningene leiter etter største, neststørste, nestminste og minste tallet.
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

       tekstområde.append("\n\n Det største uttrukne tallet er: " + storst); // utskrifter
       tekstområde.append("\n Det neststørste uttrukne tallet er: " + neststorst);
       tekstområde.append("\n Det nestminste uttrukne tallet er: " + nestminst);
       tekstområde.append("\n Det minste uttrukne tallet er: " + minst);
       JOptionPane.showMessageDialog( null, tekstområde, "Slumptall", JOptionPane.PLAIN_MESSAGE); // Viser resultatboks
   } // Avslutter main
} // Avslutter klassen Oppgave6