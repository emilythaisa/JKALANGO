public class App {
    public static void main(String[] args) {

        //instancie um objeto de cada tipo de animal
        Formiga f = new Formiga();
        f.energia = 10;
        for (int i = 0; i < 3; i++) {
            f.mover();
        }

       
        System.out.print(f.nome);
        f.fazerSom();
        f.dormir();
        f.comer();
        f.atacar();
        System.out.println("energia final:... "+ f.energia);



        Kalango k = new Kalango();
        k.energia = 10;
        for (int i = 0; i < 3; i++) {
            k.mover();
        }
        System.out.print("Kalango: ");
        k.fazerSom();
        k.dormir();
        k.comer();
        k.atacar();
        System.out.println("energia final:... "+ k.energia);


        Abelhinha a = new Abelhinha();
        a.energia = 10;
        for (int i = 0; i < 3; i++) {
            a.mover();
        }        
        System.out.print("Abelhinha: ");
        a.fazerSom();
        a.dormir();
        a.comer();
        a.atacar();

        System.out.println("energia final:... "+ a.energia);
       
    }
}