package clans.character;

import clans.character.nature.Nature;

public class Dwarf {

	private int dwarfMorales;
	private Nature nature;
	
	public Dwarf() {
		nature = new Nature();
	}

	public void thinkMoreLike(final Nature otherNature) {
		nature.moveThinkingTo(otherNature);
	}
}
