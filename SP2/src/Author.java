import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<Title>();

    public Author(String name){
        this.name = name;
    }

    void addTitle(Title title){
        this.titles.add(title);
    }

    float calculateTotalPay(){
        double totalPoints = 0;
        double payRate = 0.067574;
        for(Title s : titles){
            totalPoints += s.calculatePoints();
        }
        double payout = totalPoints*payRate;
        return (float)payout;
    }

    public String toString(){
        return this.name;
    }

    public void getTitles(){
        for(Title s : titles){
            System.out.println(s);
        }
    }
}
