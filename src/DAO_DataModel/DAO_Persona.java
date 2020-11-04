package DAO_DataModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TreeMap;
import Enum.NivelResponsabilidad;
import Enum.Pais;
import Enum.ZonaBarco;
import pojo.Pasajero;
import pojo.Persona;
import pojo.Tripulante;

public class DAO_Persona extends TreeMap<String, Persona>{
	private static DAO_Persona daoSingleton;
	
	public static DAO_Persona getInstance() {
		if(daoSingleton == null) {
			daoSingleton = new DAO_Persona();
		}
		
		return daoSingleton;
	}
	
	private DAO_Persona() {
		//super();
		try {
			//Pasajeros
			this.put("11224455R"+"-"+Pais.Italia.toString(), new Pasajero("11224455R", "Alfred Gutenach", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/02/2010"), Pais.Italia, ZonaBarco.Babor, 22));
			this.put("11224455E"+"-"+Pais.Italia.toString(), new Pasajero("11224455E", "Maria Gutenach", false, new SimpleDateFormat("dd/MM/yyyy").parse("13/03/1995"), Pais.Italia, ZonaBarco.Babor, 22));
			this.put("11224455A"+"-"+Pais.Italia.toString(), new Pasajero("11224455A", "Gustav Gutenach", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1998"), Pais.Italia, ZonaBarco.Babor, 22));
			this.put("11224455R"+"-"+Pais.Italia.toString(), new Pasajero("11224455R", "Valentino Pellegrinno", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Babor, 23));
			this.put("22445335T"+"-"+Pais.España.toString(), new Pasajero("22445335T", "Antonio Banderas", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/04/1957"), Pais.España, ZonaBarco.Babor, 25));
			this.put("11224455R"+"-"+Pais.España.toString(), new Pasajero("11224455R", "Penelope Cruz", false, new SimpleDateFormat("dd/MM/yyyy").parse("16/09/1977"), Pais.España, ZonaBarco.Babor, 24));
			this.put("32597466O"+"-"+Pais.España.toString(), new Pasajero("32597466O", "Javier Bardem", false, new SimpleDateFormat("dd/MM/yyyy").parse("02/02/1972"), Pais.España, ZonaBarco.Babor, 24));
			this.put("31226984W"+"-"+Pais.Italia.toString(), new Pasajero("31226984W", "Miguel Bosé", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/06/1965"), Pais.Italia, ZonaBarco.Babor, 26));
			this.put("11224455R"+"-"+Pais.Italia.toString(), new Pasajero("11224455R", "Hugo Bosé", false, new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2017"), Pais.Italia, ZonaBarco.Babor, 26));
			this.put("31848712C"+"-"+Pais.Italia.toString(), new Pasajero("31848712C", "Belinda Pellegrinni", false, new SimpleDateFormat("dd/MM/yyyy").parse("10/04/1965"), Pais.Italia, ZonaBarco.Babor, 26));
			this.put("45114724U"+"-"+Pais.Italia.toString(), new Pasajero("45114724U", "Maria Petronillia", false, new SimpleDateFormat("dd/MM/yyyy").parse("01/08/1985"), Pais.Italia, ZonaBarco.Babor, 26));
			this.put("58774169T"+"-"+Pais.Francia.toString(), new Pasajero("58774169T", "Pierre LePardiez", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/08/1988"), Pais.Francia, ZonaBarco.Babor, 27));
			this.put("145569874L"+"-"+Pais.Francia.toString(), new Pasajero("145569874L", "Manuel Leroy", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/05/1994"), Pais.Francia, ZonaBarco.Babor, 27));
			this.put("36541123T"+"-"+Pais.Francia.toString(), new Pasajero("36541123T", "Enrick LePasteur", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/09/1964"), Pais.Francia, ZonaBarco.Babor, 28));
			this.put("41547798O"+"-"+Pais.Francia.toString(), new Pasajero("41547798O", "Aracellie Madariegueur", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Babor, 28));
			this.put("25447152Z"+"-"+Pais.Francia.toString(), new Pasajero("25447152Z", "Francesc LePasteur", false, new SimpleDateFormat("dd/MM/yyyy").parse("12/02/1999"), Pais.Francia, ZonaBarco.Babor, 28));
			this.put("32224569W"+"-"+Pais.Francia.toString(), new Pasajero("32224569W", "Moreau LePasteur", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/01/1935"), Pais.Francia, ZonaBarco.Babor, 28));
			this.put("11458796L"+"-"+Pais.ReinoUnido.toString(), new Pasajero("11458796L", "Anthony Recio", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/09/1966"), Pais.ReinoUnido, ZonaBarco.Babor, 29));
			this.put("31569987H"+"-"+Pais.ReinoUnido.toString(), new Pasajero("31569987H", "Berta Smith", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/07/1969"), Pais.ReinoUnido, ZonaBarco.Babor, 29));
			this.put("36784927T"+"-"+Pais.ReinoUnido.toString(), new Pasajero("36784927T", "Violet Recio", true, new SimpleDateFormat("dd/MM/yyyy").parse("04/01/1967"), Pais.ReinoUnido, ZonaBarco.Babor, 29));
			this.put("22459864E"+"-"+Pais.ReinoUnido.toString(), new Pasajero("22459864E", "Albert Recio", false, new SimpleDateFormat("dd/MM/yyyy").parse("19/07/1997"), Pais.ReinoUnido, ZonaBarco.Babor, 29));
			this.put("36951975Y"+"-"+Pais.Alemania.toString(), new Pasajero("36951975Y", "Leo Singleton", false, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1987"), Pais.Alemania, ZonaBarco.Babor, 21));
			this.put("37459267U"+"-"+Pais.Alemania.toString(), new Pasajero("37459267U", "Eva Hoffman", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/04/1990"), Pais.Alemania, ZonaBarco.Babor, 21));
			this.put("31584637N"+"-"+Pais.Alemania.toString(), new Pasajero("31584637N", "Alexander Bauer", false, new SimpleDateFormat("dd/MM/yyyy").parse("10/11/1987"), Pais.Alemania, ZonaBarco.Babor, 21));
			this.put("33365423B"+"-"+Pais.Alemania.toString(), new Pasajero("33365423B", "Melanie Bauer", false, new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2011"), Pais.Alemania, ZonaBarco.Babor, 21));
			this.put("37953698X"+"-"+Pais.Alemania.toString(), new Pasajero("37953698X", "Richard Bauer", false, new SimpleDateFormat("dd/MM/yyyy").parse("11/04/2009"), Pais.Alemania, ZonaBarco.Babor, 21));
			this.put("34985621F"+"-"+Pais.Italia.toString(), new Pasajero("34985621F", "Rodrigo Pellegrinno", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/02/1962"), Pais.Italia, ZonaBarco.Babor, 23));
			this.put("31259746X"+"-"+Pais.Italia.toString(), new Pasajero("31259746X", "Marina Valentinna", false, new SimpleDateFormat("dd/MM/yyyy").parse("29/03/1999"), Pais.Italia, ZonaBarco.Babor, 23));
			this.put("39856321J"+"-"+Pais.España.toString(), new Pasajero("39856321J", "Dakota Banderas", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/04/2000"), Pais.España, ZonaBarco.Babor, 25));
			this.put("32365485C"+"-"+Pais.ReinoUnido.toString(), new Pasajero("32365485C", "Melanie Griffith", false, new SimpleDateFormat("dd/MM/yyyy").parse("02/02/1970"), Pais.ReinoUnido, ZonaBarco.Babor, 25));
			this.put("25633287A"+"-"+Pais.ReinoUnido.toString(), new Pasajero("25633287A", "Summers Smith", false, new SimpleDateFormat("dd/MM/yyyy").parse("08/01/2015"), Pais.ReinoUnido, ZonaBarco.Babor, 20));
			this.put("65322398G"+"-"+Pais.ReinoUnido.toString(), new Pasajero("65322398G", "Gerard Smith", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/04/1980"), Pais.ReinoUnido, ZonaBarco.Babor, 20));
			this.put("75984126P"+"-"+Pais.ReinoUnido.toString(), new Pasajero("75984126P", "Beth Sanchez", false, new SimpleDateFormat("dd/MM/yyyy").parse("25/03/1984"), Pais.ReinoUnido, ZonaBarco.Babor, 20));
			this.put("76985236S"+"-"+Pais.ReinoUnido.toString(), new Pasajero("76985236S", "Rick Sanchez", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/05/1961"), Pais.ReinoUnido, ZonaBarco.Babor, 20));
			
			this.put("32558741L"+"-"+Pais.Italia.toString(), new Pasajero("32558741L", "Bambino Bambini", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/02/2018"), Pais.Italia, ZonaBarco.Estribor, 10));
			this.put("32256014K"+"-"+Pais.Italia.toString(), new Pasajero("32256014K", "Lucciana Berlini", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/01/1989"), Pais.Italia, ZonaBarco.Estribor, 10));
			this.put("74123950J"+"-"+Pais.Italia.toString(), new Pasajero("74123950J", "Luca Marussi", false, new SimpleDateFormat("dd/MM/yyyy").parse("15/01/1987"), Pais.Italia, ZonaBarco.Estribor, 10));
			this.put("31450239O"+"-"+Pais.Alemania.toString(), new Pasajero("31450239O", "Richard Schwarz", false, new SimpleDateFormat("dd/MM/yyyy").parse("19/03/1988"), Pais.Alemania, ZonaBarco.Estribor, 11));
			this.put("32569810Z"+"-"+Pais.Alemania.toString(), new Pasajero("32569810Z", "Alexandre Schulfzt", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1985"), Pais.Alemania, ZonaBarco.Estribor, 11));
			this.put("75896123S"+"-"+Pais.Francia.toString(), new Pasajero("75896123S", "Gerard Florit", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/2010"), Pais.Francia, ZonaBarco.Estribor, 12));
			this.put("32568412S"+"-"+Pais.Francia.toString(), new Pasajero("32568412S", "Rafael Florit", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/05/1989"), Pais.Francia, ZonaBarco.Estribor, 12));
			this.put("32569347A"+"-"+Pais.Francia.toString(), new Pasajero("32569347A", "Laurent Lachenal", false, new SimpleDateFormat("dd/MM/yyyy").parse("11/07/1985"), Pais.Francia, ZonaBarco.Estribor, 12));
			this.put("36520397C"+"-"+Pais.España.toString(), new Pasajero("36520397C", "Pedro Piqueras", false, new SimpleDateFormat("dd/MM/yyyy").parse("3/04/1965"), Pais.España, ZonaBarco.Estribor, 13));
			this.put("35628710W"+"-"+Pais.España.toString(), new Pasajero("35628710W", "Carlos Sopera", false, new SimpleDateFormat("dd/MM/yyyy").parse("1/01/1966"), Pais.España, ZonaBarco.Estribor, 13));
			this.put("32236574E"+"-"+Pais.ReinoUnido.toString(), new Pasajero("32236574E", "George Potter", false, new SimpleDateFormat("dd/MM/yyyy").parse("11/09/1991"), Pais.ReinoUnido, ZonaBarco.Estribor, 14));
			this.put("32569874T"+"-"+Pais.ReinoUnido.toString(), new Pasajero("32569874T", "Ronnald Weastley", false, new SimpleDateFormat("dd/MM/yyyy").parse("13/02/1994"), Pais.ReinoUnido, ZonaBarco.Estribor, 14));
			this.put("32569844Y"+"-"+Pais.ReinoUnido.toString(), new Pasajero("32569844Y", "Severus Snape", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/07/1979"), Pais.ReinoUnido, ZonaBarco.Estribor, 14));
			this.put("32568016I"+"-"+Pais.ReinoUnido.toString(), new Pasajero("32568016I", "Hermione Greanger", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/03/1985"), Pais.ReinoUnido, ZonaBarco.Estribor, 14));
			this.put("56987123D"+"-"+Pais.ReinoUnido.toString(), new Pasajero("56987123D", "Ginebra Weastley", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/2013"), Pais.ReinoUnido, ZonaBarco.Estribor, 14));
			this.put("55412378F"+"-"+Pais.Alemania.toString(), new Pasajero("55412378F", "Boris Becker", false, new SimpleDateFormat("dd/MM/yyyy").parse("12/05/1988"), Pais.Alemania, ZonaBarco.Estribor, 15));
			this.put("54239755Y"+"-"+Pais.Alemania.toString(), new Pasajero("54239755Y", "Almudenna Reinols", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/06/1992"), Pais.Alemania, ZonaBarco.Estribor, 15));
			this.put("32556703K"+"-"+Pais.Alemania.toString(), new Pasajero("32556703K", "Klauss Becker", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/2015"), Pais.Alemania, ZonaBarco.Estribor, 15));
			this.put("75984123V"+"-"+Pais.Italia.toString(), new Pasajero("75984123V", "Luccio Armani", false, new SimpleDateFormat("dd/MM/yyyy").parse("28/06/1985"), Pais.Italia, ZonaBarco.Estribor, 16));
			this.put("31256032T"+"-"+Pais.Italia.toString(), new Pasajero("31256032T", "Melissa Armani", false, new SimpleDateFormat("dd/MM/yyyy").parse("11/04/2014"), Pais.Italia, ZonaBarco.Estribor, 16));
			this.put("33659020P"+"-"+Pais.Francia.toString(), new Pasajero("33659020P", "Fiabre Almode", false, new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1995"), Pais.Francia, ZonaBarco.Estribor, 17));
			this.put("35487121K"+"-"+Pais.Francia.toString(), new Pasajero("35487121K", "Marinna Almode", false, new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1995"), Pais.Francia, ZonaBarco.Estribor, 17));
			this.put("78951020C"+"-"+Pais.Francia.toString(), new Pasajero("78951020C", "Pierre Lutte", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/07/1993"), Pais.Francia, ZonaBarco.Estribor, 17));
			this.put("56326698M"+"-"+Pais.Francia.toString(), new Pasajero("56326698M", "Marco Dimarck", false, new SimpleDateFormat("dd/MM/yyyy").parse("16/04/1991"), Pais.Francia, ZonaBarco.Estribor, 17));
			this.put("54126633N"+"-"+Pais.España.toString(), new Pasajero("54126633N", "Juan cuesta", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1975"), Pais.España, ZonaBarco.Estribor, 18));
			this.put("54552360B"+"-"+Pais.España.toString(), new Pasajero("54552360B", "Francisco Cuesta", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/2010"), Pais.España, ZonaBarco.Estribor, 18));
			this.put("02136984E"+"-"+Pais.España.toString(), new Pasajero("02136984E", "Paloma Palomina", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1977"), Pais.España, ZonaBarco.Estribor, 18));
			this.put("01239745I"+"-"+Pais.España.toString(), new Pasajero("01239745I", "Natalia Cuesta", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/03/2001"), Pais.España, ZonaBarco.Estribor, 18));
			this.put("01236330O"+"-"+Pais.Italia.toString(), new Pasajero("01236330O", "Valentino Malino", false, new SimpleDateFormat("dd/MM/yyyy").parse("15/01/1989"), Pais.Italia, ZonaBarco.Estribor, 19));
			this.put("01234410P"+"-"+Pais.Italia.toString(), new Pasajero("01234410P", "Mariana Malina", false, new SimpleDateFormat("dd/MM/yyyy").parse("23/03/1985"), Pais.Italia, ZonaBarco.Estribor, 19));
			this.put("02366980L"+"-"+Pais.Italia.toString(), new Pasajero("02366980L", "Constantino Capirino", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1986"), Pais.Italia, ZonaBarco.Estribor, 19));
			this.put("02325410M"+"-"+Pais.Italia.toString(), new Pasajero("02325410M", "Stephanie Merendi", false, new SimpleDateFormat("dd/MM/yyyy").parse("11/02/1982"), Pais.Italia, ZonaBarco.Estribor, 19));
			this.put("02113632G"+"-"+Pais.Italia.toString(), new Pasajero("02113632G", "Heidi Chapellini", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/04/1983"), Pais.Italia, ZonaBarco.Estribor, 19));
			this.put("03656632D"+"-"+Pais.Alemania.toString(), new Pasajero("03656632D", "Heidi Klumt", false, new SimpleDateFormat("dd/MM/yyyy").parse("16/06/1978"), Pais.Alemania, ZonaBarco.Estribor, 11));
			this.put("45623014S"+"-"+Pais.Alemania.toString(), new Pasajero("45623014S", "Patrick Schue", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/05/1975"), Pais.Alemania, ZonaBarco.Estribor, 11));
			
			this.put("32556932L"+"-"+Pais.Alemania.toString(), new Pasajero("32556932L", "Henry Ford", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/05/1973"), Pais.Alemania, ZonaBarco.Proa, 30));
			this.put("31112563J"+"-"+Pais.Alemania.toString(), new Pasajero("31112563J", "Terrance Ford", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1999"), Pais.Alemania, ZonaBarco.Proa, 30));
			this.put("32336598Y"+"-"+Pais.Alemania.toString(), new Pasajero("32336598Y", "Phiona Ford", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/2002"), Pais.Alemania, ZonaBarco.Proa, 30));
			this.put("37853146W"+"-"+Pais.Alemania.toString(), new Pasajero("37853146W", "Mathew Ford", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/2014"), Pais.Alemania, ZonaBarco.Proa, 30));
			this.put("33652339H"+"-"+Pais.Alemania.toString(), new Pasajero("33652339H", "David Ford", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/2016"), Pais.Alemania, ZonaBarco.Proa, 30));
			this.put("31298643K"+"-"+Pais.España.toString(), new Pasajero("31298643K", "Iker Jiménez", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/04/1990"), Pais.España, ZonaBarco.Proa, 31));
			this.put("33365988Q"+"-"+Pais.España.toString(), new Pasajero("33365988Q", "Carmen Porras", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/04/1994"), Pais.España, ZonaBarco.Proa, 31));
			this.put("32369855G"+"-"+Pais.España.toString(), new Pasajero("32369855G", "Miguel Jimenez", false, new SimpleDateFormat("dd/MM/yyyy").parse("11/02/1992"), Pais.España, ZonaBarco.Proa, 31));
			this.put("31236975G"+"-"+Pais.España.toString(), new Pasajero("31236975G", "Pedro Porras", false, new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2018"), Pais.España, ZonaBarco.Proa, 31));
			this.put("31250871F"+"-"+Pais.Francia.toString(), new Pasajero("31250871F", "Remmi Gallarde", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1997"), Pais.Francia, ZonaBarco.Proa, 32));
			this.put("49611479P"+"-"+Pais.Francia.toString(), new Pasajero("49611479P", "Letizia Sucherie", false, new SimpleDateFormat("dd/MM/yyyy").parse("12/04/1996"), Pais.Francia, ZonaBarco.Proa, 32));
			this.put("31250036V"+"-"+Pais.Francia.toString(), new Pasajero("31250036V", "Reclette Croquete", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1991"), Pais.Francia, ZonaBarco.Proa, 32));
			this.put("45896123N"+"-"+Pais.Francia.toString(), new Pasajero("45896123N", "Enmmanuel Croquette", false, new SimpleDateFormat("dd/MM/yyyy").parse("12/04/1990"), Pais.Francia, ZonaBarco.Proa, 32));
			this.put("41216785C"+"-"+Pais.Francia.toString(), new Pasajero("41216785C", "Pierre Croquete", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/02/2008"), Pais.Francia, ZonaBarco.Proa, 32));
			this.put("75841269X"+"-"+Pais.ReinoUnido.toString(), new Pasajero("75841269X", "Marine Smauth", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/05/1995"), Pais.ReinoUnido, ZonaBarco.Proa, 33));
			this.put("35986417Z"+"-"+Pais.ReinoUnido.toString(), new Pasajero("35986417Z", "Harry Smauth", false, new SimpleDateFormat("dd/MM/yyyy").parse("18/08/1993"), Pais.ReinoUnido, ZonaBarco.Proa, 33));
			this.put("31238462A"+"-"+Pais.ReinoUnido.toString(), new Pasajero("31238462A", "Sam Smauth", false, new SimpleDateFormat("dd/MM/yyyy").parse("18/06/2016"), Pais.ReinoUnido, ZonaBarco.Proa, 33));
			this.put("38956632Q"+"-"+Pais.España.toString(), new Pasajero("38956632Q", "Luis Rodriguez", false, new SimpleDateFormat("dd/MM/yyyy").parse("15/03/1989"), Pais.España, ZonaBarco.Proa, 34));
			this.put("31256974W"+"-"+Pais.España.toString(), new Pasajero("31256974W", "Rocio Ramos", false, new SimpleDateFormat("dd/MM/yyyy").parse("16/03/1991"), Pais.España, ZonaBarco.Proa, 34));
			this.put("33256974E"+"-"+Pais.Alemania.toString(), new Pasajero("33256974E", "Melanie Schlinder", false, new SimpleDateFormat("dd/MM/yyyy").parse("15/01/1989"), Pais.Alemania, ZonaBarco.Proa, 35));
			this.put("32146975R"+"-"+Pais.Alemania.toString(), new Pasajero("32146975R", "Thomas Schlinder", false, new SimpleDateFormat("dd/MM/yyyy").parse("12/06/1985"), Pais.Alemania, ZonaBarco.Proa, 35));
			this.put("31236794T"+"-"+Pais.Alemania.toString(), new Pasajero("31236794T", "Alexader Schlinder", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2011"), Pais.Alemania, ZonaBarco.Proa, 35));
			this.put("32456971F"+"-"+Pais.Italia.toString(), new Pasajero("32456971F", "Alessandra Barucci", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/08/1975"), Pais.Italia, ZonaBarco.Proa, 36));
			this.put("31256903O"+"-"+Pais.Italia.toString(), new Pasajero("31256903O", "Enriquetta Barucci", false, new SimpleDateFormat("dd/MM/yyyy").parse("24/02/1978"), Pais.Italia, ZonaBarco.Proa, 36));
			this.put("32450155K"+"-"+Pais.Alemania.toString(), new Pasajero("32450155K", "Thomas Shwagen", false, new SimpleDateFormat("dd/MM/yyyy").parse("09/06/1996"), Pais.Alemania, ZonaBarco.Proa, 37));
			this.put("21365047J"+"-"+Pais.Alemania.toString(), new Pasajero("21365047J", "Hellen Muller", false, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1997"), Pais.Alemania, ZonaBarco.Proa, 37));
			this.put("31259745H"+"-"+Pais.Alemania.toString(), new Pasajero("31259745H", "Moonie Gelbe", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/02/1997"), Pais.Alemania, ZonaBarco.Proa, 37));
			this.put("32145698G"+"-"+Pais.Alemania.toString(), new Pasajero("32145698G", "Monuca Grunner", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/05/1995"), Pais.Alemania, ZonaBarco.Proa, 37));
			this.put("32563014F"+"-"+Pais.Alemania.toString(), new Pasajero("32563014F", "David Rougern", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/03/1995"), Pais.Alemania, ZonaBarco.Proa, 37));
			this.put("31256987D"+"-"+Pais.ReinoUnido.toString(), new Pasajero("31256987D", "Betty Boop", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/03/1965"), Pais.ReinoUnido, ZonaBarco.Proa, 38));
			this.put("34456200S"+"-"+Pais.ReinoUnido.toString(), new Pasajero("34456200S", "Mickey Mouse", false, new SimpleDateFormat("dd/MM/yyyy").parse("11/01/1955"), Pais.ReinoUnido, ZonaBarco.Proa, 38));
			this.put("32015603A"+"-"+Pais.ReinoUnido.toString(), new Pasajero("32015603A", "Goofy Goofer", false, new SimpleDateFormat("dd/MM/yyyy").parse("16/05/1945"), Pais.ReinoUnido, ZonaBarco.Proa, 38));
			this.put("15648823D"+"-"+Pais.Italia.toString(), new Pasajero("15648823D", "Lorren Bernuilli", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/01/1990"), Pais.Italia, ZonaBarco.Proa, 39));
			this.put("79896541D"+"-"+Pais.Italia.toString(), new Pasajero("79896541D", "Roberta Bernuilli", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/07/2018"), Pais.Italia, ZonaBarco.Proa, 39));
			this.put("65897120V"+"-"+Pais.Italia.toString(), new Pasajero("65897120V", "Leonardo DaVinci", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/11/1988"), Pais.Italia, ZonaBarco.Proa, 39));
			this.put("71256483F"+"-"+Pais.Italia.toString(), new Pasajero("71256483F", "Donatello DiCaprio", false, new SimpleDateFormat("dd/MM/yyyy").parse("16/10/1987"), Pais.Italia, ZonaBarco.Proa, 39));
			
			this.put("05984236J"+"-"+Pais.Alemania.toString(), new Pasajero("05984236J", "Richard Dahau", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/10/1975"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.put("05411230U"+"-"+Pais.Alemania.toString(), new Pasajero("05411230U", "Evelyn Frau", false, new SimpleDateFormat("dd/MM/yyyy").parse("25/12/1978"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.put("05654123I"+"-"+Pais.Alemania.toString(), new Pasajero("05654123I", "Grettel Dahau", false, new SimpleDateFormat("dd/MM/yyyy").parse("24/12/1999"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.put("05654237X"+"-"+Pais.España.toString(), new Pasajero("05654237X", "Francisco Perez", false, new SimpleDateFormat("dd/MM/yyyy").parse("24/01/1988"), Pais.España, ZonaBarco.Popa, 41));
			this.put("06985632C"+"-"+Pais.España.toString(), new Pasajero("06985632C", "Juan Perez", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/01/2015"), Pais.España, ZonaBarco.Popa, 41));
			this.put("07456213B"+"-"+Pais.España.toString(), new Pasajero("07456213B", "Juanna Amber", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/06/1989"), Pais.España, ZonaBarco.Popa, 41));
			this.put("23569143Y"+"-"+Pais.España.toString(), new Pasajero("23569143Y", "Ricardo Perez", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/06/2017"), Pais.España, ZonaBarco.Popa, 41));
			this.put("25657891U"+"-"+Pais.ReinoUnido.toString(), new Pasajero("25657891U", "Amber Tower", false, new SimpleDateFormat("dd/MM/yyyy").parse("26/07/1992"), Pais.ReinoUnido, ZonaBarco.Popa, 42));
			this.put("26656398S"+"-"+Pais.ReinoUnido.toString(), new Pasajero("26656398S", "Nicolas Tolkien", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/04/1990"), Pais.ReinoUnido, ZonaBarco.Popa, 42));
			this.put("36951023R"+"-"+Pais.ReinoUnido.toString(), new Pasajero("36951023R", "Elias Tolkien", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/03/2017"), Pais.ReinoUnido, ZonaBarco.Popa, 42));
			this.put("35622301H"+"-"+Pais.Francia.toString(), new Pasajero("35622301H", "Amelie Dupain", false, new SimpleDateFormat("dd/MM/yyyy").parse("24/04/1998"), Pais.Francia, ZonaBarco.Popa, 43));
			this.put("25633014F"+"-"+Pais.Francia.toString(), new Pasajero("25633014F", "Isaac Eaulette", false, new SimpleDateFormat("dd/MM/yyyy").parse("19/06/1993"), Pais.Francia, ZonaBarco.Popa, 43));
			this.put("25657891T"+"-"+Pais.Italia.toString(), new Pasajero("25657891T", "Angellino Peregrinho", false, new SimpleDateFormat("dd/MM/yyyy").parse("05/11/1987"), Pais.Italia, ZonaBarco.Popa, 44));
			this.put("25630149R"+"-"+Pais.Italia.toString(), new Pasajero("25630149R", "Angellina Peregrinho", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/09/2009"), Pais.Italia, ZonaBarco.Popa, 44));
			this.put("22325019P"+"-"+Pais.Italia.toString(), new Pasajero("22325019P", "Luna Frenette", false, new SimpleDateFormat("dd/MM/yyyy").parse("15/08/1989"), Pais.Italia, ZonaBarco.Popa, 45));
			this.put("14563002E"+"-"+Pais.Italia.toString(), new Pasajero("14563002E", "Mariella Peregrinho", false, new SimpleDateFormat("dd/MM/yyyy").parse("06/01/2011"), Pais.Italia, ZonaBarco.Popa, 45));
			this.put("25563012U"+"-"+Pais.ReinoUnido.toString(), new Pasajero("25563012U", "Petunia Streep", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/09/1975"), Pais.ReinoUnido, ZonaBarco.Popa, 46));
			this.put("81459630G"+"-"+Pais.ReinoUnido.toString(), new Pasajero("81459630G", "Peter Pillgrim", false, new SimpleDateFormat("dd/MM/yyyy").parse("01/09/1973"), Pais.ReinoUnido, ZonaBarco.Popa, 46));
			this.put("81459230F"+"-"+Pais.ReinoUnido.toString(), new Pasajero("81459230F", "Bryan Pillgrim", false, new SimpleDateFormat("dd/MM/yyyy").parse("16/06/1999"), Pais.ReinoUnido, ZonaBarco.Popa, 46));
			this.put("88456012D"+"-"+Pais.Alemania.toString(), new Pasajero("88456012D", "Johanna Grunnette", false, new SimpleDateFormat("dd/MM/yyyy").parse("05/11/1989"), Pais.Alemania, ZonaBarco.Popa, 47));
			this.put("89652017S"+"-"+Pais.Alemania.toString(), new Pasajero("89652017S", "Oscii Skizzen", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/10/1985"), Pais.Alemania, ZonaBarco.Popa, 47));
			this.put("05694361A"+"-"+Pais.Alemania.toString(), new Pasajero("05694361A", "Daniel Skizzen", false, new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2010"), Pais.Alemania, ZonaBarco.Popa, 47));
			this.put("06541280Q"+"-"+Pais.Alemania.toString(), new Pasajero("06541280Q", "Florian Skizzen", false, new SimpleDateFormat("dd/MM/yyyy").parse("28/01/2015"), Pais.Alemania, ZonaBarco.Popa, 47));
			this.put("38569122Z"+"-"+Pais.Italia.toString(), new Pasajero("38569122Z", "Dudley Darsley", false, new SimpleDateFormat("dd/MM/yyyy").parse("19/03/1999"), Pais.ReinoUnido, ZonaBarco.Popa, 48));
			this.put("33201468X"+"-"+Pais.Italia.toString(), new Pasajero("33201468X", "Petunia Darsley", false, new SimpleDateFormat("dd/MM/yyyy").parse("04/11/1975"), Pais.ReinoUnido, ZonaBarco.Popa, 48));
			this.put("25993011I"+"-"+Pais.Alemania.toString(), new Pasajero("25993011I", "Zacarias Spotter", false, new SimpleDateFormat("dd/MM/yyyy").parse("07/02/2010"), Pais.Alemania, ZonaBarco.Popa, 49));
			this.put("25697115Y"+"-"+Pais.Alemania.toString(), new Pasajero("25697115Y", "SpocK Spotter", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/09/2004"), Pais.Alemania, ZonaBarco.Popa, 49));
			this.put("25993011I"+"-"+Pais.Alemania.toString(), new Pasajero("25993011I", "Guilietta Fritz", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/08/1985"), Pais.Alemania, ZonaBarco.Popa, 49));
			this.put("25697145I"+"-"+Pais.Alemania.toString(), new Pasajero("25697145I", "Abraham Spotter", false, new SimpleDateFormat("dd/MM/yyyy").parse("27/03/1980"), Pais.Alemania, ZonaBarco.Popa, 49));
			this.put("25753011R"+"-"+Pais.Alemania.toString(), new Pasajero("25753011R", "Guiulia Bellumie", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/08/1975"), Pais.Alemania, ZonaBarco.Popa, 49));
			this.put("25697411C"+"-"+Pais.Alemania.toString(), new Pasajero("25697411C", "Aaron Schmith", false, new SimpleDateFormat("dd/MM/yyyy").parse("27/03/1978"), Pais.Alemania, ZonaBarco.Popa, 49));
			
			//Tripulacion
			this.put("32543245D"+"-"+Pais.ReinoUnido.toString(), new Tripulante("32543245D", "Friederich Fritz", false, new SimpleDateFormat("dd/MM/yyyy").parse("19/08/1976"), Pais.ReinoUnido, ZonaBarco.Popa,  NivelResponsabilidad.muy_baja));
			this.put("12578503C"+"-"+Pais.Alemania.toString(), new Tripulante("12578503C", "Armin Merender", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/05/1971"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.muy_baja));
			this.put("21698987F"+"-"+Pais.ReinoUnido.toString(), new Tripulante("21698987F", "Miren Schultz", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/01/1977"), Pais.ReinoUnido, ZonaBarco.Estribor,  NivelResponsabilidad.muy_baja));
			this.put("20298327G"+"-"+Pais.Alemania.toString(), new Tripulante("20298327G", "Verenna Vielle", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/06/1969"), Pais.Alemania, ZonaBarco.Estribor,  NivelResponsabilidad.muy_baja));
			this.put("06873221H"+"-"+Pais.ReinoUnido.toString(), new Tripulante("06873221H", "Regis Vogel", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/09/1965"), Pais.ReinoUnido, ZonaBarco.Popa,  NivelResponsabilidad.muy_baja));
			this.put("05732977N"+"-"+Pais.ReinoUnido.toString(), new Tripulante("05732977N", "Anette Schwarz", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/04/1989"), Pais.ReinoUnido, ZonaBarco.Popa,  NivelResponsabilidad.muy_baja));
			this.put("37987974M"+"-"+Pais.Alemania.toString(), new Tripulante("37987974M", "Michael Myers", false, new SimpleDateFormat("dd/MM/yyyy").parse("23/10/1996"), Pais.Alemania, ZonaBarco.Estribor,  NivelResponsabilidad.muy_baja));
			this.put("02794146L"+"-"+Pais.Alemania.toString(), new Tripulante("02794146L", "Schatz Chadders", false, new SimpleDateFormat("dd/MM/yyyy").parse("18/09/1996"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.muy_baja));
			this.put("54873101S"+"-"+Pais.Alemania.toString(), new Tripulante("54873101S", "Miriam Verdetti", false, new SimpleDateFormat("dd/MM/yyyy").parse("05/06/1979"), Pais.Alemania, ZonaBarco.Babor,  NivelResponsabilidad.baja));
			this.put("21456344R"+"-"+Pais.Alemania.toString(), new Tripulante("21456344R", "Victor Klumt", false, new SimpleDateFormat("dd/MM/yyyy").parse("04/06/1984"), Pais.Alemania, ZonaBarco.Proa,  NivelResponsabilidad.baja));
			this.put("34578922E"+"-"+Pais.Alemania.toString(), new Tripulante("34578922E", "Daniell Suroit", false, new SimpleDateFormat("dd/MM/yyyy").parse("18/11/1965"), Pais.Alemania, ZonaBarco.Babor,  NivelResponsabilidad.baja));
			this.put("21451633W"+"-"+Pais.Italia.toString(), new Tripulante("21451633W", "Kevin Cossmos", false, new SimpleDateFormat("dd/MM/yyyy").parse("18/01/1981"), Pais.Italia, ZonaBarco.Estribor,  NivelResponsabilidad.baja));
			this.put("21416947T"+"-"+Pais.Alemania.toString(), new Tripulante("21416947T", "Miley Hemsworth", true, new SimpleDateFormat("dd/MM/yyyy").parse("21/01/1974"), Pais.Alemania, ZonaBarco.Proa,  NivelResponsabilidad.baja));
			this.put("216123h7O"+"-"+Pais.Italia.toString(), new Tripulante("216123h7O", "Helena Reginetti", false, new SimpleDateFormat("dd/MM/yyyy").parse("27/03/1969"), Pais.Italia, ZonaBarco.Popa,  NivelResponsabilidad.baja));
			this.put("31253301F"+"-"+Pais.Alemania.toString(), new Tripulante("31253301F", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("05/06/1979"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.put("18961344T"+"-"+Pais.Alemania.toString(), new Tripulante("18961344T", "Vladimir Putin", false, new SimpleDateFormat("dd/MM/yyyy").parse("04/06/1984"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.put("15456322U"+"-"+Pais.Alemania.toString(), new Tripulante("15456322U", "Barack Obama", false, new SimpleDateFormat("dd/MM/yyyy").parse("18/11/1965"), Pais.Alemania, ZonaBarco.Proa,  NivelResponsabilidad.media));
			this.put("16982033P"+"-"+Pais.Italia.toString(), new Tripulante("16982033P", "Aung San Suu Kyi", false, new SimpleDateFormat("dd/MM/yyyy").parse("18/01/1981"), Pais.Italia, ZonaBarco.Estribor,  NivelResponsabilidad.media));
			this.put("18964177L"+"-"+Pais.Alemania.toString(), new Tripulante("18964177L", "Donald Trump", true, new SimpleDateFormat("dd/MM/yyyy").parse("21/01/1974"), Pais.Alemania, ZonaBarco.Proa,  NivelResponsabilidad.media));
			this.put("123h6577Y"+"-"+Pais.Italia.toString(), new Tripulante("123h6577Y", "Emmanuel Macron", false, new SimpleDateFormat("dd/MM/yyyy").parse("27/03/1969"), Pais.Italia, ZonaBarco.Estribor,  NivelResponsabilidad.media));
			this.put("18965130R"+"-"+Pais.Alemania.toString(), new Tripulante("18965130R", "Xi Jinping", false, new SimpleDateFormat("dd/MM/yyyy").parse("27/02/1990"), Pais.Alemania, ZonaBarco.Babor,  NivelResponsabilidad.media));
			this.put("31226749H"+"-"+Pais.Alemania.toString(), new Tripulante("31226749H", "Justin Trudeau", false, new SimpleDateFormat("dd/MM/yyyy").parse("26/04/1984"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.put("33287461X"+"-"+Pais.Alemania.toString(), new Tripulante("33287461X", "Kim Jong Un", false, new SimpleDateFormat("dd/MM/yyyy").parse("15/07/1980"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.put("14697750B"+"-"+Pais.Alemania.toString(), new Tripulante("14697750B", "Briggitte Reimhardt", false, new SimpleDateFormat("dd/MM/yyyy").parse("01/09/1974"), Pais.Alemania, ZonaBarco.Estribor,  NivelResponsabilidad.media));
			this.put("32459877V"+"-"+Pais.ReinoUnido.toString(), new Tripulante("32459877V", "Komradt Reimhardt", false, new SimpleDateFormat("dd/MM/yyyy").parse("19/08/1976"), Pais.ReinoUnido, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.put("56981103T"+"-"+Pais.Alemania.toString(), new Tripulante("56981103T", "Silvio Berlusconni", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/05/1971"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.muy_baja));
			this.put("98561147E"+"-"+Pais.ReinoUnido.toString(), new Tripulante("98561147E", "Alber Rivera", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/01/1977"), Pais.ReinoUnido, ZonaBarco.Estribor,  NivelResponsabilidad.media));
			this.put("04563327R"+"-"+Pais.Alemania.toString(), new Tripulante("04563327R", "Christine Lagarde", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/06/1969"), Pais.Alemania, ZonaBarco.Estribor,  NivelResponsabilidad.media));
			this.put("32259871Y"+"-"+Pais.ReinoUnido.toString(), new Tripulante("32259871Y", "Ronald Reagan", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/09/1965"), Pais.ReinoUnido, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.put("32059874O"+"-"+Pais.ReinoUnido.toString(), new Tripulante("32059874O", "Arnold Schwarzenegger", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/04/1989"), Pais.ReinoUnido, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.put("56987123U"+"-"+Pais.Alemania.toString(), new Tripulante("56987123U", "Clint Eastwood", false, new SimpleDateFormat("dd/MM/yyyy").parse("23/10/1996"), Pais.Alemania, ZonaBarco.Estribor,  NivelResponsabilidad.media));
			this.put("45630021R"+"-"+Pais.Alemania.toString(), new Tripulante("45630021R", "Carmen Lomana", false, new SimpleDateFormat("dd/MM/yyyy").parse("18/09/1996"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.put("33652178A"+"-"+Pais.ReinoUnido.toString(), new Tripulante("33652178A", "Rafael Alberti", false, new SimpleDateFormat("dd/MM/yyyy").parse("18/07/1981"), Pais.ReinoUnido, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.put("32669015P"+"-"+Pais.ReinoUnido.toString(), new Tripulante("32669015P", "Eva Perón", false, new SimpleDateFormat("dd/MM/yyyy").parse("07/12/1993"), Pais.ReinoUnido, ZonaBarco.Babor,  NivelResponsabilidad.media));
			this.put("44123698U"+"-"+Pais.Alemania.toString(), new Tripulante("44123698U", "George Washington", false, new SimpleDateFormat("dd/MM/yyyy").parse("04/01/1992"), Pais.Alemania, ZonaBarco.Babor,  NivelResponsabilidad.media));
			this.put("46322587T"+"-"+Pais.España.toString(), new Tripulante("46322587T", "Mao Zedong", false, new SimpleDateFormat("dd/MM/yyyy").parse("09/05/1990"), Pais.España, ZonaBarco.Estribor,  NivelResponsabilidad.media));
			this.put("46995032T"+"-"+Pais.España.toString(), new Tripulante("46995032T", "Vladimir Lenin", false, new SimpleDateFormat("dd/MM/yyyy").parse("18/04/1975"), Pais.España, ZonaBarco.Babor,  NivelResponsabilidad.media));
			this.put("45623300G"+"-"+Pais.Alemania.toString(), new Tripulante("45623300G", "Nelson Mandela", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/04/1988"), Pais.Alemania, ZonaBarco.Babor,  NivelResponsabilidad.media));
			this.put("96321485A"+"-"+Pais.Alemania.toString(), new Tripulante("96321485A", "Mahatma Gandhi", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/06/1979"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.put("99563214W"+"-"+Pais.ReinoUnido.toString(), new Tripulante("99563214W", "Simón Bolívar", false, new SimpleDateFormat("dd/MM/yyyy").parse("09/11/1979"), Pais.ReinoUnido, ZonaBarco.Estribor,  NivelResponsabilidad.media));
			this.put("98563320K"+"-"+Pais.Alemania.toString(), new Tripulante("98563320K", "Ben Afflect", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/08/1969"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.muy_alta));
			
		} catch (ParseException e) {
			System.out.println("ERROR EN LOS DATOS\n");
		}
	}

}
