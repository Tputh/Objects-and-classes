public class Main{






    public static void main(String[] args) {
        System.out.println("Дз. Объекты и классы");

        Book data0 = new Book("Хроники заводной птицы", 1992);
        System.out.println("Название книги - " + data0.getTitle());
        data0.setYear(1995);
        System.out.println("Год издания - " + data0.getYear() + "г");

        Author name0 =  new Author("Харуки ","" , "Мураками");
        System.out.println("Автор - " + name0.getName() + name0.getPatronymic() + name0.getSurname());

        System.out.println("========================");
        System.out.println("========================");

        Book data1 = new Book("100 лет одиночества", 1967);
        System.out.println("Название книги - " + data1.getTitle());
        System.out.println("Год издания - " + data1.getYear() + "г");


        Author name1 = new Author("Габриэля ","Гарсиа ","Маркеса ");
        System.out.println("Автор - " + name1.getName() + name1.getPatronymic() + name1.getSurname());

    }

}