//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Reader w = new Reader("Елена Писарева", 1, "Компьюторные науки", "11.09.2014",
                           "8902345678");
        Reader n = new Reader("Пётр Ступнев", 2, "Философия",
                           "08.10.2021", "89027654312");
        Reader[] vb = {w, n};
        for (var reader : vb) {
            reader.print();
        }
        //System.out.println(Arrays.toString(vb));
        n.takeBook(10);
        n.takeBook("Лунтик", "Азбука");
        Book v = new Book("Лермонтов", "C++");
        Book z = new Book("Пушкин", "Колобок");
        v.takeBook(v, z);
        n.returnBook("Лунтик", "Азбука");
        n.returnBook(1);
    }


}