package patterns.creational.prototype.prototype;

import org.testng.annotations.Test;

import java.util.jar.JarOutputStream;

public class PrototypeDemo {

    @Test
    public void prototypeDemo() {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItems("movie");
        movie.setTitle("#creating patters in java");

        System.out.println(movie);
        System.out.println(movie.getRunTime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItems("movie");
        anotherMovie.setTitle("#gang of four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getRunTime());
        System.out.println(anotherMovie.getUrl());


    }
}
