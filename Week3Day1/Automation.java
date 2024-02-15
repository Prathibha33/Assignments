package Week3Day1;

public class Automation extends MultipleLanguage implements TestTool,Language{

	

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("learn selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("learn java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("learn ruby");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation ln = new Automation();
		   ln.Java();
		   ln.Selenium();
		   ln.python();
		   ln.ruby();
	
	}
}
