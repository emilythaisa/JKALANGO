public class Formiga extends Personagem {

    @Override
    public void mover() {
        energia -= 2; 
        System.out.println("Formiga se moveu. Energia atual: " + energia);
    }

    @Override
    public void fazerSom() {
        System.out.println("Fzzzz!"); 
    }
    @Override
    public void comer() {
        energia += 5;
        System.out.println("Comendo... energia: " + energia );
        
    }
}