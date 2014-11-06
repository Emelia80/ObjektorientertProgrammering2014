import javax.swing.JOptionPane;
import java.text.DecimalFormat;

// Klasse Sirkel
// double til radius
// radius skal ha verdi via konstruktørparameter
// Konstruktøren skal sjekke om radie >=0.0
// hvis ikke >=0, settes til 0.0
// get-metode som returnerer sirkelens radius
// skal ha følgende metoder:
	// public double diameter()
	// public double omkrets()
	// public double areal()
// bruke Math.PI i java.lang til konstanten pi

public class Sirkel_oppg1_kap6
{
   private double radius; // lokal variabel

   public void setRadius(double radiusInput) //henter radien som brukeren skrev inn i testfila
   {
	   if (radiusInput 	< 0.0)
	   {
		   radiusInput = 0.0; // gjør om radien til 0.0hvis den er negativ
	   }
	   else
	   radius = radiusInput; // hvis ikke blir radiusInputtil radius
   }
   public double getRadius() // lager en get-metode som returnerer radieverdien
   {
	   return radius;
   }
   public double diameter () // metode som returnerer diameteren
   {
	   return 2*radius;
   }
   public double omkrets () //  metode som returnerer omkretsen
   {
	   return Math.PI*2*radius;
   }
   public double areal () // metode som returnerer arealet
   {
	   return Math.PI*radius*radius;
   }
   public static DecimalFormat desimalKonvertering()
   {
	   String formateringsstreng = "#,###,##0.00";
	   DecimalFormat formateringsobjekt = new DecimalFormat(formateringsstreng);
	   return formateringsobjekt;
   }
}