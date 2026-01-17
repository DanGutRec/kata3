package software.ulpgc.project.application;

import software.ulpgc.project.model.Movie;

import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {
        Stream<Movie> movies = new RemoteMovieLoader(Desarilazer::fromTsv).loadMovies();
        movies.forEach(System.out::println);
    }
}
