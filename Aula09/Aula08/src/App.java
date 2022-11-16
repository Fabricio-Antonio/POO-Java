public class App {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Repitil r = new Repitil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirsom();
    }
}
