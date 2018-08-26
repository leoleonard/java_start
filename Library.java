class Library {
    public static void main(String args[]) {
        final String appName = "Bibilioteka v0.2";
        Book book1 = new Book();
        book1.title = "W pustyni i puszczy";
        book1.author = "Henryk Sienkiewicz";
        book1.releaseDate = 2012;
        book1.pages = 996;
        book1.publisher = "Zak";
        book1.isbn = "124578";

        System.out.println(appName);
		System.out.println("Książki dostępne w bibliotece:");
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.releaseDate);
		System.out.println(book1.pages);
    }
}