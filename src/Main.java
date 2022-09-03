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
    }
}