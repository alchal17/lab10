package org.example.part2;

public class RibbonDecorator extends ItemDecorator{
    private Item item;

    public RibbonDecorator(Item item) {
        super(item.getDescription());
        this.item = item;
    }

    public double getPrice() {
        return 40 + item.price();
    }

    @Override
    double price() {
        return item.price();
    }
}
