import java.util.Arrays;
class Reader {
    String name;
    //String surname;
    int number;
    String faculty;
    String date;
    String telephone;

    Reader (String i, int j, String r, String n, String m) {
        name = i;
        number = j;
        faculty = r;
        date = n;
        telephone = m;
    }

    void print () {
        System.out.println(name + "***номер читательского билета - " + number);
        System.out.println("Факультет - " + faculty);
        System.out.println("Дата рождения - " + date);
        System.out.println("Телефон - " + telephone);
        System.out.println();
    }
    void takeBook(int x) {
        if (x == 1){
            System.out.println(name + " взял(а) " + x + " книгу.");
        }
        else if (x > 1 && x < 5) {
            System.out.println(name + " взял(a) " + x + " книги.");
        }
        else if (x > 4) {
            System.out.println(name + " взял(a) " + x + " книг.");
        }
    }

    void takeBook (String... str) {
        if (str.length == 1) {
            System.out.println(name + " взял книгу: " + Arrays.toString(str) + ".");
        }
        else {
            System.out.println(name + " взял книги: " + Arrays.toString(str) + ".");
        }
    }

    void returnBook (String... str) {
        if (str.length == 1) {
            System.out.println(name + " вернул книгу: " + Arrays.toString(str) + ".");
        }
        else {
            System.out.println(name + " вернул книги: " + Arrays.toString(str) + ".");
        }
    }

    void returnBook(int x) {
        if (x == 1){
            System.out.println(name + " вернул(а) " + x + " книгу.");
        }
        else if (x > 1 && x < 5) {
            System.out.println(name + " вернул(a) " + x + " книги.");
        }
        else if (x > 4) {
            System.out.println(name + " вернул(a) " + x + " книг.");
        }
    }

}