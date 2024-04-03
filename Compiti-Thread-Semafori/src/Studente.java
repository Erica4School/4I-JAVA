
public class Studente extends Thread{

	public Boolean presente = false;
	static int n;
	int id;
	
	public Studente() {
		id = n;
		n++;
	}
	
	public void run() {
		try {
			Thread.sleep((int) (Math.random()*10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		presente = true;
		System.out.println("Studente "+ id+ " arriva");
	}
}
