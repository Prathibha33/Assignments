package week1Day2;

public class Tab {
	public int tabPrice(int tabPrice) {
return tabPrice;
}

public String tabBrand(String brandName) {
	
	return brandName;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tab tab = new Tab();
tab.tabPrice(0);
tab.tabBrand(null);
String brand = tab.tabBrand("Samsumg");
 int price = tab.tabPrice(20000);
	System.out.println("Tab brand is : " + brand);
	System.out.println("Tab price is : " + price);
	}

	
	}


