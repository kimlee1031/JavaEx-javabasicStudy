package ch7;

public class Ex7_17 {

}

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);
    void stop(){/*현재 위치에 정지*/}
}

class Marine extends Unit {
     void stimPack(){/*스팀팩 사용*/}

    void move(int x, int y){/*지정된 위치로 이동*/}
}

class Tank extends Unit {
    void changeMode(){/*공격모드 전환*/}
    void move(int x, int y){/*지정된 위치로 이동*/}
}

class Dropship extends Unit {
    void move(int x, int y){/*지정된 위치로 이동*/}
    void load(){/*선택된 대상을 태운다.*/}
    void unload(){/*선택된 대상을 내린다.*/}
}
