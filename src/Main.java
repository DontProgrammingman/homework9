//10 ДЗ
public class Main {
    public static void main(String[] args) {
        Autor autorOne = new Autor("Кэти", "Сьерра");
        Autor autorTwo = new Autor("Шилдт", "Герберт");

        Book bookOne = new Book("Изучаем Java", autorOne, 2012);
        System.out.println("bookOne.getName() = " + bookOne.getName());
        System.out.println("bookOne.getAutor() = " + bookOne.getAutor());
        System.out.println("bookOne.getYearRelease() = " + bookOne.getYearRelease());
        Book bookTwo = new Book("Java. Полное руководство", autorTwo, 2018);
        System.out.println("bookTwo.getName() = " + bookTwo.getName());
        System.out.println("bookTwo.getAutor() = " + bookTwo.getAutor());
        System.out.println("bookTwo.getYearRelease() = " + bookTwo.getYearRelease());
        bookOne.setYearRelease(2019);
        System.out.println("bookOne.getYearRelease() = " + bookOne.getYearRelease());
        System.out.println("bookOne = " + bookOne);
        System.out.println("bookTwo = " + bookTwo);
        boolean isBookOneYear = bookOne.equals(bookTwo);
        if(isBookOneYear){
            System.out.println("Книги вышли в разный год");
        }
        else {
            System.out.println("Книги вышли в один год");
        }
        boolean isBookOneAuthor = autorOne.equals(autorTwo);
        if(isBookOneAuthor){
            System.out.println("Один автор");
        }
        else {
            System.out.println("Разный автор");
        }
        System.out.println("Hash сумма названия книги один " + bookOne.hashCode() + " и автора " + autorOne.hashCode());
    }
}