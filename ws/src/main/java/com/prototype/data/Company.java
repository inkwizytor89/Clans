package com.prototype.data;

import com.prototype.data.Dwarf;

import java.util.ArrayList;

public class Company {

	private String name;
	private ArrayList<Dwarf> dwarfs = new ArrayList();
	private int companyMorales = 300;

	public Company(String name) {
		this.name = name;
	}
	
	public void add(Dwarf dwarf) {
		dwarfs.add(dwarf);
	}

	public ArrayList<Dwarf> getDwarfs() {
		return dwarfs;
	}

	public double getMorales() {
		return companyMorales;
	}

	@Override
	public String toString() {
		String toString = "Company " + name + " with " + dwarfs.size() + " dwarfs:\n\n";
		for (Dwarf dwarf : dwarfs) {
			toString += dwarf.toString() + "\n";
		}
		return toString;
	}
}
