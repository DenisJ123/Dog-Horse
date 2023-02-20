package productv5;

public class Horse extends Animal{

    private String dam;
    private String sire;
    private int height;


    public Horse() {
        super();
        dam = "";
        sire = "";
        height = 0;

    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public int getHeight(int i) {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "dam='" + dam + '\'' +
                ", sire='" + sire + '\'' +
                ", height='" + height + '\'' +
                '/';
    }

    {

    }
}
