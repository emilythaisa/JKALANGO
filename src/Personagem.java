    public abstract class Personagem {
    public abstract void mover ();
    public abstract void fazerSom();
    public abstract void comer();
    protected int energia;
    protected String nome;
    
public Personagem (){

}

    void dormir() {
        energia += 10;
        System.out.println("Dormindo...Energia:... "+energia);
        }
   
}