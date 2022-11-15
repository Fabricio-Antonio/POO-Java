public class Aluno extends Pessoa {
    private int matricula;
    private String cursor;
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno " + this.nome);
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }
    
    
}
