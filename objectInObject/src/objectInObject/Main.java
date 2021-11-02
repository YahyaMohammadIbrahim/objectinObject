package objectInObject;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Title> titles = new ArrayList<Title>();
        ArrayList<Company> companys = new ArrayList<Company>();
		ArrayList<Personel> personels = new ArrayList<Personel>();
		personels.add(new Personel("Mark", "Zuckerberg", 42, null, null));
		personels.add(new Personel("Yahya", "Ibrahim", 16, null, null ));
		personels.add(new Personel("Aman","Kocabaþ", 66, null, null ));
		
		companys.add(new Company("www.facebook.com", "Facebook"));
		companys.add(new Company("www.github.com","Github" ));
		companys.add(new Company("www.instagram.com","Instagram"));
		
	    titles.add(new Title("Valorant", 123));
	    titles.add(new Title("RocketLeague", 23));
	    titles.add(new Title("Forest", 22));
	    
	   System.out.println(personels.get(0).getName()+ " -> "
	   		+personels.get(0).getSurname());
	  
	    
	    
	    
	    
	    
	    
	  
		
		
		
		
		
		
	
	}
	
	
	
	

}
