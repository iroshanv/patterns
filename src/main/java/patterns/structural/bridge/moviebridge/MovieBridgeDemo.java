package patterns.structural.bridge.moviebridge;

import org.testng.annotations.Test;

public class MovieBridgeDemo {

    @Test
    public void movieBridgeDemo() {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("john wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();

        Printer moviePrinter = new MoviePrinter(movie);
        String printMaterial = moviePrinter.print(printFormatter);
        System.out.println(printMaterial);

        String htmlPrinter = moviePrinter.print(new HtmlFormatter());
        System.out.println(htmlPrinter);

    }
}
