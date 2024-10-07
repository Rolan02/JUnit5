//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Coco",400);
        Product product2 = new Product("Canela",200);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);
        System.out.println("Total, " + order.quantity());
        System.out.println("Precio, " + order.total());
        order.empty();
        System.out.println("==== Se vacio tu lista de compras =====");
        System.out.println("Total, " + order.quantity());
    }
}