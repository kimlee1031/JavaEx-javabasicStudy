package ch7v2;

public class Ex7_17 {

}


abstract class Unit {
    int x, y;

    abstract void move(int x, int y);
    void stop() {
    }
}


class Marine extends Unit {
    void move(int x, int y) {

    }
    void stimPack() {
    }
}

class Tank {
    void move(int x, int y) {

    }
    void changeMode() {
    }
}

class DropShip {
    void move(int x, int y) {

    }
    void load() {
    }

    void unload() {
    }
}