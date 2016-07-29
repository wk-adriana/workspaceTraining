package com.endava.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Penguin {
	
	private String name;
	private PenguinRace race;
	private double age;
	private List<Penguin> matingPartners;
	
	public Penguin(String name, PenguinRace race, double age) {
		this.name = name;
		this.race = race;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public PenguinRace getRace() {
		return race;
	}

	public double getAge() {
		return age;
	}

	public List<Penguin> getMatingPartners() {
		return matingPartners;
	}

	public void setMatingPartners(List<Penguin> matingPartners) {
		this.matingPartners = matingPartners;
	}

	public double getMatingPartnersAverageAge() {
		if (this.matingPartners.size() != 0) {
			double sum = 0;
			Iterator<Penguin> iteratorPenguinList = this.matingPartners.iterator();
			while (iteratorPenguinList.hasNext()) {
				sum += iteratorPenguinList.next().getAge();
			}
			return sum/this.matingPartners.size();
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Penguin{" +
				"name='" + name + '\'' +
				", race=" + race +
				", age=" + age +
				", matingPartners=" + matingPartners +
				'}';
	}

//	@Override
//	public int hashCode() {
//		return 0;
//	}
}
