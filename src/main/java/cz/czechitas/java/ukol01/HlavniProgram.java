package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {

    private Turtle zofka;

    public void start() {
        nakresliPrase();
        nakresliDomecek(650, 400);

        nakresliDomecek(650, 280);
        nakresliDomecek(550, 280);
        nakresliDomecek(450, 280);
        nakresliDomecek(350, 280);
        nakresliDomecek(250, 280);

        nakresliDomecek(250, 400);
        nakresliSlunce();

        nakresliJmeno();
    }

    public void nakresliSlunce() {
        Turtle zofka = new Turtle();
        zofka.setLocation(300,100);
        zofka.penDown();

        for (int i = 0; i < 180; i++) {
            zofka.move(1);
            if (i % 18 == 0) {
                zofka.turnLeft(90);
                zofka.move(20);
                zofka.turnLeft(180);
                zofka.penUp();
                zofka.move(20);
                zofka.penDown();
                zofka.turnLeft(90);
            }
            zofka.turnRight(2);
        }
        zofka.penUp();
        zofka.setLocation(-450,-400);
    }


    public void nakresliPrase() {
        Turtle zofka = new Turtle();
        zofka.setLocation(450,400);
        obdelnik(40,60, zofka);
        nakresliTrojuhelnik(40, zofka);
        nakresliParNohou(20, zofka);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnLeft(90);
        nakresliParNohou(20, zofka);
        zofka.setLocation(-450,-400);
    }

    public void nakresliDomecek(double polohaX, double polohaY) {
        Turtle zofka = new Turtle();
        zofka.setLocation(polohaX,polohaY);
        obdelnik(60,40, zofka);
        zofka.move(60);
        zofka.turnRight(90);
        nakresliTrojuhelnik(40, zofka);
        zofka.setLocation(-polohaX,-polohaY);
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

    public void nakresliJmeno() {
        Turtle zofka = new Turtle();
        zofka.setLocation(350,500);
        zofka.setPenWidth(5);
        nakresliA(zofka, 35);
        zofka.setLocation(400,500);
        nakresliD(zofka, 30);
        zofka.setLocation(450,500);
        nakresliE(zofka, 30);
        zofka.setLocation(500,500);
        nakresliL(zofka, 30);
        zofka.setLocation(550,500);
        nakresliA(zofka, 35);
        zofka.setLocation(-550,-500);
    }

    public void nakresliL(Turtle zofka, double velikostPisma) {
        zofka.penDown();
        zofka.move(velikostPisma);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(velikostPisma);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(velikostPisma/2 + velikostPisma/3);
        zofka.penUp();
        zofka.turnLeft(90);
    }
    public void nakresliE(Turtle zofka, double velikostPisma) {
        zofka.penDown();
        zofka.move(velikostPisma);
        zofka.turnRight(90);
        zofka.move(velikostPisma/2);
        zofka.penUp();
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(180);
            zofka.move(velikostPisma/2);
            zofka.turnLeft(90);
            zofka.move(velikostPisma/2);
            zofka.turnLeft(90);
            zofka.penDown();
            zofka.move(velikostPisma/2);
        }

        zofka.penUp();
        zofka.turnLeft(90);
    }
    public void nakresliD(Turtle zofka, double velikostPisma) {
        zofka.penDown();
        zofka.move(velikostPisma);
        zofka.turnRight(60);
        for (int i = 0; i < 120; i++) {
            zofka.move(0.6);
            zofka.turnRight(2);
        }
        zofka.penUp();
        zofka.turnRight(60);

        zofka.turnRight(90);
        zofka.move(velikostPisma + 10);
        zofka.turnLeft(90);
    }
    public void nakresliA(Turtle zofka, double velikostPisma) {
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(velikostPisma);
        zofka.turnRight(120);
        zofka.move(velikostPisma);

        zofka.turnRight(180);
        zofka.move(velikostPisma/3);
        zofka.turnLeft(60);
        zofka.move(velikostPisma/1.5);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(velikostPisma/1.5);
        zofka.turnRight(60);
        zofka.move(velikostPisma/3);
        zofka.turnLeft(150);
    }

    public void nakresliTrojuhelnik(double delkaStrany, Turtle zofka) {
        for (int i = 0; i < 3; i++) {
            zofka.penDown();
            zofka.move(delkaStrany);
            zofka.turnLeft(120);
        }
    }

    public void obrazce() {
        osmiuhelnik(40);
        nakresliKolo();
        nakresliSlunce();
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

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
