
public class Client {
	 String nume;
	 String prenume;
	 int varsta;
	  
	  public Client(String nume,String prenume,int varsta) {
		  this.nume = nume;
		  this.prenume = prenume;
		  this.varsta = varsta;
	  }
	  
	  public String getpre() {
		  return prenume;
	  }
	  
	  public double getage() {
		  return varsta;
	  }
	  
	  public String getname() {
		  return nume;
	  }
	  
	  public String toString ()
		{
			return nume + "," + prenume + "," + varsta;
		}
}
