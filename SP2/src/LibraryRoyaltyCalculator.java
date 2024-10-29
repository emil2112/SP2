public class LibraryRoyaltyCalculator {

    public static void main(String[] args){

        Author author1 = new Author("Geo J. J. Martinsen");
        Author author2 = new Author("Sussi Padler Mogensen");
        PrintedBook book1 = new PrintedBook("En sang om regn og slud", "SKØN", 500, 1200);
        PrintedBook book2 = new PrintedBook("Mogens Myrebuks", "BI", 1000, 45);
        PrintedBook book3 = new PrintedBook("Journal 69", "SKØN", 1500, 565);
        PrintedBook book4 = new PrintedBook("Afdeling Z", "TE", 500, 48);
        AudioBook audiobook1 = new AudioBook("Martin Effekten", "FAG", 500, 300);
        AudioBook audiobook2 = new AudioBook("Neurofysiologi: Lås op for din hjerne", "FAG", 300, 720);

        author1.addTitle(book1);
        author1.addTitle(book2);
        author1.addTitle(audiobook2);

        author2.addTitle(book3);
        author2.addTitle(book4);
        author2.addTitle(audiobook1);

        System.out.println();
        System.out.println(author1+", med følgende titler:");
        author1.getTitles();
        System.out.println("Tjener = "+ author1.calculateTotalPay()+ " kr.");
        System.out.println();
        System.out.println(author2);
        author2.getTitles();
        System.out.println("Tjener = "+ author2.calculateTotalPay()+ " kr.");
    }
}
