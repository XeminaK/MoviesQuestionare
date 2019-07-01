
import java.util.Scanner; //scanner used to get user input

public class Movies {//class
	
	public String category;
	public String title;
	
	public Movies(String category, String title) { //constructor
		this.category=category;
		this.title=title;
	}
	
	public static void main(String[] args) {//main lines of code
		
		
		Movies film[]=new Movies[10];
		film[0]=new Movies("scifi", "Space Odysessy");
		film[1]=new Movies("horror", "Alien");
		film[2]=new Movies("animated", "The Cat Returns");
		film[3]=new Movies("animated", "Totoro");
		film[4]=new Movies("drama", "El Internado");
		film[5]=new Movies("horror", "IT");
		film[6]=new Movies("scifi", "Interstellar");
		film[7]=new Movies("drama", "50 First Dates");
		film[8]=new Movies("scifi", "Starship Troopers");
		film[9]=new Movies("animated", "A Silent Voice");
		
		//System.out.println(film[4].category + ", " + film[4].title);
		
		Scanner scnr = new Scanner(System.in); //set up scanner
		
		System.out.println("Welcome to the movie list application");
		System.out.println("There are 10 movies in this list!");
		
		String answer = "y"; //priming the loop
				while (answer.equals("y")) {
					
					System.out.println("What category are you interested in? Please choose between:animated, drama, horror, scifi");
					
					String category = scnr.nextLine();
					//System.out.println(category);
					
					if(category.equalsIgnoreCase("scifi")) {
						category = "scifi";
					}else if (category.equalsIgnoreCase("animated")) {
						category = "animated";	
					}else if (category.equalsIgnoreCase("horror")) {
						category = "horror";
					}else if (category.equalsIgnoreCase("drama")) {
						category = "drama";
					}else{
						System.out.println("Doesn't work");
					}
					
					for(int i=0;i<film.length;i++) {
						if(category == film[i].category) {
							System.out.println(film[i].title);
						}
					}//end loop for movies
					
					System.out.println("Would you like to continue? (y/n)");
					answer = scnr.nextLine();
					
				}
				
				System.out.println("Goodbye");
				scnr.close();
		
	}

}

