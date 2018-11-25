import java.util.Scanner;

public class Game {
    private boolean gameWon;
    private int pointLost;

    // Origin and Masked title field
    private final char[] originalTitle;
    private final char[] maskedTitle;

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
    public char[] compare(){
        // Looping through char array
        char userInput = scanInput();
        for(int i=0; i<originalTitle.length; i++){
            // Check if input char is in title char array
            if(userInput == originalTitle[i]){
                maskedTitle[i] = userInput;
            } else{
                pointLost += 1;
            }
        }
        return maskedTitle;
    }

    // Check untuk mengecek kondisi game, harus lanjut atau tidak
    public void gameStatus() {
        //check score
        boolean finish = isCompleted();
        if (pointLost == 10){
            gameWon = false;
        } else if (pointLost < 10 && finish) {
            gameWon = true;
        }
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

    // Check if title was completed
    public boolean isCompleted() {
        if(originalTitle != maskedTitle){
            return false;
        } else {
            return true;
        }
    }

}
