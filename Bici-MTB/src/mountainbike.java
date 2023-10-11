
public class mountainbike extends bici {
int altezzasella;
	mountainbike(int corona, int velocita,int altezzasella ) {
		super(corona, velocita); this.altezzasella = altezzasella;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString() +"mountainbike [altezzasella=" + altezzasella + "]";
	}

}
