import javax.swing.JOptionPane;

public class Tidskonverterer
{
	public void setSekunder(int antSekunder)
	{
		antSekunder = setSekunder;
	}
	public String konvertertTid(int antSekunder)
	{
		int time;
		int minutt;
		int sekund;
		int sekundTime = 3600;
		int sekundMinutt = 60;

		time = antSekunder / sekundTime;
		antSekunder = antSekunder % sekundTime;
		minutt = antSekunder / sekundMinutt;
		antSekunder = antSekunder % sekundMinutt;
	  	sekund = antSekunder;

	  	String utskriftto;

		{
			if (time > 0 )
			utskriftto = time + " timer ";
		}
		{
			if (minutt > 0)
			utskriftto = utskriftto + minutt + " minutter ";
		}
		  	utskriftto = utskriftto + sekund + " sekunder. ";

		  	return utskriftto;

	}
}