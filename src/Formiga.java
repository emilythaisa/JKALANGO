public class Formiga  extends Personagem{

    @Override
    public void mover() {
       System.out.println("anda s   ó pra frente");
    }
    public void dimenergia (){
        dimenergia-=2;
        System.out.println("andou a energia diminuiu"+dimenergia);
    }
    public void fazerSom (){
        System.out.println("FZZZZZZZZZZZZZ");
    }
    


}
