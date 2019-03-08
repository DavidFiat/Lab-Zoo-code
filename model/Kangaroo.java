package model;


public class Kangaroo {
	
	// Attributes
	
	private String name;
	private double weight;
	private double height;
	private String sex;
	private String bloodType;
	
		
	//Relations
	 
	 private Date date2;
	 
	 
	 //Methods
	 
	 
	 public Kangaroo(String name, double weight, double height, String sex, String bloodType, Date da2) {
	
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.sex = sex;
		this.bloodType = bloodType;
		date2 = da2;
	
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
	
	public double getBmi() {
		double bmi=(getWeight()/(getHeight()*getHeight()));
		return bmi;
	}
		
		
		
	public double getFood(){
		
	double food=0.0;
 
                 		
	if(getWeight()<(30)){
		
		food=(getWeight()*(0.8));
	}	
		
	if((getWeight()>(30))||(getWeight()<(48))){
		
		food=(getWeight()*(1.1));
	}
	
	if (getWeight()>(48)){
		
		food=(40+((getWeight()-48)*0.4));
				
	}
		            
	return food;
				
	}	
	public Date getDate2() {
		return date2;
	}
	public void setDate2(Date date2) {
		this.date2 = date2;
	}	
	
	
	public String vacune(Date actual ){
		
		 
		 
		 String vacune= "";
		 double nowDate=((actual.getDay()*1)+(actual.getMonth()*12)+(actual.getYear()*365));
		 
		 if ((nowDate-date2.getDaysKangaroo())==365){
			 
			 vacune="The kangaroo needs vacune";
		 }
		 
		  if ((nowDate-date2.getDaysKangaroo())<365){
			 
			 vacune="The kangaroo does not need vacune yet";
		  }
		 
		  if ((nowDate-date2.getDaysKangaroo())>365){
			 
			 vacune="The kangaroo has a vacune already";
		 
		  }
		 
		 		 
		 return vacune;
		 
		 
		 
		 
	 }	
		
			
	 
	public String showKangaroo(Date fechita){
		String message1 ="";
		
		
	        message1+= ("__________________________________________"+"\n");	
			message1+= ("                  Hello                   "+"\n");	
			message1+= ("My name is kangaroo "+getName()+"\n");
			message1+= ("My weight is "+getWeight()+" "+"Kg "+"\n");
			message1+= ("My height is "+getHeight()+" "+"m "+"\n");
			message1+= ("I am a "+getSex()+"\n");
			message1+= ("I am "+getBloodType()+"\n");
			message1+= ("I was born on "+date2.getBorn()+"\n");
			message1+= ("And my BMI is "+getBmi()+"\n");
			message1+= (vacune(fechita)+"\n");
			message1+= (heartProblem()+"\n");
			message1+= ("___________________________________________"+"\n");	
		
		return message1;
		
		
	}
	
	
	
	 public String vowelKangaroo(){
		 
		 
		
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
             message5= "Kangaroo "+getName()+ " "+ "ends her name with a vocal" ;
		     }
			
			else{
			
             message5= "Kangaroo "+getName()+ " "+ "ends his name with a vocal" ;			
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
			
		message5= "Kangaroo "+getName()+ " "+ "starts her name with a vocal" ;
			
		    }
			
			else{
			
        message5= "Kangaroo "+getName()+ " "+ "starts his name with a vocal" ;			
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
			
		message5= "Kangaroo "+getName()+ " "+ "starts and ends her name with a vocal" ;
			
		    }
			
			else{
			
        message5= "Kangaroo "+getName()+ " "+ "starts and ends his name with a vocal" ;			
		         }
		}	
		
		
		return message5;
		}
	
	
		public String heartProblem(){
			
			String messa="";
			
			if (getWeight()<18){
				
					if((getBloodType().equalsIgnoreCase("A")||(getBloodType().equalsIgnoreCase("AB")))){
						
					messa=" This kangaroo has a low risk to suffer heart attacks";
										
					}
							
					else {
					messa="This kangaroo has a moderated risk to suffer heart attacks";
			
					}                       
										
			}
			
			if ((getWeight()>18)&&(getWeight()<25)){
				
					
						
					messa=" This kangaroo has a low risk to suffer heart attacks";
										
					     
										
			}		
			
			if (getWeight()>25){
				
				if((getBloodType().equalsIgnoreCase("A"))||(getBloodType().equalsIgnoreCase("B"))||(getBloodType().equalsIgnoreCase("O"))){
						
					messa="This kangaroo has a high risk to suffer heart attacks";
										
					}
							
				else {
					messa="This kangaroo has a moderated risk to suffer heart attacks";
			
					}                       
										
			}	
			
			
			
			
			return messa;
		
			
			
		}
         
   
	
	

			
			
			
			
			
			
			
			
			
	

		
		
	}
	  
	
	
	
	
	
	
	
