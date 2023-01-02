public class Main{






    public static void main(String[] args) {
        System.out.println("Дз. Объекты и классы");

        Author book1 = new Book("Харуки ", "", "Мураками", "Хроники заводной птицы", 1992);
        ((Book) book1).setYear(1995);
        book1.display();
        Author book2 = new Book("Габриэля ","Гарсиа ","Маркеса", "100 лет одиночества", 1967);
        book2.display();

    }

}