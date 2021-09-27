package mainpackage;
import java.util.Scanner;
import java.lang.*;

public class Playlist {
  
  class Node {
    String value;
    Node next;
    
    public Node(String value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
  
  public class LinkedStringList {
    Node front;
    
    public LinkedStringList() {
      this.front = new Node(null, null);
    }
    
    public void prepend(String song) {
      this.front.next = new Node(song, this.front.next);
    }
    
    public String get(int index) {
      Node temp = this.front.next;
      for(int i = 0; i < index; i += 1) {
        temp = temp.next;
      }
      return temp.value;
    }
    
    public void remove(int index) {
      Node temp = this.front.next;
      for (int i = 0; i < (index - 1); i +=1) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
    }
    
    public void add(String song) {
      Node temp = this.front;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node(song, null);
    }
    
    public int getSize() {
      int size = 0;
      Node temp = this.front;
      while (temp.next != null) {
        temp = temp.next;
        size++;
      }
      return size;
    }
    
    public String[] toArray() {
      int size = 0;
      Node temp = this.front;
      while (temp.next != null) {
        temp = temp.next;
        size++;
      }
      System.out.println("Your Playlist:");
      String[] transferArray = new String[size];
      Node newTemp = this.front;
      for (int i = 0; i < size; i++) {
        newTemp = newTemp.next;
        transferArray[i] = newTemp.value;
        System.out.println((i + 1) + ". " + transferArray[i]);
      }
      return transferArray;
    }
    
  }
  
  public String genreOne;
  public String genreTwo;
  public String artistOne;
  public String artistTwo;
  
  public Playlist(String gOne, String gTwo, String aOne, String aTwo) {
    this.genreOne = gOne;
    this.genreTwo = gTwo;
    this.artistOne = aOne;
    this.artistTwo = aTwo;
  }
  
  public static String genre() {
    System.out.println("What is your favorite genre of music?");
    Scanner scnr = new Scanner(System.in);
    String genre = scnr.next();
    genre = whichGenre(genre);
    if (genre == null) {
      System.out.println("So, what is your favorite genre of music?");
      Scanner newScnr = new Scanner(System.in);
      String correctGenre = scnr.next();
      return correctGenre;
    }
    return genre;
  }
  
  public static String secondGenre(String firstGenre) {
    System.out.println("Do you have another preferred genre of music?");
    Scanner scnr = new Scanner(System.in);
    String genre = scnr.next();
    genre = whichGenre(genre);
    if (firstGenre.equals(genre)) {
      return null;
    }
    if (genre == null) {
      System.out.println("So, do you have another preferred genre of music?");
      Scanner newScnr = new Scanner(System.in);
      String correctGenre = scnr.next();
      return correctGenre;
    }
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
      System.out.println("That is not a valid genre. Your options "
          + "include: rock, pop, indie, country, rap, classical and soul");
      return null;
    }
  }
  
  public static String artist(String currentGenre) {
    if (currentGenre.equals("rock") || (currentGenre.equals("Rock"))) {
      System.out.println("Who is your favorite artist out of the following: "
          + "The Rolling Stones, Fleetwood Mac, Elvis Presley, AC/DC or Queen?");
    }
    if (currentGenre.equals("pop") || (currentGenre.equals("Pop"))) {
      System.out.println("Who is your favorite artist out of the following: Adele, "
          + "Taylor Swift, Harry Styles, Bruno Mars, or Beyonce?");
    }
    if (currentGenre.equals("indie") || (currentGenre.equals("Indie"))) {
      System.out.println("Who is your favorite artist out of the following: The"
          + "Killers, MGMT, Bon Iver, Phoebe Bridgers, or The Arctic Monkeys?");
    }
    if (currentGenre.equals("country") || (currentGenre.equals("Country"))) {
      System.out.println("Who is your favorite artist out of the following: Carrie "
          + "Underwood, Blake Shelton, Tim McGraw, Morgan Wallen, or Dolly Parton?");
    }
    if (currentGenre.equals("rap") || (currentGenre.equals("Rap"))) {
      System.out.println("Who is your favorite artist out of the following: Drake, "
          + "Kanye West, Nicki Minaj, J. Cole, or Cardi B?");
    }
    if (currentGenre.equals("classical") || (currentGenre.equals("Classical"))) {
      System.out.println("Who is your favorite artist out of the following: Johann Sebastian Bach"
          + "Wolfgang Amadeus Mozart, Ludwig van Beethoven, Frederic Chopin, or Claude Debussy?");
    }
    if (currentGenre.equals("soul") || (currentGenre.equals("Soul"))) {
      System.out.println("Who is your favorite artist out of the following: Al"
          + "Green, Aretha Franklin, Stevie Wonder, Marvin Gaye, or The "
          + "Temptations?");
    }
    Scanner scnr = new Scanner(System.in);
    String artist = scnr.nextLine();
    return artist;
  }
  
  public static String secondArtist(String secondGenre, String firstArtist) {
    if (secondGenre.equals("rock") || (secondGenre.equals("Rock"))) {
      System.out.println("Who is your favorite artist out of the following: The "
          + "Rolling Stones, Fleetwood Mac, Elvis Presley, AC/DC or Queen?");
    }
    if (secondGenre.equals("pop") || (secondGenre.equals("Pop"))) {
      System.out.println("Who is your favorite artist out of the following: Adele, "
          + "Taylor Swift, Harry Styles, Bruno Mars, or Beyonce?");
    }
    if (secondGenre.equals("indie") || (secondGenre.equals("Indie"))) {
      System.out.println("Who is your favorite artist out of the following: The "
          + "Killers, MGMT, Bon Iver, Phoebe Bridgers, or The Arctic Monkeys?");
    }
    if (secondGenre.equals("country") || (secondGenre.equals("Country"))) {
      System.out.println("Who is your favorite artist out of the following: Carrie "
          + "Underwood, Blake Shelton, Tim McGraw, Morgan Wallen, or Dolly Parton?");
    }
    if (secondGenre.equals("rap") || (secondGenre.equals("Rap"))) {
      System.out.println("Who is your favorite artist out of the following: Drake, "
          + "Kanye West, Nicki Minaj, J. Cole, or Cardi B?");
    }
    if (secondGenre.equals("classical") || (secondGenre.equals("Classical"))) {
      System.out.println("Who is your favorite artist out of the following: Johann Sebastian Bach"
          + "Wolfgang Amadeus Mozart, Ludwig van Beethoven, Frederic Chopin, or Claude Debussy?");
    }
    if (secondGenre.equals("soul") || (secondGenre.equals("Soul"))) {
      System.out.println("Who is your favorite artist out of the following: Al"
          + "Green, Aretha Franklin, Stevie Wonder, Marvin Gaye, or The "
          + "Temptations?");
    }
    Scanner scnr = new Scanner(System.in);
    String artist = scnr.nextLine();
    if (firstArtist.equals(artist)) {
      return null;
    }
    return artist;
  }
  
  
  public static Playlist buildPlaylist() {
    String gOne = genre();
    String gTwo = secondGenre(gOne);
    String aOne = artist(gOne);
    String aTwo = secondArtist(gTwo, aOne);
    Playlist yourPlaylist = new Playlist(gOne, gTwo, aOne, aTwo);
    return yourPlaylist;
  }
  
  public static void listPlaylist(Playlist info) {
    LinkedStringList finalPlaylist = info.new LinkedStringList();
    if(info.artistOne.equals("The Rolling Stones") || info.artistTwo.equals("The Rolling Stones")) {
      finalPlaylist.add("Sweet Virginia by The Rolling Stones");
      finalPlaylist.add("Dead Flowers by The Rolling Stones");
      finalPlaylist.add("Paint It, Black by The Rolling Stones");
      finalPlaylist.add("You Can't Always Get What You Want by The Rolling Stones");
    }
    if(info.artistOne.equals("Fleetwood Mac") || info.artistTwo.equals("Fleetwood Mac")) {
      finalPlaylist.add("Gypsy by Fleetwood Mac");
      finalPlaylist.add("Dreams by Fleetwood Mac");
      finalPlaylist.add("Rhiannon by Fleetwood Mac");
      finalPlaylist.add("Landslide by Fleetwood Mac");
    }
    if(info.artistOne.equals("Elvis Presley") || info.artistTwo.equals("Elvis Presley")) {
      finalPlaylist.add("Hound Dog by Elvis Presley");
      finalPlaylist.add("Jailhouse Rock by Elvis Presley");
      finalPlaylist.add("Suspicious Minds by Elvis Presley");
      finalPlaylist.add("Burning Love by Elvis Presley");
    }
    if(info.artistOne.equals("AC/DC")  || info.artistTwo.equals("AC/DC")) {
      finalPlaylist.add("Back in Black by AC/DC");
      finalPlaylist.add("Highway to Hell by AC/DC");
      finalPlaylist.add("Thunderstruck by AC/DC");
      finalPlaylist.add("You Shook Me All Night Long by AC/DC");
    }
    if(info.artistOne.equals("Queen") || info.artistTwo.equals("Queen")) {
      finalPlaylist.add("Bohemian Rhapsody by Queen");
      finalPlaylist.add("Another One Bites the Dust by Queen");
      finalPlaylist.add("Don't Stop Me Now by Queen");
      finalPlaylist.add("We Are the Champions by Queen");
    }
    if(info.artistOne.equals("Adele") || info.artistTwo.equals("Adele")) {
      finalPlaylist.add("Rolling in the Deep by Adele");
      finalPlaylist.add("Hello by Adele");
      finalPlaylist.add("Chasing Pavements by Adele");
      finalPlaylist.add("Rumour Has It by Adele");
    }
    if(info.artistOne.equals("Taylor Swift") || info.artistTwo.equals("Taylor Swift")) {
      finalPlaylist.add("You Belong With Me by Taylor Swift");
      finalPlaylist.add("august by Taylor Swift");
      finalPlaylist.add("Speak Now by Taylor Swift");
      finalPlaylist.add("I Knew You Were Trouble. by Taylor Swift");
    }
    if(info.artistOne.equals("Harry Styles") || info.artistTwo.equals("Harry Styles")) {
      finalPlaylist.add("From the Dining Table by Harry Styles");
      finalPlaylist.add("Sweet Creature by Harry Styles");
      finalPlaylist.add("Watermelon Sugar by Harry Styles");
      finalPlaylist.add("Falling by Harry Styles");
    }
    if(info.artistOne.equals("Bruno Mars") || info.artistTwo.equals("Bruno Mars")) {
      finalPlaylist.add("Talking to the Moon by Bruno Mars");
      finalPlaylist.add("The Lazy Song by Bruno Mars");
      finalPlaylist.add("Locked Out of Heaven by Bruno Mars");
      finalPlaylist.add("24K Magic by Bruno Mars");
    }
    if(info.artistOne.equals("Beyonce") || info.artistTwo.equals("Beyonce")) {
      finalPlaylist.add("Lemonade by Beyonce");
      finalPlaylist.add("Single Ladies by Beyonce");
      finalPlaylist.add("Hold Up by Beyonce");
      finalPlaylist.add("Irreplaceable by Beyonce");
    }
    if(info.artistOne.equals("The Killers") || info.artistTwo.equals("The Killers")) {
      finalPlaylist.add("Sweet Virginia by The Rolling Stones");
      finalPlaylist.add("Dead Flowers by The Rolling Stones");
      finalPlaylist.add("Paint It, Black by The Rolling Stones");
      finalPlaylist.add("You Can't Always Get What You Want by The Rolling Stones");
    }
    if(info.artistOne.equals("MGMT") || info.artistTwo.equals("MGMT")) {
      finalPlaylist.add("Gypsy by Fleetwood Mac");
      finalPlaylist.add("Dreams by Fleetwood Mac");
      finalPlaylist.add("Rhiannon by Fleetwood Mac");
      finalPlaylist.add("Landslide by Fleetwood Mac");
    }
    if(info.artistOne.equals("Bon Iver") || info.artistTwo.equals("Bon Iver")) {
      finalPlaylist.add("Skinny Love by Bon Iver");
      finalPlaylist.add("Blood Bank Rock by Bon Iver");
      finalPlaylist.add("Holocene by Bon Iver");
      finalPlaylist.add("29 #Strafford APTS by Bon Iver");
    }
    if(info.artistOne.equals("Phoebe Bridgers") || info.artistTwo.equals("Phoebe Bridgers")) {
      finalPlaylist.add("Motion Sickness by Phoebe Bridgers");
      finalPlaylist.add("Kyoto by Phoebe Bridgers");
      finalPlaylist.add("Garden Song by Phoebe Bridgers");
      finalPlaylist.add("Graceland Too by Phoebe Bridgers");
    }
    if(info.artistOne.equals("The Arctic Monkeys") || info.artistTwo.equals("The Arctic Monkeys")) {
      finalPlaylist.add("Do I Wanna Know? by The Arctic Monkeys");
      finalPlaylist.add("505 by The Arctic Monkeys");
      finalPlaylist.add("I Wanna Be Yours by The Arctic Monkeys");
      finalPlaylist.add("Why'd You Only Call Me When You're High? by The Arctic Monkeys");
    }
    if(info.artistOne.equals("Carrie Underwood") || info.artistTwo.equals("Carrie Underwood")) {
      finalPlaylist.add("Americna Girl by Carrie Underwood");
      finalPlaylist.add("Blown Away by Carrie Underwood");
      finalPlaylist.add("Before He Cheats by Carrie Underwood");
      finalPlaylist.add("Church Bells by Carrie Underwood");
    }
    if(info.artistOne.equals("Blake Shelton") || info.artistTwo.equals("Blake Shelton")) {
      finalPlaylist.add("God's Country by Blake Shelton");
      finalPlaylist.add("Minimum Wage by Blake Shelton");
      finalPlaylist.add("Boys 'Round Here by Blake Shelton");
      finalPlaylist.add("Sangria by Blake Shelton");
    }
    if(info.artistOne.equals("Tim McGraw") || info.artistTwo.equals("Tim McGraw")) {
      finalPlaylist.add("Live Like You Were Dying by Tim McGraw");
      finalPlaylist.add("Just To See You Smile by Tim McGraw");
      finalPlaylist.add("Humble and Kind by Tim McGraw");
      finalPlaylist.add("Something Like That by Tim McGraw");
    }
    if(info.artistOne.equals("Morgan Wallen") || info.artistTwo.equals("Morgan Wallen")) {
      finalPlaylist.add("More Than My Hometown by Morgan Wallen");
      finalPlaylist.add("865 by Morgan Wallen");
      finalPlaylist.add("7 Summers by Morgan Wallen");
      finalPlaylist.add("Whiskey Glasses by Morgan Wallen");
    }
    if(info.artistOne.equals("Dolly Parton") || info.artistTwo.equals("Dolly Parton")) {
      finalPlaylist.add("9 to 5 by Dolly Parton");
      finalPlaylist.add("Jolene by Dolly Parton");
      finalPlaylist.add("Here You Come Again by Dolly Parton");
      finalPlaylist.add("Islands In The Stream by Dolly Parton");
    }
    if(info.artistOne.equals("Drake") || info.artistTwo.equals("Drake")) {
      finalPlaylist.add("Jungle by Drake");
      finalPlaylist.add("Hotline Bling by Drake");
      finalPlaylist.add("The Motto by Drake");
      finalPlaylist.add("Right Hand by Drake");
    }
    if(info.artistOne.equals("Kanye West") || info.artistTwo.equals("Kanye West")) {
      finalPlaylist.add("Violent Crimes by Kanye West");
      finalPlaylist.add("Homecoming by Kanye West");
      finalPlaylist.add("Gold Digger by Kanye West");
      finalPlaylist.add("Runaway by Kanye West");
    }
    if(info.artistOne.equals("Nicki Minaj") || info.artistTwo.equals("Nicki Minaj")) {
      finalPlaylist.add("Starships by Nicki Minaj");
      finalPlaylist.add("Bed of Lies by Nicki Minaj");
      finalPlaylist.add("Super Bass by Nicki Minaj");
      finalPlaylist.add("Tusa by Nicki Minaj");
    }
    if(info.artistOne.equals("J. Cole") || info.artistTwo.equals("J. Cole")) {
      finalPlaylist.add("Crooked Smile by J. Cole");
      finalPlaylist.add("Work Out by J. Cole");
      finalPlaylist.add("MIDDLE CHILD by J. Cole");
      finalPlaylist.add("Love Yourz by J. Cole");
    }
    if(info.artistOne.equals("Cardi  B.") || info.artistTwo.equals("Cardi B.")) {
      finalPlaylist.add("Up by Cardi  B.");
      finalPlaylist.add("I Like It by Cardi  B.");
      finalPlaylist.add("Bodak Yellow by Cardi  B.");
      finalPlaylist.add("Be Careful by Cardi  B.");
    }
    if(info.artistOne.equals("Johann Sebastian Bach") || info.artistTwo.equals("Johann Sebastian Bach")) {
      finalPlaylist.add("Cello Suite No. 1 in G Major, BWV 1007: I. Prelude by Johann Sebastian Bach");
      finalPlaylist.add("Goldberg Variations, BWV 988: Aria by Johann Sebastian Bach");
      finalPlaylist.add("The Well-Tempered Clavier: Book 1, BWV 846-869: 1. Prelude in C Major, "
          + "BWV 846 by Johann Sebastian Bach");
      finalPlaylist.add("Toccata and Fugue in D minor by Johann Sebastian Bach");
    }
    if(info.artistOne.equals("Wolfgang Amadeus Mozart") || info.artistTwo.equals("Wolfgang Amadeus Mozart")) {
      finalPlaylist.add("Piano Concerto No. 21 in C Major, K. 467: II. Andante by Wolfgang "
          + "Amadeus Mozart");
      finalPlaylist.add("Fanatasia in D  Minor, K. 397 by Wolfgang Amadeus Mozart");
      finalPlaylist.add("Requiem, K. 626: Lacrimosa by Wolfgang Amadeus Mozart");
      finalPlaylist.add("Piano Sonata No. 16 in C Major, K. 545 'Sonata facile':1. Allegro"
          + " by Wolfgang Amadeus Mozart");
    }
    if(info.artistOne.equals("Ludwig van Beethoven") || info.artistTwo.equals("Ludwig van Beethoven")) {
      finalPlaylist.add("Sonata No. 14 'Moonlight' in C-Sharp Minor, Op. 27 No. 2: I. Adagio "
          + "sostenuto by Ludwig van Beethoven");
      finalPlaylist.add("Bagatelle No. 25 in A Minor, 'Fur Elise' WoO 59 by Ludwig van Beethoven");
      finalPlaylist.add("Symphony No. 5 in C Minor, Op. 67: I. Allegro con brio by "
          + "Ludwig van Beethoven");
      finalPlaylist.add("Rage Over A Lost Penny, Op. 129 by Ludwig van Beethoven");
    }
    if(info.artistOne.equals("Frederic Chopin") || info.artistTwo.equals("Frederic Chopin")) {
      finalPlaylist.add("Nocturne No. 20 in C-Sharp Minor, Op. Posth. by Frederic Chopin");
      finalPlaylist.add("Nocturne No. 2 in E-Flat Major, Op. 9 No. 2 by Frederic Chopin");
      finalPlaylist.add("Nocturne No. 1 in B Flat Minor, Op.9 No.1 by Frederic Chopin");
      finalPlaylist.add("Waltz in A Minor, Op. Posth., B. 150 by Frederic Chopin");
    }
    if(info.artistOne.equals("Claude Debussy") || info.artistTwo.equals("Claude Debussy")) {
      finalPlaylist.add("Clair de Lune, L. 32 by Claude Debussy");
      finalPlaylist.add("Reverie by Claude Debussy");
      finalPlaylist.add("2 Arabesques, L. 66: No. 1 in E Major by Claude Debussy");
      finalPlaylist.add("Symphony in B Minor: II. Un poco lento, cantabile by Claude Debussy");
    }
    if(info.artistOne.equals("Al Green") || info.artistTwo.equals("Al Green")) {
      finalPlaylist.add("Let's Stay Together by Al Green");
      finalPlaylist.add("Tired of Being Alone by Al Green");
      finalPlaylist.add("Love and Happiness by Al Green");
      finalPlaylist.add("Take Me to the River by Al Green");
    }
    if(info.artistOne.equals("Aretha Franklin") || info.artistTwo.equals("Aretha Franklin")) {
      finalPlaylist.add("I Say a Little Prayer by Aretha Franklin");
      finalPlaylist.add("Respect by Aretha Franklin");
      finalPlaylist.add("Think by Aretha Franklin");
      finalPlaylist.add("Chain of Fools by Aretha Franklin");
    }
    if(info.artistOne.equals("Stevie Wonder") || info.artistTwo.equals("Stevie Wonder")) {
      finalPlaylist.add("Superstition by Stevie Wonder");
      finalPlaylist.add("For Once In My Life by Stevie Wonder");
      finalPlaylist.add("I Just Called To Say I Love You by Stevie Wonder");
      finalPlaylist.add("Sir Duke by Stevie Wonder");
    }
    if(info.artistOne.equals("Marvin Gaye") || info.artistTwo.equals("Marvin Gaye")) {
      finalPlaylist.add("Sexual Healing by Marvin Gaye");
      finalPlaylist.add("Let's Get It On by Marvin Gaye");
      finalPlaylist.add("I Heard It Through The Grapevine by Marvin Gaye");
      finalPlaylist.add("Ain't No Mountain High Enough by Marvin Gaye");
    }
    if(info.artistOne.equals("The Temptations") || info.artistTwo.equals("The Temptations")) {
      finalPlaylist.add("My Girl by The Temptations");
      finalPlaylist.add("Ain't Too Proud To Bag by The Temptations");
      finalPlaylist.add("Get Ready by The Temptations");
      finalPlaylist.add("Papa Was A Rollin' Stone by The Temptations");
    }
    String[] output = finalPlaylist.toArray();
  }
  
  public static void main(String[] args) {
    Playlist newJamz = buildPlaylist();
    listPlaylist(newJamz);
  }

}
