package ir.hri.bl;

public class Director {
    public void construct(IBuilder builder) {
        builder.BuildScreen();
        builder.BuildOS();
    }
}
