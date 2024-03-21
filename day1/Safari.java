package week3.day1;

import net.bytebuddy.pool.TypePool.Default.ReaderMode;

public class Safari extends Browser {
public void readerMode() {
	System.out.println("The readerMode method is created");
}
public void fullScreenMode() {
	System.out.println("The fullScreenMode method is created");

}

	public static void main(String[] args) {
		Safari sr =new Safari();
		sr.readerMode();
		sr.fullScreenMode();
		sr.openURL();
		sr.closeBrowser();
		sr.navigateBack();

	}

}
