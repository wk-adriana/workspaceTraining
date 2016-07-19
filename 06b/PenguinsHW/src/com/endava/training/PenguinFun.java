package com.endava.training;

import java.util.*;

public class PenguinFun {

	public static void main(String [] args) {
		PenguinHatchery penguinHatchery = new PenguinHatchery();
		List<Penguin> penguinList = new ArrayList<>();
		Set<Penguin> penguinSet = new HashSet<>();
		Penguin penguin;

		for (int i = 0; i < 20; i++) {
			penguin = penguinHatchery.hatchPenguin();
			penguinList.add(penguin);
			penguinSet.add(penguin);
		}

		System.out.println("LIST:");
		Iterator<Penguin> iteratorPenguinList = penguinList.iterator();
		while (iteratorPenguinList.hasNext()) {
			System.out.println(iteratorPenguinList.next());
		}

		System.out.println("SET:");
		Iterator<Penguin> iteratorPenguinSet = penguinSet.iterator();
		while (iteratorPenguinSet.hasNext()) {
			System.out.println(iteratorPenguinSet.next());
		}

		PenguinSimpleComparator penguinSimpleComparator = new PenguinSimpleComparator();
		Collections.sort(penguinList, penguinSimpleComparator);

		System.out.println("LIST ORDERED:");
		Iterator<Penguin> iteratorPenguinList2 = penguinList.iterator();
		while (iteratorPenguinList2.hasNext()) {
			System.out.println(iteratorPenguinList2.next());
		}

		Iterator<Penguin> iteratorPenguinList3 = penguinList.iterator();
		while (iteratorPenguinList3.hasNext()) {
			iteratorPenguinList3.next().setMatingPartners(penguinHatchery.generateMatingPartners());
		}

		System.out.println("PENGUINS WITH MATING PARTNERS :");
		iteratorPenguinList3 = penguinList.iterator();
		while (iteratorPenguinList3.hasNext()) {
			System.out.println(iteratorPenguinList3.next());
		}

		PenguinsWithMatesComparator penguinsWithMatesComparator = new PenguinsWithMatesComparator();
		Collections.sort(penguinList, penguinsWithMatesComparator);


		System.out.println("PENGUINS WITH MATING PARTNERS ORDERED :");
		iteratorPenguinList3 = penguinList.iterator();
		while (iteratorPenguinList3.hasNext()) {
			System.out.println(iteratorPenguinList3.next());
		}

		Map<PenguinRace, ArrayList<Penguin>> penguinMap = new HashMap<>();
		for (PenguinRace pr: PenguinRace.values()) {
			penguinMap.put(pr, new ArrayList<>());
		}

		iteratorPenguinList3 = penguinList.iterator();
		while (iteratorPenguinList3.hasNext()) {
			Penguin penguinObj = iteratorPenguinList3.next();
			penguinMap.get(penguinObj.getRace()).add(penguinObj);
		}

		System.out.println("MAP: ");
		for (Map.Entry<PenguinRace, ArrayList<Penguin>> entry : penguinMap.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

	}
}	
