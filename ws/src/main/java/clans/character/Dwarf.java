package clans.character;

import clans.Company;
import clans.character.nature.Nature;

public class Dwarf {

	private String name;
	private final Company company;

	private Nature nature;

	public Dwarf(String name, Company company) {
		this.name = name;
		this.company = company;
		nature = new Nature();
	}

	public void thinkMoreLike(final Nature otherNature) {
		nature.moveThinkingTo(otherNature);
	}

	public double getMorale() {
		return company.getMorales() / company.getDwarfs().size();
	}

	@Override
	public String toString() {
		String card = name + " [Morale:" + getMorale() + ", " + nature.toString() + "]";
		return card;
	}
}
