package ie.atu.productv4;

public class Tv extends Product {

    private String manufacture;
    private String screenSize;


    public Tv() {
        super();
        manufacture = "";
        screenSize = "";
        count++;
    }

    public void setmanufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    public void setscreenSize(String screenSize) {
        this.screenSize = screenSize;
    }


    public String getmanufacture() {
        return manufacture;
    }
    public String getScreenSize() {
        return screenSize;
    }


    @Override
    public String toString() {
        return super.toString() + " Manufactured by " + manufacture + " "+screenSize;
    }
}
