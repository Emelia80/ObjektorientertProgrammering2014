import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Oppgave6 // oppretter klassen Oppgave6B
{
   public static void main( String args[] )
   {
	   JTextArea tekstomr�de = new JTextArea(); // oppretter et tekstomr�de

	   tekstomr�de.setText("Uttrukne tall\n"); // lager overskrift i tekstomr�det + linjeskift

	   int st�rstenr = 0;
	   int nestst�rstenr = 0;
	   int nestminstenr = 0;
	   int minstenr = 0;

	   for (int i = 0; i < 100; i += 1)
	   {

	   int Tall = (int)(Math.random()*100);
	   tekstomr�de.append(Tall + "\t" ); // tilf�ying til tekstomr�det

	   if (i==9)
	   tekstomr�de.append("\n");
	   if (i==19)
	   tekstomr�de.append("\n");
	   if (i==29)
	   tekstomr�de.append("\n");
	   if (i==39)
	   tekstomr�de.append("\n");
	   if (i==49)
	   tekstomr�de.append("\n");
	   if (i==59)
	   tekstomr�de.append("\n");
	   if (i==69)
	   tekstomr�de.append("\n");
	   if (i==79)
	   tekstomr�de.append("\n");
	   if (i==89)
	   tekstomr�de.append("\n");

	   if(Tall>st�rstenr)
	   {
		   nestst�rstenr=st�rste(st�rstenr,nestst�rstenr);
	   	   st�rstenr=st�rste(Tall,st�rstenr);

       }
       {
		   private static int st�rste(int sisteTall, int st�rst)
	   }
       {
		   if (sisteTall>st�rst)
		   st�rst=sisteTall;
	   	   return st�rst;
	   }

       JOptionPane.showMessageDialog( null, tekstomr�de, "Slumptall", JOptionPane.PLAIN_MESSAGE); // Viser resultatboks
   } // Avslutter main
} // Avslutter klassen Oppgave6B