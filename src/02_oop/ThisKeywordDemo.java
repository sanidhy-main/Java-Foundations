class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    void printInfo() {
        System.out.println("Title: " + this.title + " has " + this.pages + " pages.");
    }
}

class ThisKeywordDemo {
    public static void main(String[] args) {
        Book b1 = new Book("1984", 328);
        Book b2 = new Book("Dune", 432);

        b1.printInfo();
        b2.printInfo();
    }
}