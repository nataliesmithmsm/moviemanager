import java.util.ArrayList;
import java.util.List;

public class MovieList {

    private int size = 0;
    List<String> movies = new ArrayList<>();


    public int size() {
        return size;
    }

    public void add(int i) {
        size = i;
    }

    public String getAllMovies() {
        return commaDelimitedStringfromMovieList().replaceAll(",$", "");
    }

    private String commaDelimitedStringfromMovieList() {
        String movieList = "";
        for (String film : movies) {
            movieList += film + ",";
        }
        return movieList;
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }
}