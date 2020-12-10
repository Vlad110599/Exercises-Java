
public class City {
    
	public String name;
	public String country;
	public long population;
	
	City(String name,String country, long population){
		
		this.name = name;
	    this.country = country;
	    this.population = population;
	    
	}
	
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	
	public long getPupulation() {
		return population;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCarte(String country) {
		this.country = country;
	}
	
	public void setPupulation(long population) {
		this.population= population;
	}
  
	
	@Override
	public String toString() {
		return "City: "+name+" Country: "+country+" Population: "+population;
	}
	
static void PopulationSort(City c1,City c2) {
		
		String name = c1.name;
		String country = c1.country;
		long population = c1.population;
		c1.name = c2.name;
		c1.country = c2.country;
		c1.population = c2.population;
		c2.name = name;
		c2.country = country;
		c2.population = population;
	}	  
	
}
