import algorithms.SelectionSortProduct;
import algorithms.SortProduct;
import model.Product;

public class MainProducts {
    public static void main(String[] args) {
        SortProduct sortProduct = new SelectionSortProduct();
        Product[] products = getProdutos();

        sortProduct.order(products, products.length);

        printProducts(products);
    }

    private static void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println("Product " + product.getName());
            System.out.println("Price " + product.getValue());
            System.out.println("-----");
        }
    }


    private static Product[] getProdutos() {
        Product[] products = {
                new Product("Lamborghini", 1000000d),
                new Product("Fusion", 45000d),
                new Product("Crv", 15000d),
                new Product("Corolla", 62000d),
                new Product("Elantra", 17000d)
        };

        return products;
    }
}