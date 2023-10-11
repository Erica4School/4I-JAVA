package cilindroprog;

//Costruttore
public class Cilindro extends Cerchio {
  private double altezza;
  
  public Cilindro(double R, double H) //Parametri R=raggio, H=altezza
  {   super(R); //Richiama il costruttore della classe superiore cerchio
      altezza=H; //Equivalente a this.altezza=H
  }
  
  public void setAltezza(double ALTEZ)
  {   this.altezza=ALTEZ;
  }
  
  public void setRaggio(double RAGGIO)
  {   this.raggio=RAGGIO;
  }       
  
  public double getRaggio()
  {   double RAGG=this.raggio;
      return RAGG;
  } 
  
  public double getAltezza()
  {   double ALT=this.altezza;
      return ALT;
  }     
  
  public double volume()
  {   //Usa il metodo ereditato
      double VOL=area()*altezza;
      return VOL;    
  }
  
  public double areaCilindro()
  {   double areaCilindro=super.area()*2 + super.raggio * 2 * 3.1416 * altezza;    
      return areaCilindro;
  }        
}
