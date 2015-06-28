package game.model;

import java.util.LinkedList;

public class Player {
	
	private Mission mission;
	private Card[] cards;
	private LinkedList<Country> countries;
	private String name;
	
	
	public Player(String name, LinkedList<Country> countries){
		this.name = name;
		this.countries = countries;
	}
}
