
import java.util.ArrayList;

public class myMainScuola {

	public static void main(String[] args) {
		int N=10;
		
		ArrayList<Studente> s = new ArrayList<>();
		for(int i=0;i<N;i++) {
			s.add(new Studente());
			s.get(i).start();
		}
		
		Professore p = new Professore(s);
		p.start();
		
	}
}
