package week1.day1;

public class Bike {
	public void applyBreak() {
	System.out.println("break is applied");
	
	}
	public void soundHorn() {
		System.out.println("loud");
	}

	public static void main(String[] args) {
		Car Audi = new Car();
		Audi.applyBreak();
		Audi.soundHorn();
		Bike AVS = new Bike();
		AVS.applyBreak();
		AVS.soundHorn();

	}

}
