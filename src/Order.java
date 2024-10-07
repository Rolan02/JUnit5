import java.util.ArrayList;
import java.util.List;

public class Order implements ICart {

    private final List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public int quantity() {
        return this.products.size();
    }

    @Override
    public int total() {
        return this.products.stream()
                .map(Product::price)
                .reduce(0,Integer::sum);
    }

    @Override
    public void empty() {
        this.products.clear();
    }
}
