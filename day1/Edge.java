package week3.day1;

public class Edge extends Chrome{
public void takeSnap() {
		System.out.println("The snap is taken");
	}
public void clearcookies() {
	
	System.out.println("The cookies are cleared");

}
	public static void main(String[] args) {
		Edge ed= new Edge();
		ed.clearcookies();
		ed.takeSnap();
		ed.openIncognito();
	

	}

}
