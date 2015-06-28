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

	private Country(CountryBuilder builder) {
		tropes = builder.tropes;
		owner = builder.owner;
		continent = builder.continent;
		countryName = builder.countryName;
		neighbours = builder.neighbours;
	}

	public static class CountryBuilder {
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

		public CountryBuilder(CountryName countryName, Continent continent) {

			neighbours = new LinkedList<Country>();
			tropes = 0;
			this.countryName = countryName;
			this.continent = continent;
		}

		public CountryBuilder setNeighbours(LinkedList<Country> neighbours) {
			this.neighbours = neighbours;
			return this;
		}

		public CountryBuilder setTropes(int tropes) {
			this.tropes = tropes;
			return this;
		}

		public CountryBuilder setOwner(Player owner) {
			this.owner = owner;
			return this;
		}

		public Country build() {
			return new Country(this);
		}
	}
}
