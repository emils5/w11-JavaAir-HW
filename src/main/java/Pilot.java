public class Pilot extends CabinCrew{
    private String licence;

    public Pilot(String name, Rank rank, String licence) {
        super(name, rank);
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }

    public String flyPlane(){
        return "Welcome onboard. Your captain is speaking";
    }
}
