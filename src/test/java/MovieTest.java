import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void AddingMovieObjectsToAList() throws Exception {
        //Arrange
        Movie movie = new Movie("Home Alone");

        //Act

        //Assert
        assertEquals("Home Alone", movie.getName());
    }
}
