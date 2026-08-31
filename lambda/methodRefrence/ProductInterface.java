package lambda.methodRefrence;

@FunctionalInterface
public interface ProductInterface {
    
    Product getProduct(String name, int price);
}
