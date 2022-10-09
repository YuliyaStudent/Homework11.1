package ru.netology.domain;

import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    private AfishaRepository repo;

    public AfishaManager(AfishaRepository repo) {
        this.repo = repo;
    }

    private int limit;
    private String movieName;
    private static int id;

    public AfishaManager(){
    }

    public AfishaManager(int limit){
        this.limit = limit;
    }
    public AfishaManager(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}









