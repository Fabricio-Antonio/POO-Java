public class Repitil extends Animal {
    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos");
        
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de Répitil");
        
    }

    @Override
    public void locomover() {
        System.out.println("Reastejando");
        
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
