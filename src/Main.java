public class Main {
    public static void main(String [] args){
        String fileName = "movies_title_file.txt";
//        MoviesList moviesList = new MoviesList(fileName);

//        char[] originTitle = moviesList.getMovieTitle();
//        char[] maskedTitle = moviesList.maskingMovietitle(originTitle);
//        System.out.println(originTitle);
//        System.out.println(maskedTitle);

        Game testGame = new Game(fileName);

        char[] original = testGame.getOriginalTitle();
        System.out.print(original);
        char[] masked = testGame.getMaskedTitle();
        System.out.print( masked );

        char inputChar;
        char[] testChar = new char[original.length];
//        char[] testChar = testGame.compare(inputChar);
//        System.out.println(testChar);
//
//        boolean result =  testGame.isCompleted();
//        System.out.print(result);

        while (testGame.gameEnded() == false){
//            inputChar = testGame.scanInput();
            testChar = testGame.compare();
            System.out.print(testChar);
        }

    }
}