package model;


public class Zoo {
	
	// Attributes

	
	private String name;
	
	
	//Relations
	 
	 private KangarooZone kZone;
	 private DragonZone dZone;
	 private Date actual;
	
	
	 //Methods
	 
	 
	 public Zoo(String name, KangarooZone kZo, DragonZone dZo) {
	
		this.name = name;
		kZone = kZo;
		dZone = dZo;
	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public KangarooZone getKZone() {
		return kZone;
	}
	
	public void setKZone(KangarooZone kZone) {
		this.kZone = kZone;
	}
	
	public DragonZone getDZone() {
		return dZone;
	}
	public void setDZone(DragonZone dZone) {
		this.dZone = dZone;
		
	}
	
	
	
	
    public String showDragon(){
	   
	   String message=dZone.showDragon();
	   
	      
	   return message;
    }
   
   
    public String vowelDragon(){
	   
	   String message=dZone.vowelDragon();
	   
	      
	   return message;
    }
    
   
   
   
   
    public String showKangaroo(){
	   
	   String message2=kZone.showKangaroo(actual);
	   
	      
	   return message2;
	 }
	 
	public String nameKanga(){
		String message = "";
		
		message += kZone.nameKanga();
			
		return message;
	} 
	 
	 	public void removeKanga(int nu){
		switch(nu){
			case (1):
			kZone.getEn1().setKan1(null);
			System.out.println("El canguro ha sido eliminado");
			break;
			case (2):
			kZone.getEn1().setKan2(null);
			System.out.println("El canguro ha sido eliminado");
			break;
			case (3):
			kZone.getEn1().setKan3(null);
			System.out.println("El canguro ha sido eliminado");
			break;
			case (4):
			kZone.getEn2().setKan1(null);
			System.out.println("El canguro ha sido eliminado");
			break;
			case (5):
			kZone.getEn2().setKan2(null);
			System.out.println("El canguro ha sido eliminado");
			break;
			case (6):
			kZone.getEn2().setKan3(null);
			System.out.println("El canguro ha sido eliminado");
			break;
			case (7):
			kZone.getEn3().setKan1(null);
			System.out.println("El canguro ha sido eliminado");
			break;
			case (8):
			kZone.getEn3().setKan2(null);
			System.out.println("El canguro ha sido eliminado");
			break;
			case (9):
			kZone.getEn3().setKan3(null);
			System.out.println("El canguro ha sido eliminado");
			break;
		}
		}
	 	
	public String vowelKangaroo(){
		String message = "";
		
		message += kZone.vowelKangaroo();
		
		return message;
	}
    
	public String showE(){
		
			
	   String message=kZone.showE();
	   
	      
	   return message;
		
	}
	
	public void setCurrentDate(Date actual){
		
		
		
		this.actual=actual;
		
	}
	 
	 
	public String addKangaroo(Kangaroo add , int num) {
		
	String message = "";
		
	message += kZone.addKangaroo(add, num);
		
	return message; 
	 
	 
	 
	 
	 	 
	
}


}