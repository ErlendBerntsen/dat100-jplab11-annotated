package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.annotations.Exercise;
import no.hvl.annotations.Remove;
import no.hvl.annotations.TransformOption;

public abstract class BlogPost {
	


	@Exercise(id = {1,1}, transformOption = TransformOption.REMOVE_EVERYTHING)
	private String bruker;
	@Exercise(id = {1,1}, transformOption = TransformOption.REMOVE_EVERYTHING)
	private String dato;
	@Exercise(id = {1,1}, transformOption = TransformOption.REMOVE_EVERYTHING)
	private int likes;
	@Exercise(id = {1,1}, transformOption = TransformOption.REMOVE_EVERYTHING)
	private int id;

	@Exercise(id={1,2}, transformOption = TransformOption.REPLACE_BODY, replacementId = "1")
	public BlogPost(int id, String bruker, String dato) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
	}

	@Exercise(id={1,2}, transformOption = TransformOption.REPLACE_BODY)
	public BlogPost(int id, String bruker, String dato, int likes) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}

	@Exercise(id={1,3}, transformOption = TransformOption.REPLACE_BODY)
	public String getBruker() {
		return bruker;
	}

	@Exercise(id={1,3}, transformOption = TransformOption.REPLACE_BODY)
	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	@Exercise(id={1,3}, transformOption = TransformOption.REPLACE_BODY)
	public String getDato() {
		return dato;
	}

	@Exercise(id={1,3}, transformOption = TransformOption.REPLACE_BODY)
	public void setDato(String dato) {
		this.dato = dato;
	}

	@Exercise(id={1,3}, transformOption = TransformOption.REPLACE_BODY)
	public int getId() {
		return id;
	}

	@Exercise(id={1,4}, transformOption = TransformOption.REPLACE_BODY)
	public int getLikes() {
		return likes;
	}

	@Exercise(id={1,4}, transformOption = TransformOption.REPLACE_BODY)
	public void doLike () {
		likes++;
	}

	@Exercise(id={1,6}, transformOption = TransformOption.REPLACE_BODY)
	public boolean erLik(BlogPost blogPost) {
		return (blogPost.getId() == this.id);
	}

	@Exercise(id={1,5}, transformOption = TransformOption.REPLACE_BODY)
	@Override
	public String toString() {
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
	}

	@Exercise(id={6,1}, transformOption = TransformOption.REPLACE_BODY)
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		return "\t\t<h2>" + bruker + "@" + dato + " " + "[" + likes + "]<h2>\n";
				
	}
}
