public class Kalango extends Personagem {
    public Kalango() {

    }

    @Override
    public void mover() {
        energia -= 3; 
        System.out.println("Kalango se moveu. Energia atual: " + energia);
    }

    @Override
    public void fazerSom() {
        System.out.println("Tssss!"); 
    }
    @Override
    public void comer() {
        energia += 4;
        System.out.println("Comendo... energia: " + energia );

    }
}