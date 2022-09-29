package no.hvl.dat100.jplab11.oppgave6;

import no.hvl.annotations.Exercise;
import no.hvl.annotations.TransformOption;
import no.hvl.dat100.jplab11.oppgave1.BlogPost;
import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class HtmlBlogg extends Blogg {

	public HtmlBlogg() {
		super();
	}
	
	private static String HTMLPREFIX = 
			"<html>\n\t<head>\n\t\t<title>DAT100 Blogg</title>\n\t</head>\n\t<body>\n";
	
	private static String HTMLPOSTFIX = 
			"\t</body>\n</html>";

	@Exercise(id = {6,4}, transformOption = TransformOption.REPLACE_BODY)
	@Override
	public String toString() {
		
		BlogPost[] blogg = super.getSamling();
		
		String htmlbody = "";
		int antall = super.getAntall();
		
		for (int i = 0; i<antall;i++) {
			htmlbody = htmlbody + blogg[i].toHTML();
		}
		
		return HTMLPREFIX + htmlbody + HTMLPOSTFIX;
	}
}
