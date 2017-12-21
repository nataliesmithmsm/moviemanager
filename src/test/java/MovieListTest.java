import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieListTest {

    @Test
    public void emptyMovieListHasASizeOfZero() throws Exception {

        // Arrange
        MovieList movieList = new MovieList();

        // Act

        // Assert
        assertEquals(0, movieList.size());
    }

    @Test
    public void testTheSizeAfterAddingOneMovie() throws Exception {
        // Arrange
        MovieList oneItemMovieList = new MovieList();

        // Act
        oneItemMovieList.add(1);

        // Assert
        assertEquals(1, oneItemMovieList.size());
    }

    @Test
    public void testTheSizeAfterAddingTwoMovies() throws Exception {

        // Arrange
        MovieList twoMovieList = new MovieList();

        // Act
        twoMovieList.add(2);

        // Assert
        assertEquals(2, twoMovieList.size());
    }

    @Test
    public void testTheSizeAfterAdding10Movies() throws Exception {

        // Arrange
        MovieList twoMovieList = new MovieList();

        // Act
        twoMovieList.add(10);

        // Assert
        assertEquals(10, twoMovieList.size());
    }

    @Test
    public void testAddingAMovieWithAString() throws Exception {
        //Arrange
        MovieList movieList = new MovieList();

        //Act
        movieList.addMovie("Star Wars");
        //Assert
        assertEquals("Star Wars", movieList.getAllMovies());
    }


    @Test
    public void testAddingMultipleMoviesOneAtATime() throws Exception {
        //Arrange
        MovieList movieList = new MovieList();

        //Act
        movieList.addMovie("Star Wars");
        movieList.addMovie("Harry Potter");
        movieList.addMovie("Lord of the rings");

        //Assert
        assertEquals("Star Wars,Harry Potter,Lord of the rings", movieList.getAllMovies());
    }
}


