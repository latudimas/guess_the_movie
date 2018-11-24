public class Main {
    public static void main(String [] args){

        MoviesList moviesList = new MoviesList("movies_title_file.txt");

        System.out.println(moviesList.getMovieTitle());
    }
}
