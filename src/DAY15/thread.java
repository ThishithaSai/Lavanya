package DAY15;
class worker extends Thread{
	public void run() {
		Thread.currentThread().setName("run_method");
		System.out.println("Worker thread is running.");
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
public class thread {
	public static void main(String[] args) {
		worker w=new worker();
		w.start();
	}
}
