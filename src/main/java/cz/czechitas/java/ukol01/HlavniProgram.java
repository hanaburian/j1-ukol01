package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    startZelvu();
    nakresliPaprsek();
    nakresliSlunicko();
    //nakresliOsmihran();
    //nakresliKruh();

    nakresliCtverec();
    nakresliTrojuhelnik();
    posunZelvu();
    //nakresliDomecek();


  }
    //TODO implementace domácího úkolu

  public void startZelvu() {
    zofka.penUp();
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnRight(90);
    zofka.penDown();
  }

  public void posunZelvu() {
    zofka.penUp();
    zofka.move(100);
    zofka.penDown();
  }
  public void nakresliOsmihran(){
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(200);
    zofka.penDown();
    for (int i = 0; i < 8; i++){
      zofka.move(50);
      zofka.turnRight(45);
    }
  }

  public void nakresliKruh(){
    zofka.penUp();
    zofka.move(200);
    zofka.penDown();
    for (int i = 0; i < 360; i++){
      zofka.move(1);
      zofka.turnRight(1);
    }
  }
  public void nakresliCtverec(){
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(300);
    zofka.turnLeft(180);
    zofka.penDown();
    for (int i = 0; i < 4; i++) {
      zofka.move(100);
      zofka.turnRight(90);

    }
  }

  public void nakresliTrojuhelnik() {
    zofka.move(100);
    zofka.turnRight(90);
    for (int i = 0; i < 3; i++){
      zofka.move(100);
      zofka.turnLeft(120);
    }
    zofka.turnLeft(90);
  }

  public void nakresliPaprsek(){
    zofka.turnLeft(90);
    zofka.move(30);
    zofka.turnRight(180);
    zofka.move(30);
    zofka.turnLeft(90);
  }

  public void nakresliSlunicko(){
      for (int i = 0; i < 360; i++){
      for (int p = 0; p < 360; p = p + 30) {
        if (i == p) {
          nakresliPaprsek();
        }
      }
      zofka.move(1);
      zofka.turnRight(1);
    }

  }
  public void nakresliDomecek(){
    nakresliCtverec();
    posunZelvu();
    nakresliTrojuhelnik();
    zofka.turnRight(180);
    posunZelvu();
    zofka.turnLeft(180);
  }

}
