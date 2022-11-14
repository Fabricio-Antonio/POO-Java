import java.util.Random;
public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2) {
                    this.aprovada = true;
                    this.desafiado = l1;
                    this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void luta() {
        if (this.aprovada) {
            System.out.println("=== DESAFIADO ===");
            this.desafiado.apressentar();
            System.out.println("=== DESAFIANTE ===");
            this.desafiante.apressentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch (vencedor) {
                case 0: // Empate
                break;
                case 1: // Desafiado vence
                break;
                case 2: // Desafiante vence
                break;
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // Métodos Especiais
    
}
