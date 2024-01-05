package org.example.part1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AbstractDecorator implements TestInterface{
    protected FirstClass firstClass;

    @Override
    public void method1(){
        firstClass.method1();
    }
}
