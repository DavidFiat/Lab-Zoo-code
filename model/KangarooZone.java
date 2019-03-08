package model;


public class KangarooZone {
	
	// Attributes


	
	//private double kTotalArea;
	
	
		
	//Relations
	 
	 private Environment en1;
	 private Environment en2;
	 private Environment en3;
	 
	 //Methods
	 	 
		 
	public KangarooZone(Environment e1, Environment e2, Environment e3) {
	
		en1 = e1;
		en2 = e2;
		en3 = e3;
		
	}


		
	public  Environment getEn1() {
		return en1;
		
	}	
	
	public void setEn1(Environment en1) {
		this.en1 = en1;
	}
	
	
	public  Environment getEn2() {
		return en2;
		
	}	
	
	public void setEn2(Environment en2) {
		this.en2 = en2;
	}
	
	public  Environment getEn3() {
		return en3;
		
	}	
	
	public void setEn3(Environment en3) {
		this.en3 = en3;
		
		}
		
		
    public String vacuneKangaroo(Date actualDate){
		
	String mess= "";
	
		return mess;
	}
	 
	 	

    public String showKangaroo(Date fecha){
		String message3="";
		 	
			 
			 message3+=en1.showKangaroo(fecha)+"\n";
			
		  	 message3+=en2.showKangaroo(fecha)+"\n";
				
			 message3+=en3.showKangaroo(fecha)+"\n";
			 
		 
		
	  return message3;
	}
	
	
	
	 public String vowelKangaroo(){
			 
		 String message48="";
		   
			  		 
			 message48+=en1.vowelKangaroo()+"\n";
						 
			 message48+=en2.vowelKangaroo()+"\n";
			 
			 message48+=en3.vowelKangaroo()+"\n";
			 
			 
			 return message48;
			 
			 
	}
	
    public String showE(){
		
		String mess="";
		
		mess+="In environment 1:"+"\n";
		mess+= en1.showE()+"\n";
		mess+="In environment 2:"+"\n";
		mess+= en2.showE()+"\n";
		mess+="In environment 3:"+"\n";
		mess+= en3.showE()+"\n";
		
		return mess;
		
		
	}
	
public String nameKanga (){
			String message = "";
			if (en1.getKan1() != null){
				message += "\n 1."+en1.getKan1().getName();
			}
			if (en1.getKan2() != null){
				message += "\n 2."+en1.getKan2().getName();
			}
			if (en1.getKan3() != null){
				message += "\n 3."+en1.getKan3().getName();
			}
			if (en2.getKan1() != null){
				message += "\n 4."+en2.getKan1().getName();
			}
			if (en2.getKan2() != null){
				message += "\n 5."+en2.getKan2().getName();
			}
			if (en2.getKan3() != null){
				message += "\n 6."+en2.getKan3().getName();
			}
			if (en3.getKan1() != null){
				message += "\n 7."+en3.getKan1().getName();
			}
			if (en3.getKan2() != null){
				message += "\n 8."+en3.getKan2().getName();
			}
			if (en3.getKan3() != null){
				message += "\n 9."+en3.getKan3().getName();
			}
			message += "\n 10.Back ";
			return message;
		}




























	
	
	public String addKangaroo(Kangaroo add, int num) {
	   
	String message = "";
		   
	if(num==1) {
	message += en1.addKangaroo(add);
	}
	else if(num==2) {
	message += en2.addKangaroo(add);
	}
	else if(num==3) {
	message += en3.addKangaroo(add);
	}
	else {
			   message = "Type a valid environment";
		   }
		   return message;
	   }
	

	}



