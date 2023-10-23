
public class PizzaPersonalizzata extends Pizza {
private double costoIngredienti;
private int calorieIngredienti;
	PizzaPersonalizzata(String nome, String farina, String dimensione,double costoIngredienti, int calorieIngredienti ) {
		super(nome, farina, dimensione);
		this.costoIngredienti = costoIngredienti;
		this.calorieIngredienti = calorieIngredienti;
	}

	@Override
	double getCosto() {
		double  costoTot=0;
		if(farina.equals("farina mais")) {costoTot+=1;}
		else {costoTot+=0;}
		if (dimensione.equals("maxi")){costoTot+=5;}
		else {costoTot+=0;}
		costoTot+=costoIngredienti;
		return costoTot;
	}

	@Override
	double getCalorie() {
		double  totKcal=0;
		if(farina.equals("farina mais")) { totKcal+=100;}
		else { totKcal+=10;}
		if (dimensione.equals("maxi")){ totKcal+=1000;}
		else { totKcal+=700;}
		 totKcal+=calorieIngredienti;
		return  totKcal;
	}

}
