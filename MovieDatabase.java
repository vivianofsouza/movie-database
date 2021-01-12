/*
 * Written by Vivian D'Souza
 */
public class MovieDatabase {
	private GenLL<String> movieTitles; 
 

	public MovieDatabase()
	{
		movieTitles = new GenLL<String>();
	}
	
	public void addMovie(String theMovie)
	{
		movieTitles.addNew(theMovie);
	}
	
	public void removeMovie(String theMovie)
	{
		movieTitles.remove(theMovie);
	}

	public boolean searchForMovie(String theMovie)
	{
		return movieTitles.contains(theMovie);
	}
	
	public void printMovies()
	{
		movieTitles.print(); 
	}
}
