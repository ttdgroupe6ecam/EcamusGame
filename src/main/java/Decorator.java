public abstract class Decorator extends Personnage {

  protected Personnage personnage;

  public Decorator(Personnage personnage) {
    this.personnage = personnage;
  }

  public void draw() {}

  /**
   * Permet de setter les points de vie du personnage
   * @param pv Nouveau PV du personnage
   */
  public void setPV(int pv) {
    this.personnage.setPV(pv);
  }

  public Personnage getPersonnage() {
    return personnage;
  }

  /**
   * Permet de récupérer les points de vie du personnage
   * @return pv int des points de vie
   */
  public int getPV() {
    return personnage.getPV();
  }
}

class sourisDecorator extends Decorator {
  // Constuct
  public sourisDecorator(Personnage personnage) {
    super(personnage);
  }

  public void draw() {

    super.draw();
    System.out.println(" Equipé d'une Souris");
  }

}

class cleMoletteDecorator extends Decorator {
  public cleMoletteDecorator(Personnage personnage) {
    super(personnage);
  }

  public void draw() {
    super.draw();
    System.out.println(" Equipé d'une Clé à molette");
  }
}

/*

Arme Supplémentaire qui seront implémentées plus tard

class equerreDecorator extends Decorator {
  public equerreDecorator(Personnage personnage) {
    super(personnage);
  }

  public void draw() {
    super.draw();
    System.out.println(" Equipé d'une Equerre");
  }

  public void mourir() {
    System.out.println("Vous êtes mort");
  }

  public void parer() {
    System.out.println("Vous avez paré");
  }
}

class arduinoDecorator extends Decorator {
  public arduinoDecorator(Personnage personnage) {
    super(personnage);
  }

  public void draw() {
    super.draw();
    System.out.println("Equipé d'une Arduino");
  }

  public void mourir() {
    System.out.println("Vous êtes mort");
  }

  public void parer() {
    System.out.println("Vous avez paré");
  }
}

class marteauDecorator extends Decorator {
  public marteauDecorator(Personnage personnage) {
    super(personnage);
  }

  public void draw() {
    super.draw();
    System.out.println(" Equipé d'une Marteau");
  }

  public void mourir() {
    System.out.println("Vous êtes mort");
  }

  public void parer() {
    System.out.println("Vous avez paré");
  }
}
*/