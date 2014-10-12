import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ekstraoppg_kap5 // oppretter klassen Ekstraoppgave_kap5
{
	 public static void main( String args[] )
   {
	   int heltall, engangen, togangen, tregangen, firegangen, femgangen, seksgangen, sjugangen,aattegangen, nigangen, tigangen = 0;
	   String dialogboks = JOptionPane.showInputDialog("Tast inn et heltall mellom 0 og 10.");
	   String utskrift = "";
	   heltall = Integer.parseInt(dialogboks);

	   JTextArea tekstområde = new JTextArea(); // oppretter et tekstområde

	   {


	   		if (heltall >= 0 && heltall < 11)
	   		{
	   		engangen = heltall * 1;
	   		togangen = heltall * 2;
	   		tregangen = heltall * 3;
	   		firegangen = heltall * 4;
	   		femgangen = heltall * 5;
	   		seksgangen = heltall * 6;
	   		sjugangen = heltall * 7;
	   		aattegangen = heltall * 8;
	   		nigangen = heltall * 9;
	   		tigangen = heltall * 10;

	   		tekstområde.setText(heltall + "-gangen\n"); // lager overskriften + linjeskift
	   		tekstområde.append(heltall + " * 1 = " + engangen + "\n");
	   		tekstområde.append(heltall + " * 2 = " + togangen + "\n");
	   		tekstområde.append(heltall + " * 3 = " + tregangen + "\n");
	   		tekstområde.append(heltall + " * 4 = " + firegangen + "\n");
	   		tekstområde.append(heltall + " * 5 = " + femgangen + "\n");
	   		tekstområde.append(heltall + " * 6 = " + seksgangen + "\n");
	   		tekstområde.append(heltall + " * 7 = " + sjugangen + "\n");
	   		tekstområde.append(heltall + " * 8 = " + aattegangen + "\n");
	   		tekstområde.append(heltall + " * 9 = " + nigangen + "\n");
	   		tekstområde.append(heltall + " * 10 = " + tigangen + "\n");
			}
			else
			tekstområde.setText("Du har skrevet et tall utenfor intervallet 0-10, fy deg!!");
		}
			JOptionPane.showMessageDialog( null, tekstområde);
		} // avslutter main
	} // Avslutter Ekstraoppg_kap5

