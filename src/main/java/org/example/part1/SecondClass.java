package org.example.part1;

public class SecondClass extends AbstractDecorator{
    public SecondClass(FirstClass firstClass) {
        super(firstClass);
    }

    @Override
    public void method1(){
        super.method1();
        System.out.println("method1 wrapper");
    }
}
