package org.example.part2;

public class BasketDecorator extends ItemDecorator {
    private Item item;

    public BasketDecorator(Item item) {
        super(item.getDescription());
        this.item = item;
    }

    public double getPrice() {
        return 4 + item.price();
    }

    @Override
    double price() {
        return item.price();
    }
}
