
public class Persoana {
         
	private String nume;
	private String prenume;
	private int data;
	
	public Persoana(String nume,String prenume, int data) {
		this.nume = nume;
		this.prenume = prenume;
		this.data = data;
	}
	
	public String getName() {
		return nume;
	}
	public String getPre() {
		return prenume;
	}
	
	public int getData() {
		return data;
	}
	
	public void setName(String nume) {
		this.nume = nume;
	}
	
	public void setPre(String prenume) {
		this.prenume = prenume;
	}
	
	public void setData() {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return nume+","+prenume+","+data;
	}
	
	static void Interschimbare(Persoana p1, Persoana p2) {
		String nume = p1.nume;
		String prenume = p1.prenume;
		int data = p1.data;
		p1.nume = p2.nume;
		p1.prenume = p2.prenume;
		p1.data = p2.data;
		p2.nume = nume;
		p2.prenume = prenume;
		p2.data = data;
	}
	
}
