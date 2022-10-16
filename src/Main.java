public class Main {
    public static void main(String[] args) {
        System.out.println("1.10. Методы объектов");
        Author  georgeMartin = new Author("George","Martin");
        Author levTolstoy = new Author("Лев","Толстой");
        Book theStand = new Book("A Game of Thrones", georgeMartin, 1996);
        System.out.println(theStand);

    }

}