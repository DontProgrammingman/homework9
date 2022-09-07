//10 ДЗ
import java.util.Objects;

public class Book {
    private String name;
    private Autor autor;
    private int yearRelease;

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
    @Override
    public String toString(){
        return "Название книги " + this.name + " Автор книги " + autor + " Год выхода " + this.yearRelease;
    }

    public boolean equals(Book other){
        if (this.yearRelease != other.yearRelease){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name);
    }
}
