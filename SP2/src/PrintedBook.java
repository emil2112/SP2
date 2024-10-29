public class PrintedBook extends Title{
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    double calculatePoints() {
        double totalPoints = this.calculateLiteraturePoints();
        return totalPoints*this.copies;
    }

    @Override
    double calculateLiteraturePoints() {
        double literaturePoints;
        String type = getLiteratureType();

        if(type.equals("BI")||type.equals("TE")){
            literaturePoints = 3;
        }else if(type.equals("LYRIK")){
            literaturePoints = 6;
        }else if(type.equals("SKØN")){
            literaturePoints = 1.7;
        }else if(type.equals("FAG")){
            literaturePoints = 1;
        }else{
            literaturePoints = 0;
        }
        return literaturePoints*this.pages;
    }

}
