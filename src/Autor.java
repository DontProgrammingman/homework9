//10 ДЗ
import java.util.Objects;

public class Autor {
    String firstName;
    String secondName;

    public Autor(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.secondName;
    }
    public boolean equals(Autor other){
        if(this.secondName == other.secondName && this.firstName == other.firstName){
            return true;
        }
        return false;
    }
   @Override
    public int hashCode(){
        return Objects.hash(this.firstName + this.secondName);
    }
}
