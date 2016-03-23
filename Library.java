import java.util.HashMap;

public class Library {

  public Library() {

  }

  public void getFinishedBooks(HashMap<String, Boolean> library) {
    if (library.size() < 1) {
      System.err.println("HashMap is empty, please check!");
    } else {
      for (String key : library.keySet()) {
        if (library.get(key) == true) {
          System.out.println(String.format("You have read %s", key));
        }
      }
    }
  }

  public static void main(String[] args) {
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("Timeln", true);
    myBooks.put("3D Food Printing", false);

    Library myLibrary = new Library();
    myLibrary.getFinishedBooks(myBooks);

  }
}