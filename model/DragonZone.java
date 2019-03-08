package model;


public class DragonZone {
	
	// Attributes


	
	private double humidity;
	private double temperature;
	private double filtration;
	private double water;
	private double dTotalArea;
	
	//Relations
	 
	 private Dragon dra1;
	 private Dragon dra2;
	 
	 //Methods
	
	public DragonZone(double humidity, double temperature, double filtration, double water, double dTotalArea, Dragon dr1, Dragon dr2) {
	
		this.humidity = humidity;
		this.temperature = temperature;
		this.filtration = filtration;
		this.water = water;
		this.dTotalArea = dTotalArea;
		dra1=dr1;
		dra2=dr2;
	
	}
	
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getFiltration() {
		return filtration;
	}
	public void setFiltration(double filtration) {
		this.filtration = filtration;
	}
	public double getWater() {
		return water;
	}
	public void setWater(double water) {
		this.water = water;
	}
	public double getDTotalArea() {
		return dTotalArea;
	}
	
	public Dragon getDra1() {
		return dra1;
	}
	public void setDra1(Dragon dra1) {
		this.dra1 = dra1;
	}
	
	public Dragon getDra2() {
		return dra2;
	}
	public void setDra2(Dragon dra2) {
		this.dra2 = dra2;
	}
	
	public String showDragon(){
		String message2="";
		 
			 message2+=dra1.showDragon()+"\n";
						 
			 message2+=dra2.showDragon()+"\n";
		
			 return message2;	 
		 }
	
	 public String vowelDragon(){
			 
		 String message48="";
		   
			  		 
			 message48+=dra1.vowelDragon()+"\n";
						 
			 message48+=dra2.vowelDragon()+"\n";
			 
			 
			 
			 return message48;
			 
			 
	}

}
	