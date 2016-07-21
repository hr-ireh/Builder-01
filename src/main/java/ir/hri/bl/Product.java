package ir.hri.bl;

public class Product {
    private String name;
    private String screen;
    private String os;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", screen='" + screen + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}