public abstract class Title {
    private String title;
    private String literatureType;

    protected int copies;
    protected double rate;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    double calculateRoyalty(){
        return 0;
    }

    public String getLiteratureType(){
        return literatureType;
    }

    public String toString(){
        return this.title;
    }

    abstract double calculatePoints();

    abstract double calculateLiteraturePoints();
}
