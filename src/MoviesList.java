import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MoviesList {
    private ArrayList<String> movies;
    private char[] movieTitle;

    // Default Constructor
    public MoviesList(String fileName) {
        movies = new ArrayList();
        File file = new File(fileName);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                movies.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.print("File Not Found\n");
            e.printStackTrace();
        }
    }

    // Pick Random Title
    public char[] getMovieTitle() {
        int movieIndex = (int) (Math.random()*movies.size());
        String titleString = movies.get(movieIndex);
        return titleString.toCharArray();
    }

    public char[] maskingMovietitle() {
        char[] originTitle = getMovieTitle();
//        whil
    }
}
