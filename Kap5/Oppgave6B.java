import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave6 // oppretter klassen Oppgave6B
{
   public static void main( String args[] )
   {
	   JTextArea tekstområde = new JTextArea(); // oppretter et tekstområde

	   tekstområde.setText("Uttrukne tall\n"); // lager overskrift i tekstområdet + linjeskift

	   int størstenr = 0;
	   int neststørstenr = 0;
	   int nestminstenr = 0;
	   int minstenr = 0;

	   for (int i = 0; i < 100; i += 1)
	   {

	   int Tall = (int)(Math.random()*100);
	   tekstområde.append(Tall + "\t" ); // tilføying til tekstområdet

	   if (i==9)
	   tekstområde.append("\n");
	   if (i==19)
	   tekstområde.append("\n");
	   if (i==29)
	   tekstområde.append("\n");
	   if (i==39)
	   tekstområde.append("\n");
	   if (i==49)
	   tekstområde.append("\n");
	   if (i==59)
	   tekstområde.append("\n");
	   if (i==69)
	   tekstområde.append("\n");
	   if (i==79)
	   tekstområde.append("\n");
	   if (i==89)
	   tekstområde.append("\n");

	   if(Tall>størstenr)
	   {
		   neststørstenr=største(størstenr,neststørstenr);
	   	   størstenr=største(Tall,størstenr);

       }
       {
		   private static int største(int sisteTall, int størst)
	   }
       {
		   if (sisteTall>størst)
		   størst=sisteTall;
	   	   return størst;
	   }

       JOptionPane.showMessageDialog( null, tekstområde, "Slumptall", JOptionPane.PLAIN_MESSAGE); // Viser resultatboks
   } // Avslutter main
} // Avslutter klassen Oppgave6B