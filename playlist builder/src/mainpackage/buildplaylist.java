package mainpackage;
import java.util.Scanner;
import java.lang.*;

public class buildplaylist {
  
  public static String genre(String input) {
    System.out.println("What is your favorite genre of music?");
    Scanner scnr = new Scanner(System.in);
    String genre = scnr.next();
    return genre;
  }
  
  public static String whichGenre(String genre) {
    if (genre.equals("rock") || genre.equals("Rock")) {
      return genre;
    }
    if (genre.equals("pop") || genre.equals("Pop")) {
      return genre;
    }
    if (genre.equals("country") || genre.equals("Country")) {
      return genre;
    }
    if (genre.equals("rap") || genre.equals("Rap")) {
      return genre;
    }
    if (genre.equals("indie") || genre.equals("Indie")) {
      return genre;
    }
    if (genre.equals("classical") || genre.equals("Classical")) {
      return genre;
    } 
    if (genre.equals("soul") || genre.equals("Soul")) {
      return genre;
    } else {
      return null;
    }
  }

  public static void main(String[] args) {
    System.out.println("Ayeee");
  }

}
