
package revisao;


public abstract class  Pessoa {

    private String nome;
    private String RG;
    private String CPf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPf() {
        return CPf;
    }

    public void setCPf(String CPf) {
        this.CPf = CPf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
}
