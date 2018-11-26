import java.util.Scanner;

public class Game {
    private boolean gameWon;
    private int pointLost;

    // Origin and Masked title field
    private char[] originalTitle;
    private char[] maskedTitle;

    // Default Constructor
    public Game(String fileName) {
        // From MovieList Class
        MoviesList moviesList = new MoviesList(fileName);
        originalTitle = moviesList.getMovieTitle();
        maskedTitle = moviesList.maskingMovietitle(originalTitle);

        gameWon = false;
        pointLost = 0;
    }

    // Scanning input
    public char scanInput(){
        System.out.println("Insert your letter: ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        char input = temp.charAt(0);

        return input;
    }

    // Compare input dengan original title (Perlu dibuat objek movieList nya)
    // public char[] compare(char[] originChar, char[] maskedChar, char userInput){
    // TODO change how counting pointLost Mechanism,
    public char[] compare(){
//    public  void compare() {
        // Looping through char array
        char userInput = scanInput();
        for(int i=0; i<originalTitle.length; i++){
            // Check if input char is in title char array
            if(userInput == originalTitle[i]){
                maskedTitle[i] = userInput;
//                System.out.println("point: " + pointLost);
            } else{
//                System.out.println("point: " + pointLost);
//                pointLost ++;
            }
            getPointLost();
        }
        return maskedTitle;
//        System.out.println(maskedTitle);
    }


    // Method for control game flow, is it end or not
    public boolean gameEnded() {
        if (pointLost >= 10){
            return true;
        }

        if (originalTitle == maskedTitle) {
            gameWon = true;
            return true;
        }
        return false;
    }

    // Getter Method untuk akses originalTitle dan maskedTitle
    public char[] getOriginalTitle() {
        return originalTitle;
    }

    public char[] getMaskedTitle() {
        return maskedTitle;
    }

    // Method for checking is it won or not
    public boolean wonTheGame(){
        return gameWon;
    }

    public void getPointLost () {
        System.out.println("Points Lost: " + pointLost);
    }
}
