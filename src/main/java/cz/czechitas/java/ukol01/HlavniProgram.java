package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

  }
    //TODO implementace domácího úkolu
  public void posunZelvu() {
    zofka.penUp();
    zofka.move(100);
    zofka.penDown();
    }

  public void nakresliCtverec(){
    for (int i = 0; i < 4; i++) {
      zofka.move(100);
      zofka.turnRight(90);
    }
  }

}
