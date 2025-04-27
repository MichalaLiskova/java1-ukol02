package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        Color cervenaBarva;
        cervenaBarva = new Color(255, 0, 0);
        zofka.setSpeed(1000);
        zofka.setLocation(100, 110);
        // nakresliRovnostrannyTrojuhelnik(70, Color.BLACK);
        //nakresliRovnoramennyTrojuhelnik(50);
        // nakresliCtverec(80);
        //nakresliObdelnik(70,50);
        nakresliZmrzlinu();
        zofka.setLocation(150, 320);
        zofka.turnRight(270);
        nakresliSnehulaka();
        zofka.turnLeft(90);
        zofka.setLocation(400, 900);
        nakresliMasinku();


    }

    private void nakresliMasinku() {
        nakresliObdelnik(200, 150);
        nakresliKolecko(20, Color.black);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.penDown();
        //telo masinky
        nakresliObdelnik(250, 100);
        zofka.penUp();
        zofka.move(80);
        zofka.turnRight(180);
        zofka.penDown();
        //kola masinky
        nakresliKolecko(9, Color.black);
        zofka.penUp();
        zofka.move(-110);
        zofka.penDown();
        nakresliKolecko(9, Color.black);
        // presun na zacatek masinky
        zofka.penUp();
        zofka.move(-60);
        zofka.turnLeft(90);
        zofka.move(-40);
        //  zofka.turnLeft(180);
        zofka.penDown();
        nakresliRovnoramennyTrojuhelnik(120);
    }

    private void nakresliSnehulaka() {
        nakresliKolecko(12, Color.yellow);
        zofka.penUp();
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(15);
            zofka.move(-12);
        }
        zofka.penDown();
        zofka.turnLeft(180);
        nakresliKolecko(20, Color.yellow);
        zofka.penUp();
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(15);
            zofka.move(-20);
        }
        zofka.penDown();
        zofka.turnLeft(180);
        nakresliKolecko(6, Color.yellow);
        zofka.penUp();
        for (int i = 0; i < 12; i++) {
            zofka.turnLeft(15);
            zofka.move(20);
        }
        zofka.penDown();
        nakresliKolecko(6, Color.yellow);
        zofka.penUp();
        for (int i = 0; i < 6; i++) {
            zofka.move(-20);
            zofka.turnRight(15);
        }
        zofka.penDown();
        nakresliKolecko(25, Color.yellow);
    }

    private void nakresliZmrzlinu() {
        nakresliKolecko(20, Color.magenta);
        zofka.turnRight(90);
        nakresliRovnostrannyTrojuhelnik(150, Color.DARK_GRAY);
    }

    public void nakresliRovnostrannyTrojuhelnik(double delkaStrany, Color barvaCary) {
        Color staraBarva = zofka.getPenColor();
        zofka.setPenColor(barvaCary);
        zofka.setPenColor(barvaCary);
        zofka.move(delkaStrany);
        zofka.turnRight(120.0);
        zofka.move(delkaStrany);
        zofka.turnRight(120.0);
        zofka.move(delkaStrany);
        zofka.turnRight(120.0);
        zofka.setPenColor(staraBarva);
    }

    public void nakresliRovnoramennyTrojuhelnik(double velikostStrany) {
        var velikostPrepony = Math.sqrt(2 * Math.pow(velikostStrany, 2));
        zofka.move(velikostStrany);
        zofka.turnLeft(135);
        zofka.move(velikostPrepony);
        zofka.turnLeft(135);
        zofka.move(velikostStrany);
        /*zofka.turnRight(45);
        zofka.move(velikostPrepony);
        zofka.turnRight(45.0);
        zofka.move(velikostStrany);
        zofka.turnRight(90);*/
    }

    public void nakresliCtverec(double velikostStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(90);

        }
    }

    public void nakresliObdelnik(double velikostA, double velikostB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostA);
            zofka.turnRight(90);
            zofka.move(velikostB);
            zofka.turnRight(90);

        }
    }

    public void nakresliKolecko(double velikostKolecka, Color barvaKolecka) {
        Color staraBarva = zofka.getPenColor();
        zofka.setPenColor(barvaKolecka);
        for (int j = 0; j < 24; j++) {
            zofka.move(velikostKolecka);
            zofka.turnRight(15);
        }
        zofka.setPenColor(staraBarva);
    }

}
