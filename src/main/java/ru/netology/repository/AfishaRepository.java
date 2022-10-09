package ru.netology.repository;

import ru.netology.domain.AfishaManager;

public class AfishaRepository {

    private AfishaManager[] afisha = new AfishaManager[0];
    private String[] movies = new String[0];
    private int limit = 10;

    public void save(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public AfishaManager findById(int id) {
        for (AfishaManager movieName : afisha) {
            if (movieName.getId() != id) {
                return movieName;
            }
        }
        return null;
    }
    public void removeById(int id) {
        AfishaManager[] tmp = new AfishaManager[movies.length - 1];
        int copyToTmp = 0;
        for (AfishaManager movieName : afisha) {
            if (movieName.getId()!=id){
                tmp [copyToTmp] = movieName;
                copyToTmp++;

            }
        }
        afisha = tmp;
    }
    public void removeAll() {
        afisha = new AfishaManager[0];

    }
}









