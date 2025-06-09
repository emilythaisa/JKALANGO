public class Abelhinha extends Personagem {

    @Override
    public void mover() {
        System.out.println("voando nos 360 graus... na doida se perder a rota é Game over");
    }
    public void energia() {
        energia -=1;
        System.out.println("acabando as energias"+energia);
    }
        public void fazerSomab (){
            System.out.println("bzzzzzzzzzz");
        }
    
}
