package model;


public class Dragon {
	
	// Attributes

	private String name;
	private double weight;
	private double height;
	private String sex;
	private String bloodType;
	
	
	//Relations
	 
    private Date date1;
	
	//Methods
	
	 public Dragon(String name, double weight, double height, String sex, String bloodType, Date date1) {
	
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.sex = sex;
		this.bloodType = bloodType;
		this.date1 = date1;
		
	 }
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight(){
		return height;
	} 
	
	public void setHeight(double height ) {
		this.height = height;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	
	public double getBmi() {
		double bmi=(getWeight()/(getHeight()*getHeight()));
		return bmi;
	}	
		
		
		
			

    public String showDragon(){
		String message1 ="";
		
			
	        message1+= ("__________________________________________"+"\n");	
			message1+= ("                  Hello                   "+"\n");	
			message1+= ("My name is "+getName()+" " +"the dragon "+"\n");
			message1+= ("My weight is "+getWeight()+" "+"Kg"+"\n");
			message1+= ("My height is "+getHeight()+" "+"m"+"\n");
			message1+= ("I am a "+getSex()+"\n");
			message1+= ("I am "+getBloodType()+"\n");
			message1+= ("I was born on "+date1.getBorn()+"\n");
			message1+= ("And my BMI is "+getBmi()+"\n");
			message1+= ("__________________________________________"+"\n");	
		
		return message1;
		
}





    public String vowelDragon(){
		 
		 
		
		int t= getName().length();
		String message5="";
		
		--t;
		
		
	
		
		if((getName().charAt(t))==('a')||
		   (getName().charAt(t))==('e')||
		   (getName().charAt(t))==('i')||
		   (getName().charAt(t))==('o')||
		   (getName().charAt(t))==('u')||
		   (getName().charAt(t))==('A')||
		   (getName().charAt(t))==('E')||
		   (getName().charAt(t))==('I')||
		   (getName().charAt(t))==('O')||
		   (getName().charAt(t))==('U')){
			
			if(getSex()!="male"){
			
		message5= "Dragon "+getName()+ " "+ "ends her name with a vocal" ;
			
		    }
			
			else{
			
        message5= "Dragon "+getName()+ " "+ "ends his name with a vocal" ;			
		}
		}	

        if((getName().charAt(0))==('a')||
		   (getName().charAt(0))==('e')||
		   (getName().charAt(0))==('i')||
		   (getName().charAt(0))==('o')||
		   (getName().charAt(0))==('u')||
		   (getName().charAt(0))==('A')||
		   (getName().charAt(0))==('E')||
		   (getName().charAt(0))==('I')||
		   (getName().charAt(0))==('O')||
		   (getName().charAt(0))==('U')){
			
			if(getSex()!="male"){
			
		message5= "Dragon "+getName()+ " "+ "starts her name with a vocal" ;
			
		    }
			
			else{
			
        message5= "Dragon "+getName()+ " "+ "starts his name with a vocal" ;			
		}
		}	
		
		if(((getName().charAt(t))==('a')||
		    (getName().charAt(t))==('e')||
			(getName().charAt(t))==('i')||
			(getName().charAt(t))==('o')||
			(getName().charAt(t))==('u')||
			(getName().charAt(t))==('A')||
			(getName().charAt(t))==('E')||
			(getName().charAt(t))==('I')||
			(getName().charAt(t))==('O')||
			(getName().charAt(t))==('U'))&&
		   ((getName().charAt(0))==('a')||
		    (getName().charAt(0))==('e')||
			(getName().charAt(0))==('i')||
			(getName().charAt(0))==('o')||
			(getName().charAt(0))==('u')||
			(getName().charAt(0))==('A')||
			(getName().charAt(0))==('E')||
			(getName().charAt(0))==('I')||
			(getName().charAt(0))==('O')||
			(getName().charAt(0))==('U'))){
			
			if(getSex()!="male"){
			
		message5= "Dragon "+getName()+ " "+ "starts and ends her name with a vocal" ;
			
		    }
			
			else{
			
        message5= "Dragon "+getName()+ " "+ "starts and ends his name with a vocal" ;			
		}
		}	
		
		
		return message5;
		}
}