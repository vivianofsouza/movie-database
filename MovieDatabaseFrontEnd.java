/*
 * Written by Vivian D'Souza
 * A simple implementation of a Movie Database/Directory in which a user can add and remove movie titles, search for movies by title, and print a 
 * list of all of their movies. This project uses the concept of a linked list in order to keep track of movie titles, add/remove them, and search for them. 
 */
	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;
	public class MovieDatabaseFrontEnd {
	public static MovieDatabase theMovies; 
	public static final String database = "./movies.txt";
	public static void main(String [] args)
	{	
		MovieDatabase theMovies = new MovieDatabase(); 
		Scanner keyboard = new Scanner(System.in);
		boolean quit = false;
		System.out.println("Welcome to the Movie Database!");
		System.out.println("Enter 1: to Add a Movie");
		System.out.println("Enter 2: to Remove a Movie by Title");
		System.out.println("Enter 3: to Search for Movies by Title");
		System.out.println("Enter 4: to Print All Movies"); 
		System.out.println("Enter 9: to Quit"); 
		
		int option = keyboard.nextInt();
		 
		
		while(quit!=true)
		{
			if(option == 1)
			{
				System.out.println("Enter a movie title to add.");
				String title = keyboard.next(); 
				theMovies.addMovie(title);
				System.out.println("Enter a another option, or press 9 to quit."); 
				option = keyboard.nextInt();
			}
			else if(option == 2)
			{
				System.out.println("Enter a movie title to remove.");
				String title = keyboard.next(); 
				theMovies.removeMovie(title);
				System.out.println("Enter a another option, or press 9 to quit."); 
				option = keyboard.nextInt();
			}
			else if(option == 3)
			{
				System.out.println("Enter a movie title to be searched for.");
				String title = keyboard.next(); 
				if(theMovies.searchForMovie(title))
					System.out.println(title + " found in Database!");
				else
					System.out.println(title + " not found in Database.");
				System.out.println("Enter a another option, or press 9 to quit."); 
				option = keyboard.nextInt();
			}
			else if(option == 4)
			{
				System.out.println("Here's a list of all your movies:");
				theMovies.printMovies(); 
				
				System.out.println("Enter a another option, or press 9 to quit."); 
				option = keyboard.nextInt();
			}
			else if(option == 9)
			{
				System.out.println("Goodbye!"); 
				quit = true; 
			}
		}
	}
}
