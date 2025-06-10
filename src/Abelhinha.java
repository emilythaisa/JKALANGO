public class Abelhinha extends Personagem {
    public Abelhinha() {
    
    }

    @Override
    public void mover() {
        energia -= 1; 
        System.out.println("Abelhinha se moveu. Energia atual: " + energia);
    }

    @Override
    public void fazerSom() {
        System.out.println("Bzzzz!"); 
    }
    @Override
    public void comer() {
        energia += 6;
        System.out.println("Comemdo.... Energia: "+energia);
        
    }
}
