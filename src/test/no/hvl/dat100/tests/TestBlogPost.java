package no.hvl.dat100.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBlogPost {

	@Test
	public void testConstructor1() {
		TBlogPost innlegg = new TBlogPost(1,"Ole Olsen","23-10");
		
		assertEquals("Ole Olsen",innlegg.getBruker());
		assertEquals(1,innlegg.getId());
		assertEquals(0,innlegg.getLikes());	
		assertEquals("23-10",innlegg.getDato()); 
	}

	@Test
	public void testConstructor2() {
		TBlogPost innlegg = new TBlogPost(1,"Ole Olsen","23-10",7);
		
		assertEquals("Ole Olsen",innlegg.getBruker());
		assertEquals(1,innlegg.getId());
		assertEquals(7,innlegg.getLikes());	
		assertEquals("23-10",innlegg.getDato()); 
	}
	
	@Test
	public void testSet() {
		
		TBlogPost innlegg = new TBlogPost(1,"Ole Olsen","23-10",7);

		innlegg.setBruker("Oline Olsen");
		innlegg.setDato("24-10");
		
		assertEquals("Oline Olsen",innlegg.getBruker());
		assertEquals("24-10",innlegg.getDato());
	}
	
	@Test
	public void testdoLike() {
		
		TBlogPost innlegg = new TBlogPost(1,"Ole Olsen","23-10");

		assertEquals(0,innlegg.getLikes());	

		innlegg.doLike();

		assertEquals(1,innlegg.getLikes());	

	}
	
	
	@Test
	public void testLik() {
	
		TBlogPost innlegg1 = new TBlogPost(1,"Ole Olsen","23-10");
		TBlogPost innlegg2 = new TBlogPost(2,"Oline Olsen","24-10");
	
		assertFalse(innlegg1.erLik(innlegg2));
		assertTrue(innlegg1.erLik(innlegg1));
	}
	
	@Test
	public void testtoString () {
		
		TBlogPost innlegg = new TBlogPost(1,"Ole Olsen","23-10");

		assertEquals("1\nOle Olsen\n23-10\n0\n",innlegg.toString());

	}
}
