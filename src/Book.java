public class Book extends Author {
    private String title;
    private int year;


    public Book(String name, String patronymic, String surname, String title, int year){
        super(name, patronymic, surname);
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }
    public void display(){
        System.out.println("Автор - " + super.getName() + super.getPatronymic() + super.getSurname() +  ";" + " Название книги - " + title + ";" + " Год издания  - " + year);
    }
}

