package ir.hri.bl;

public class ConcreteBuilder1 implements IBuilder {
    Product product;
 
    public ConcreteBuilder1() {
        product = new Product("Android Cell Phone");
    }

    public void BuildScreen() {
        product.setName("Touch Screen 16 Inch.");
    }

    public void BuildOS() {
        product.setOs("Android 4.4");
    }

    public Product getProduct() {
        return product;
    }
}
