package org.example.part2;

import lombok.AllArgsConstructor;

public class PaperDecorator extends ItemDecorator {
    private Item item;

    public PaperDecorator(Item item) {
        super(item.getDescription());
        this.item = item;
    }

    public double getPrice() {
        return 13 + item.price();
    }

    @Override
    double price() {
        return item.price();
    }
}
