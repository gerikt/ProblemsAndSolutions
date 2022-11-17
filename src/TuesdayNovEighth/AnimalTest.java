package TuesdayNovEighth;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a1= new Animal();
		a1.eat();
		a1.sleep();
		
		Tiger t1 = new Tiger();
		t1.eat();
		t1.sleep();
		t1.run();

		//casting
		int i = 3 ; 
		double d = i;
		
		//non primitive casting --> this is upcasting or wwidening
		//this is a two part sentence
		//create a tiger object
		//assign it to Animal Object
		
		Animal obj1 = new Tiger();
		//this eat is going to run the tiger method 
		obj1.eat();
		obj1.sleep();
		//i cant do run
		//because the method run is not defined in animal class
		//which methods are available are defined by the first part of the sentence
		//in this scenario it offers all the methods that are available to the animal but if there is a differebt implementation for tiger it will use that
	    
		
		//it doesnt let me invert 
		//tiger obj4 = new Animal();
		
		//downcasting is done like this 
		Tiger obj2 = (Tiger) obj1;
		obj2.run();
		
		//we can also downcast like this but it is not safe
		
		//Tiger obj5 = (Tiger) new Animal();
		
	}

}
