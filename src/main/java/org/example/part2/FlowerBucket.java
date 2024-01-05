package org.example.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerBucket extends Item {
    private List<Flower> flowers = new ArrayList<>();

    public FlowerBucket(String description) {
        super(description);
    }

    @Override
    double price() {
        double result = 0;
        for (Flower flower: this.flowers){
            result += flower.getPrice();
        };
        return result;
    }

    public void addFlowers(Flower... flowers){
        this.flowers.addAll(Arrays.stream(flowers).toList());
    }
    public List<Flower> searchFlower(double sepalLength){
        return flowers.stream().filter(flower -> flower.getSepalLength() == sepalLength).toList();
    }
    public List<Flower> searchFlower(Color color){
        return flowers.stream().filter(flower -> flower.getColor() == color).toList();
    }
}
