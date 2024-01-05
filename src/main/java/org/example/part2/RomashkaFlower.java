package org.example.part2;

public class RomashkaFlower extends Item{
    public RomashkaFlower(String description) {
        super(description);
    }

    @Override
    double price() {
        return 15;
    }
}
