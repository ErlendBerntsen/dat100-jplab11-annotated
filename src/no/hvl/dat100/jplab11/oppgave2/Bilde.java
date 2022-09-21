package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.annotations.Exercise;
import no.hvl.annotations.TransformOption;

public class Bilde extends Tekst {

	@Exercise(id={2}, transformOption = TransformOption.REMOVE_EVERYTHING)
	private String url;

	@Exercise(id={2}, transformOption = TransformOption.REPLACE_BODY)
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.url = url;
	}

	@Exercise(id={2}, transformOption = TransformOption.REPLACE_BODY)
	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes,tekst);
		this.url = url;
	}

	@Exercise(id={2}, transformOption = TransformOption.REPLACE_BODY)
	public String getUrl() {
		return url;
	}

	@Exercise(id={2}, transformOption = TransformOption.REPLACE_BODY)
	public void setUrl(String url) {
		this.url = url;
	}

	@Exercise(id={2}, transformOption = TransformOption.REPLACE_BODY)
	@Override
	public String toString() {
		return 
				"BILDE" + "\n" + 
				super.getId() + "\n" + 
				super.getBruker() + "\n" + 
				super.getDato() + "\n" + 
				super.getLikes() + "\n" +
				super.getTekst() + "\n" + 
				url + "\n";

	}

	@Exercise(id={6}, transformOption = TransformOption.REPLACE_BODY)
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		return 
				"\t\t<h2>" + super.getBruker() + "@" + super.getDato() + " " + "[" + super.getLikes()+ "]<h2>\n" +
				"\t\t<p>" + super.getTekst() + "<p>\n" + 
				"\t\t<iframe src=\"" + 
				url + 
				"\" height=600 width=800></iframe><hr>\n";
				
	}
}
