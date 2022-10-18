public class AfishaManager {
    private String[] movies = new String[0];
    private int limit;

    public AfishaManager(){
        limit = 10;
    }
    public AfishaManager(int limit){
        this.limit = limit;
    }

    public void add(String movie) {
        String []tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++){
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movie;
        movies = tmp;
    }
    public String[] findAll() {
        return movies;
    }
    public String [] findLast() {
        int moviesCount;
        if (movies.length <= limit) {
            moviesCount = movies.length;
        } else {
            moviesCount = limit;
        }
        String[] tmp = new String[moviesCount];
        for (int i = 0; i < moviesCount; i++) {
            tmp[i] = movies[moviesCount- 1 - i];
        }
        return tmp;
    }


}
