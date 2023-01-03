import java.io.PrintStream;

public class Main{






    public static void main(String[] args) {
        System.out.println("Дз. Объекты и классы");

        System.out.println();
        System.out.println("Моя личная Библиотека");
        System.out.println();

        Author author1 = new Author("Харуки ", "", "Мураками");
        Book book1 = new Book("Хроники заводной птицы ", 1992, author1);
        book1.setYear(1995);
        System.out.println("Автор - " + author1.getName() + author1.getPatronymic() + author1.getSurname());
        System.out.println("Название книги - " + book1.getTitle() + ";" + "Год издания - " + book1.getYear());
        System.out.println();
        System.out.println("==============================================");
        System.out.println();
        Author author2 = new Author("Габриэля ","Гарсиа ","Маркеса");
        Book book2 = new Book("100 лет одиночества", 1967, author2);
        System.out.println("Автор - " + author2.getName() + author2.getPatronymic() + author2.getSurname());
        System.out.println("Название книги - " + book2.getTitle() + ";" + "Год издания - " + book2.getYear());

    }

}