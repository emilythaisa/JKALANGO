public abstract class Personagem {
    public abstract void mover ();
    public abstract void fazerSom();
    protected int energia;
    
    public void dormir () {
        energia+=10;
    System.out.println("energia aumentada em 10 +" + energia);

    }


}
