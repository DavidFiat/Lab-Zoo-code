package ui;
  
import model.*;
import java.util.Scanner;

public class Main {

	private Zoo myRelation1;
	private Scanner reader;
	
	
	
	public Main(){
		
		init();
		reader = new Scanner (System.in);
 
	}
	
	public static void main(String[] args) {

		Main m = new Main();
		m.initDate();



			
		
	}
		
		public void init(){
		
	
	
		myRelation1 = new Zoo("Zoologico de Cali", new KangarooZone      (new Environment( 76.0, 28.0, 99.0, new Kangaroo ( "Jack" ,100.0,2.6, "male", "A ",      			new Date(3,1,2019)),   new Kangaroo(  "Hope" , 98.0, 2.7, "female", "O",    new Date(23,3,2014)), null),
		                                                                  new Environment( 74.0, 29.0, 99.0,  new Kangaroo ( "Kangaroo" ,12.0,2.65, "male", "AB",      	 new Date(4,1,2003)),   new Kangaroo(  "Marie" , 105.0, 2.5, "female", "A" , new Date(31,9,2014)), null),
																		  new Environment(76.5, 28.5, 99.0,   new Kangaroo ( "Jhon" ,100.4,2.64, "male", "B" ,         		new Date(30,12,2018)), new Kangaroo(  "Lily", 98.76, 2.47, "female", "AB" , new Date(26,9,2018)), null)),
												   new DragonZone (78.0, 28.0, 99.0, 35.0, 750.0,             new Dragon   ( "Rhaegal Targaryen" ,120.0,1.0, "male", "O",  new Date(13,10,2016)), new Dragon  (  "Hydra", 140.0, 1.4, "female", "O" ,  new Date(13,9,2019))));


	}
	
	
	
	
	
	
	

	
	
	
	
				
    public void initDate(){
				System.out.println ("Type actual day \n");
	            int day = reader.nextInt();
	            System.out.println ("Type actual month \n");
	            int month = reader.nextInt();
	            System.out.println ("Type actual year \n");
	            int year = reader.nextInt();
				Date actual = new Date (day,month,year);
				myRelation1.setCurrentDate(actual);
				System.out.println (""+actual.getDay()+"/"+actual.getMonth()+"/"+actual.getYear());
				showMenu();
	}
	
	
	
		
	
	
	
	public void showMenu(){
		int option = 0;
		while (option != 10){
			

			
					
			
		System.out.println("                          ------------------------------------------------------------------- ");	
		System.out.println("                         |                       Welcome to Cali's zoo.                     |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                         1.To add a kangaroo.                      |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                      2. To remove a kangaroo.                     |");	
		System.out.println("                         |-------------------------------------------------------------------|");
		System.out.println("                         |  3. To see which dragon starts or ends his/her name with a vowel. |");	
		System.out.println("                         |-------------------------------------------------------------------|");
		System.out.println("                         |4. To see which kangaroo starts or ends his/her name with a vowel. |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                5.To see environment' s information                |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |             6. To show kangaroo's information.                    |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                      1. Para adwfoeaow                            |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                      1. Para adwfoeaow                            |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                      1. Para adwfoeaow                            |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
	    System.out.println("                         |                      10. Para salir.                              |");	
		System.out.println("                          -------------------------------------------------------------------"+"\n"+"\n");
		
			
			
		option = reader.nextInt();	
			
			
		  switch (option){
              
               case (1):
			   
			   
			    System.out.println("");
				String y=reader.nextLine();
			   
			   System.out.println("Type kangaroo's name");
				String name=reader.nextLine();
				
				System.out.println("Type kangaroo's weight");
				double weight = reader.nextDouble();
				reader.nextLine();
				
				System.out.println("Type kangaroo' s height");
				double height = reader.nextDouble();
				reader.nextLine();
				
				System.out.println("Type kangaroo' s sex (Female or Male)");
				String sex = reader.nextLine();
				
				
				System.out.println("Type kangaroo' s bloodType(A,B,O or AB");
				String bloodType = reader.nextLine();
				
				System.out.println("Type kangaroo' s birthday");
				int day = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Type kangaroo' s birth month");
				int month = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Type kangaroo' s birth year");
				int year = reader.nextInt();
				reader.nextLine();
				
				Kangaroo add = new Kangaroo(name, weight, height, sex, bloodType, new Date(day, month, year));
				System.out.println("Wich environment do you want to add the kangaroo?");			
				
				System.out.println("1. Environment 1");
				System.out.println("2. Environment 2");
				System.out.println("3. Environment 3");
				
				int num = reader.nextInt();
				reader.nextLine();
				
				System.out.println(myRelation1.addKangaroo(add, num));
				
				break;
			
			   
			   case (2):
			   
				System.out.println("Type the number of the kangaroo that you want to remove");
				System.out.println(""+myRelation1.nameKanga());
				int nu= reader.nextInt();
				myRelation1.removeKanga(nu);
				break;
				
				case (3):
				
			  System.out.println(myRelation1.vowelDragon());
                break;
				  
				case (4):
				
			  System.out.println(myRelation1.vowelKangaroo());
                break;
             			  
			  
			   case (5):
			   
			   System.out.println(myRelation1.showE());
                break;	

				
				case(6):
				
				System.out.println(myRelation1.showKangaroo());
				break;

				case (7):
				
				System.out.println(myRelation1.showDragon());
			    break;
			}
		
		
				
		

			
		}
		
		
		
		
		
		
	}
	
	


	}





