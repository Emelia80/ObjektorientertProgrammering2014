import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

public class LagFil
{
	private Formatter output; // objekt av klassen Formatter for å lese data til fil

	// åpner fila
	public void aapneFil()
	{
		try
		{
			output = new Formatter ("Klasseliste.txt"); // åpner fila Klasseliste.txt for skriving, hvis den ikke finnes, opprettes den
		} // end try
		catch (SecurityException securityException)
		{
			JOptionPane.showMessageDialog(null, "", "Du har ikke skriverettigheter til denne fila.",JOptionPane.PLAIN_MESSAGE);
		} // end catch
		catch (FileNotFoundException fileNotFoundException)
		{
			JOptionPane.showMessageDialog(null, "", "Feil ved åpning av fila.", JOptionPane.PLAIN_MESSAGE);
		} // end catch
	} // end aapneFil

	// leser poster til fila
	public void leggTilElev()
	{
		// objekter som skal leses til fil
		ElevPost elev = new ElevPost();

		int svar = JOptionPane.showOptionDialog(null, "Vil du lese inn flere elever?", "Elever", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null,null);
		while (svar == JOptionPane.YES_OPTION)
		{
			int elevnr = Integer.parseInt(JOptionPane.showInputDialog("Tast inn elevnummeret."));
			String fNavn = JOptionPane.showInputDialog("Tast inn elevens fornavn.");
			String eNavn = JOptionPane.showInputDialog("Tast inn elevens etternavn.");
			int karakter = Integer.parseInt(JOptionPane.showInputDialog("Tast inn gitt karakter."));

			try
			{
				elev.setElevNummer(elevnr);
				elev.setForNavn(fNavn);
				elev.setEtterNavn(eNavn);
				elev.setKarakter(karakter);

				if (elev.getElevNummer() > 0)
				{
					// her leses verdiene til fila
					output.format("%d %s %s %d\n", elev.getElevNummer(), elev.getForNavn(), elev.getEtterNavn(), elev.getKarakter());
				} // end if

				else

				{
					JOptionPane.showMessageDialog(null, "", "Elevnummeret må være større enn 0.", JOptionPane.PLAIN_MESSAGE);
				}// end else
			}// end try
			catch (FormatterClosedException formatterClosedException)
			{
				JOptionPane.showMessageDialog(null, "", "Feil ved skriving til fil.", JOptionPane.PLAIN_MESSAGE);
				return;
			} // end catch
			catch (NoSuchElementException elementException)
			{
				JOptionPane.showMessageDialog(null, "", "Feil input, prøv igjen.", JOptionPane.PLAIN_MESSAGE);
			} // end catch
			svar = JOptionPane.showOptionDialog(null, "Vil du lese inn flere elever?", "Elever", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		} // end while
	} // end leggTilElev

	// lukk fila
	public void lukkFil()
	{
		if (output != null)
		output.close();
	} // end public void lukkFil
} // end public class LagFil