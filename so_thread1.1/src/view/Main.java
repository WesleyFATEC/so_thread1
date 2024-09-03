package view;
import controller.Threadid;
public class Main {

	public static void main(String[] args) {
		for (int i =0 ; i<5 ; i++) {
			  Thread thread = new Thread(new Threadid());
			  thread.start();
		}

	}

}
