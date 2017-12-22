import java.util.ArrayList;
import java.util.List;

public class MovieList {

    List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public String getAllMovies() {
        return commaDelimitedStringfromMovieList().replaceAll(",$", "");
    }

    private String commaDelimitedStringfromMovieList() {
        String movieList = "";
        for (Movie film : movies) {

            movieList += film.getName() + ",";
        }
        return movieList;
    }

    public int getSizeOfMovieList() {
        return movies.size();
    }

    public boolean contains(Movie movieToCheckFor) {
           return movies.contains(movieToCheckFor);
   }
}