
public class mainMTB {

	public static void main(String[] args) {
		bici[] pippo = new mountainbike[3];
		pippo[0] = new mountainbike(30, 5, 3);
		pippo[1] =new mountainbike(20, 3, 3);
		pippo[2] = new mountainbike(20, 5, 1);
		for (bici x: pippo) {System.out.println(x.toString());}

	}

}
