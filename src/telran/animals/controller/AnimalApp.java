package telran.animals.controller;

import telran.animals.data.Animal;
import telran.animals.data.ArrayTools;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Sharik", "Dog", "DyadyaFiodor", 1977, false);
		Animal a2 = new Animal("Bobik", "pig", 1999, true);
		Animal a3 = new Animal("horse", 2005, false);
		
		Animal arr[] = {a1, a2, a3};
		
		ArrayTools.printArray(arr);
		

	}

}
