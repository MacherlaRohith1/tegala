package com.tnsif.first;

public class LocalInstanceDemo {
    int instanceVar = 50;

    public void display() {
        int localVar = 20;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        LocalInstanceDemo obj = new LocalInstanceDemo();
        obj.display();
    }
}
