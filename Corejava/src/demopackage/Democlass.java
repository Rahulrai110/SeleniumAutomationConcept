package demopackage;

import corejavaconcept.ArrayMinMaxValue; // to access class of other package we need to import that package i.e. "import package.classname"
import corejavaconcept.accessModifier;

public class Democlass extends accessModifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayMinMaxValue ab=new ArrayMinMaxValue();
		ab.abc();
		
		Democlass d=new Democlass();// we can access method define as protected in other package class to this package class by importing the class package/ 
		d.abcdef();
	}

}
