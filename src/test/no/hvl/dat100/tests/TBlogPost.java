package no.hvl.dat100.tests;

import no.hvl.dat100.jplab11.oppgave1.BlogPost;

public class TBlogPost extends BlogPost {
	
	public TBlogPost(int id, String bruker, String dato) {
		super(id, bruker,dato);
	}

	public TBlogPost(int id, String bruker, String dato, int likes) {
		super(id, bruker,dato,likes);
	}

}
