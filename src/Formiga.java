public class Formiga extends Personagem implements IArmamento{

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
    @Override
    public void atacar() {
        System.out.println("Ataca com 4 formas!");
        
    }
}