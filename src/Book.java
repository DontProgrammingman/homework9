public class Book {
    String name;
    Autor autor;
    int yearRelease;

    public Book(String name, Autor autor, int yearRelease){
        this.name = name;
        this.autor = autor;
        this.yearRelease = yearRelease;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease){
        this.yearRelease = yearRelease;
    }
}
