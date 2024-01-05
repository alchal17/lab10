package org.example.part2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Flower {
    private double sepalLength;
    private Color color;
    private double price;
}
