package interfaceDemo;

public interface Bicycle {

	void applyBrake(int decrement);

	void speedUp(int increment);

}

class MountainBike implements Bicycle {
	private int seatHeight;
	private int gear;
	private int speed;

	public MountainBike(int startHeight, int startGear, int startSpeed) {
		seatHeight = startHeight;
		gear = startGear;
		speed = startSpeed;
	}

	@Override
	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
	}
}