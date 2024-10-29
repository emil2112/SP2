public class AudioBook extends Title{
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
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
            literaturePoints = 1.5;
        }else if(type.equals("LYRIK")){
            literaturePoints = 3;
        }else if(type.equals("SKØN")){
            literaturePoints = 0.85;
        }else if(type.equals("FAG")){
            literaturePoints = 0.5;
        }else{
            literaturePoints = 0;
        }
        return literaturePoints*(this.durationInMinutes*0.5);
    }
}
