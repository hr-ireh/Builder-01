package ir.hri.bl;

public class ConCreteBuilder1 implements IBuilder {
    Product product;

    public ConCreteBuilder1() {
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
