package algorithms;

import helpers.ProductHandler;
import model.Product;

public class InsertionSortProduct implements SortProduct {

    @Override
    public Product[] order(Product[] products, Integer size) {
        for (int current = 1; current <= size - 1; current++) {
            int analysis = current;
            while (analysis > 0 && products[analysis].getValue() < products[analysis - 1].getValue()) {
                ProductHandler.changePosition(products, analysis, analysis - 1);
                analysis--;
            }
        }

        return products;
    }
}
