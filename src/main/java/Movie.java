public class Movie {
     String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void renameMovie(String updatedName) {
        name = updatedName;
    }

    public void throwIllegalArgumentExpetion() {
        if (getName() == null)
        {
            throw new IllegalArgumentException("value can not be null");
        }
    }
}
