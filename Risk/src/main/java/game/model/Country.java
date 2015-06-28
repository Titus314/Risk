package game.model;

import java.util.LinkedList;


public class Country {
		
		// How many tropes are positioned in a country
		private int tropes;
		
		// Who is the owner of the country
		private Player owner;
		
		// The continent, where the country is located
		private Continent continent;
		
		// Name of the country
		private CountryName countryName;
		
		// List of the neighbours 
		private LinkedList<Country> neighbours;
		
		public Country (int tropes,Player owner, Continent continent, CountryName countryName){
			this.tropes = tropes;
			this.owner = owner;
			this.countryName = countryName;
			this.continent = continent;
		}
}
