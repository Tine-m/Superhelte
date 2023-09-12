public class Superhero {

    private String name;
    private String superPower;
    private String realName;
    private int yearCreated;
    private boolean isHuman;
    private double strength;

    public Superhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, double strength) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getRealName() {
        return realName;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public double getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }


    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
}
