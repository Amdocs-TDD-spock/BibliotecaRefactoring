package main;
public class Movie {

    String movieTitle;
    String movieDirector;
    String movieRanking;
    public Movie(String movieTitle, String movieDirector, String movieRanking) {
        this.movieTitle=movieTitle;
        this.movieDirector=movieDirector;
        this.movieRanking=movieRanking;
    }

    @Override
    public String toString(){
        return movieTitle + " - Director: " + movieDirector + " Rating: " + movieRanking;
    }
}
