import javax.swing.JOptionPane;
import java.text.DecimalFormat;

// = testprogram for sirkel-klassen
// skal lese inn radius fra brukeren
// bruke verdien (radien) som konstruktørparameter ved opprettelsen av et Sirkel-objekt
// skal skrive ut data for sirkelen med radius, diameter, omkrets og areal
// utskriften skal ha 2 desimaler

public class Sirkeltest_oppg1_kap6
{
	public static void main( String args[] )
	{
		Sirkel_oppg1_kap6 sirkelData = new Sirkel_oppg1_kap6(); // oppretter konstruktør

		double radiusInput = Double.parseDouble (JOptionPane.showInputDialog(null, "Skriv inn sirkelens radius - bruk desimalpunktum."));
		sirkelData.setRadius(radiusInput); // gir setRadius verdien radiusInput

		DecimalFormat formateringsobjekt = sirkelData.desimalKonvertering();
		String utskriftRadius = formateringsobjekt.format(sirkelData.getRadius());
		String utskriftDiameter = formateringsobjekt.format(sirkelData.diameter());
		String utskriftOmkrets = formateringsobjekt.format(sirkelData.omkrets());
		String utskriftAreal = formateringsobjekt.format(sirkelData.areal());

		String utskrift =
		"Radius: " + utskriftRadius +
		"\nDiameter: " + utskriftDiameter +
		"\nOmkrets: " + utskriftOmkrets +
		"\nAreal: " + utskriftAreal; //hva som skal skrives ut

		JOptionPane.showMessageDialog(null, utskrift);
	}
}

