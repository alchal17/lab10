package org.example.part2;

public class CactusFlower extends Item{
    public CactusFlower(String description) {
        super(description);
    }

    @Override
    double price() {
        return 10;
    }
}
