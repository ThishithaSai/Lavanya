package DAY15;
class thisi extends Thread{
	public void run() {
		System.out.println("This thread internally called");
	}
}

public class multithread {
	public static void main(String[] args) {
		for(int i=0;i<=6;i++) {
			System.out.println("Main thread");
			try {
			Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}	
		thisi t=new thisi();
		t.run();
	}
}