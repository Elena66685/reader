import java.util.Arrays;

class Book {
    String author;
    String name;
    Book (String str, String r) {
        author = str;
        name = r;
    }
    long[] print() {
        System.out.println("Книга: " + name + ", автор: " + author + ".");
        return new long[0];
    }
    void takeBook (Book... obj) {
        for (int i = 0; i < obj.length; i++) System.out.println(Arrays.toString(obj[i].print()));

    }
}