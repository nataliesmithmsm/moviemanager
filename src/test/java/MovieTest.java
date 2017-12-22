import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void AddingAMovie() throws Exception {
        //Arrange
        Movie movie = new Movie("Home Alone");

        //Assert
        assertEquals("Home Alone", movie.getName());
    }


    @Test
    public void renamingAMovie() throws Exception {
        //Arrange
        Movie movie = new Movie("Home Alone");

        //Act
        movie.renameMovie("Home Alone 2");

        //Assert
        assertEquals("Home Alone 2", movie.getName());
    }


    @Test (expected = IllegalArgumentException.class)
    public void errorWhenCreatingANullMovie() throws Exception {
        //Arrange
        Movie movie = new Movie(null);

        //Assert
        movie.throwIllegalArgumentExpetion();
    }
}
