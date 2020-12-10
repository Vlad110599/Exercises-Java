
public class Cont {
	
  String nume;
  String parola;
  
  public Cont(String nume,String parola) {
	  this.nume = nume;
	  this.parola = parola;
  }
  
  public String getpass() {
	  return parola;
  }
  
  public String getname() {
	  return nume;
  }
  
  public String toString ()
	{
		return nume + ","  + parola ;
	}
}
