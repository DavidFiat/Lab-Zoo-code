package model;


public class Date {
	
	// Attributes

	
	private int day;
	private int month;
	private int year;
	
	
	//Methods
	
	
	public Date(){
	
	}
	
	public void init(int theDay, int theMonth, int theYear){
		day = theDay;
		month = theMonth;
		year = theYear;
			
	}
	
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

    public String getBorn(){
		
		String born= (getDay()+"/"+ getMonth()+"/" +getYear());
		
		return born;
	}
	
	
	
	public double getDaysKangaroo(){
		
	double days= ((getDay()*1)+(getMonth()*12)+(getYear()*365));
		
	return days;
				
	}
  
	
  
  
}

	






		
