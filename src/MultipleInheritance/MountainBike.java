package MultipleInheritance;

public class MountainBike extends TwoWheeler implements Bicycle , Vehicle{
	
	private int seatHeight;
	private int gear;
	private int speed;
	
	public MountainBike(int startHeight , int startSpeed , int startGear) 
	{
		gear = startGear;
		speed=startSpeed;
		seatHeight= startHeight;
	}
	
	@Override
	public void applyBrake(int decrement)
	{
		speed-=decrement;
		
	}
	
	@Override
	public void speedUp(int incement)
	{
		speed+=incement;
	}
	
	@Override
	public void canDrive()
	{
		System.out.println("the vehicle can drive");
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
