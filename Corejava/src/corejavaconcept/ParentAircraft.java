package corejavaconcept;

public abstract class ParentAircraft {

		
		public void Engine()
		{
			System.out.println("Follow Engine Guidelines");	
		}
		//private is not allow in abstract class as it will not allow to inherit the property to other class ,only public and protected is allow
		//extends is used for Inheritance to abstract the method from abstract class and Implements is used for Interface
		public void Saftyguideline()
		{
			System.out.println("Follow Safety Guidelines");
		}
		public abstract void bodyColor();
		
		
	}

