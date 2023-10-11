package cilindroprog;

public class Cerchio {
	public double raggio;			 //protected double raggio;
		
	protected Cerchio(double R)
	{	raggio=R;
	}

	protected double getRaggio()
	{	return this.raggio;
	}
	
	protected double getCirconferenza() //Calcolo della circonferenza del cerchio
	{	return (2*raggio*3.1416);
	}
	
	protected double area()			//Calcolo area del cerchio, base del cilindro
	{	return (raggio*raggio*3.1416);
	}
	

}
