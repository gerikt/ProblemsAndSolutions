package AnonymousInnerClass;

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {

		MountainBike m1 = new MountainBike();
		m1.applyBrake();
		m1.speedUp();
		
		
		Bicycle b1 = new Bicycle() {
			
			@Override
			public void speedUp() {

				System.out.println("Bicycle can speed up");
			}
			
			@Override
			public void applyBrake() {

				System.out.println("Bicycle can apply brake");
			}
		};
	
		b1.applyBrake();
	
	}

}
