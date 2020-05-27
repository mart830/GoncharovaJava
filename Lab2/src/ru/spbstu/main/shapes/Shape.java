package ru.spbstu.main.shapes;

public interface Shape extends Point {

    float getArea();

    String getName();

    default int getRotation() {
        return 0;
    }
}
