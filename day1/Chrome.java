package week3.day1;

public class Chrome extends Browser {
	public void openIncognito() {
		//Learn Inheritance
		System.out.println("The Incognito is opened");
		}
public void clearcache() {
	System.out.println("The Cache is cleared");
	}
	public static void main(String[] args) {
		Chrome chr = new Chrome();
		chr.clearcache();
		chr.openIncognito();
		chr.openURL();
		chr.closeBrowser();
		chr.navigateBack();
	}
		}

	