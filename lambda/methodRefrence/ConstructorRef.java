package lambda.methodRefrence;

public class ConstructorRef {
    
    public static void main(String[] args) {
        
        ProductInterface productInterface = (name, price) -> new Product(name,price);
        System.out.println(productInterface.getProduct("Mac",20000));

        ProductInterface constructorRef = Product::new;
        System.out.println(constructorRef.getProduct("Apple", 100000));
    }
}

