import javax.swing.JOptionPane;

public class Tidskonvertering
{
	public static void main( String args[] )
	{
		Tidskonverterer konvertering = new Tidskonverterer();
		int Sekunder = Integer.parseInt(JOptionPane.showInputDialog("Tast inn antall sekunder, takk!"));
		String utskrift;


		while (Sekunder >= 0)
			{

		    konvertering.setSekunder(antSekunder);


			utskrift = konvertering.utskriftto();
            JOptionPane.showMessageDialog(null, utskrift, "Omgj�ring", JOptionPane.PLAIN_MESSAGE);

            Sekunder = Integer.parseInt(JOptionPane.showInputDialog("Tast inn antall sekunder, takk!"));
		    }
		    	JOptionPane.showMessageDialog(null, "Der b�sja du p� leggen! Farvel!");
	}
}