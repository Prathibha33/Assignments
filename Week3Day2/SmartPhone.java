package Week3Day2;

public class SmartPhone extends AndroidPhone {
	
	public void takeVideo() {
		super.takeVideo();
		System.out.println("taking video");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone vivo=new SmartPhone();
				vivo.takeVideo();
		
		
		

	}

}
