package bcu.s17102876.adventure.test;

import bcu.s17102876.adventure.model.Location;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collections;

public class LocationTest {
	private final Location house = new Location("house", "You are in a small village house.");
	
	public void testGetName() {
		assertEquals("house", house.getName());
	}
	
	@Test
	public void testGetDescription() {
		assertEquals("You are in a small village house.", house.getDescription());
	}
	
	@Test
	public void noItems() {
		assertEquals(Collections.emptyList(), house.getItems());
	}
	
	@Test
	public void testgetNeighbour() {
	
	}
}
