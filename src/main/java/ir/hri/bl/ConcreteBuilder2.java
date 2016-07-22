package ir.hri.bl;

public class ConcreteBuilder2 implements IBuilder {
    Product product;

    public ConcreteBuilder2 () {
        product = new Product("Windows Phone");
    }

    public void BuildScreen() {
        product.setName("Touch Screen 32 Inch.");
    }

    public void BuildOS() {
        product.setOs("Windows Phone 2014");
    }

    public Product getProduct() {
        return product;
    }
}
