public class Book  {
    private String title;
    private int publishedYear;
    private Author author;



    public Book ( String title, int publishedYear, Author author){
        this.author = author;
        this.title = title;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.publishedYear;
    }

    public void setYear(int publishedYear){
        this.publishedYear = publishedYear;
    }

    public Author author() {
        return this.author();
    }

}

