package chapter8.book;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }


    private void extend() {
        Book[] newArray = new Book[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                found = true;
                System.out.println(book);
            }
        }
        if (!found) {
            System.out.println("book with " + keyword + " does not exists");
        }
    }
}
