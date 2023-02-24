package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {

    private Turtle zofka;

    public void start() {
//        Turtle zofka = new Turtle();

        nakresliPrase();
    }

    public void nakresliPrase() {
        Turtle zofka = new Turtle();
        obdelnik(80,120, zofka);
        nakresliTrojuhelnik(80, zofka);
        nakresliParNohou(40, zofka);
        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnLeft(90);
        nakresliParNohou(40, zofka);
    }

    public void ctverec(double delkaStrany, Turtle zofka) {
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    public void obdelnik(double delkaStranyX, double delkaStranyY,Turtle zofka) {
        zofka.penDown();

        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyX);
            zofka.turnRight(90);
            zofka.move(delkaStranyY);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    public void nakresliParNohou(double delkaNohy, Turtle zofka) {
        zofka.turnRight(45);
        zofka.penDown();
        zofka.turnRight(180);
        zofka.move(delkaNohy);
        zofka.turnRight(180);
        zofka.move(delkaNohy);
        zofka.turnRight(90);
        zofka.move(delkaNohy);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(delkaNohy);
        zofka.turnRight(45);
    }

    public void nakresliTrojuhelnik(double delkaStrany, Turtle zofka) {
        for (int i = 0; i < 3; i++) {
            zofka.penDown();
            zofka.move(delkaStrany);
            zofka.turnLeft(120);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
