package helpers;

import model.Product;

public class ProductHandler {

    public static void changePosition(Product[] products, int first, int second) {
        Product firstProduct = products[first];
        Product secondProduct = products[second];

        products[first] = secondProduct;
        products[second] = firstProduct;
    }
}
