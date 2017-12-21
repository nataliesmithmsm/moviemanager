import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieListTest {

    @Test
    public void testAddingAMovieObject() {
        //Arrange
        MovieList movieList = new MovieList();
        //Act
        Movie movie = new Movie("Home Alone");
        movieList.addMovie(movie);

        //Assert
        assertEquals("Home Alone", movieList.getAllMovies());
    }

    @Test
    public void testAddingMultipleMoviesAtOnce() {
        //Arrange
        MovieList movieList = new MovieList();

        //Act
        Movie movie = new Movie("Home Alone");
        Movie movie2 = new Movie("Lion King");
        Movie movie3 = new Movie("Star Wars");

        movieList.addMovie(movie);
        movieList.addMovie(movie2);
        movieList.addMovie(movie3);

        //Assert
        assertEquals("Home Alone,Lion King,Star Wars", movieList.getAllMovies());
    }
}


