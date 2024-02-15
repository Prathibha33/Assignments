package Week3Day2;

public class Calculator {
	public void add(int x,int y) {
	System.out.println(x+y);
	}
	
    public void add(int x, int y,int z) {
    	System.out.println(x+y+z);
    	
    }
    public void multiple(double a,double b) {
    	System.out.println(a*b);
    	
    }
    public void multiple(float a,float b) {
    	System.out.println(a*b);
    	
    }
	public static void main(String[] args) {
		Calculator math=new Calculator();
		math.add(1, 2);
		math.add(1, 2, 3);
		math.multiple(6.1, 9.1);
		math.multiple(6.34, 9.56);

	}

}
