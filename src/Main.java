import algorithms.SelectionSortProduct;
import algorithms.SortProduct;
import model.Product;

public class Main {
    public static void main(String[] args) {
        SortProduct sortProduct = new SelectionSortProduct();
        Product[] products = getProdutos();

        sortProduct.order(products, products.length);

        printProducts(products);
    }

    private static void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println("Produto " + product.getName());
            System.out.println("Valor " + product.getValue());
            System.out.println("-----");
        }
    }


    private static Product[] getProdutos() {
        Product[] products = {
                new Product("Lamborghini", 1000000d),
                new Product("Fox", 45000d),
                new Product("Fusca", 15000d),
                new Product("Hb20", 62000d),
                new Product("Brasilia", 17000d)
        };

        return products;
    }
}