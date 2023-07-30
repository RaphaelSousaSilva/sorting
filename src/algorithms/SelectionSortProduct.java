package algorithms;

import helpers.ProductHandler;
import model.Product;

public class SelectionSortProduct implements SortProduct {

    @Override
    public Product[] order(Product[] products, Integer size) {
        for (int current = 0; current < size - 1; current++) {
            int cheapestPosition = cheapestProductPosition(products, current, size);

            ProductHandler.changePosition(products, current, cheapestPosition);
        }
        return products;
    }

    private int cheapestProductPosition(Product[] products, int begining, int end) {
        int cheapest = begining;
        for (int current = begining; current < end; current++) {
            if (products[current].getValue() < products[cheapest].getValue()) {
                cheapest = current;
            }
        }
        return cheapest;
    }
}
