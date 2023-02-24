package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {

    private Turtle zofka;

    public void start() {
        obrazce();
    }

    public void obrazce() {
        osmiuhelnik(40);
        nakresliKolo();
        nakresliSlunce();
    }

    public void nakresliSlunce() {
        Turtle zofka = new Turtle();
        zofka.setLocation(600,200);
        zofka.penDown();

        for (int i = 0; i < 180; i++) {
            zofka.move(2);
            if (i % 18 == 0) {
                zofka.turnLeft(90);
                zofka.move(30);
                zofka.turnLeft(180);
                zofka.penUp();
                zofka.move(30);
                zofka.penDown();
                zofka.turnLeft(90);
            }
            zofka.turnRight(2);
        }
        zofka.penUp();
    }

    public void nakresliKolo() {
        Turtle zofka = new Turtle();
        zofka.setLocation(300,400);
        zofka.penDown();

        for (int i = 0; i < 180; i++) {
            zofka.move(2);
            zofka.turnRight(2);
        }
        zofka.penUp();
    }

    public void osmiuhelnik(double delkaStrany) {
        Turtle zofka = new Turtle();
        zofka.setLocation(300,200);
        zofka.penDown();

        for (int i = 0; i < 8; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(45);
        }
        zofka.penUp();
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
