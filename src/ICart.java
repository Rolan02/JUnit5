public interface ICart {

    void addProduct(Product product);
    int quantity();
    int total();
    void empty();
}
