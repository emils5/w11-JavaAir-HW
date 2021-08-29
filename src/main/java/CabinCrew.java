public class CabinCrew extends Human{
    private Rank rank;

    public CabinCrew(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public String messageToPassengers(String message){
        return message;
    }
}
