package week3.day1;

public class Browser {

	public void openURL() {
		System.out.println("The Browser is opened");
	}

	public void closeBrowser() {
		System.out.println("The Browser is closed");
		// TODO Auto-generated method stub
	}

	public void navigateBack() {
		System.out.println("Thee URL is navigated back");
	}

	public static void main(String[] args) {
		Browser br = new Browser();
		br.openURL();
		br.closeBrowser();
		br.navigateBack();
	}
}
