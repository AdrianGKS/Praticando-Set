package exercicio;

public class ContaBancaria {

    private String numConta;
    private String nomeTitular;

    private double saldoConta;

    public ContaBancaria(String numConta, String nomeTitular, double depInicial) {
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        deposito(depInicial); // boa prática que acompanha atualizações de regras de negócio
    }

    public ContaBancaria(String numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    public String getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void deposito(double valor) {
        this.saldoConta += valor;
    }

    public void saque(double valor) {
        this.saldoConta -= (valor + 5.00);
    }

    @Override
    public String toString() {
        return "Conta " + getNumConta() +
                ", Titular: " + getNomeTitular() +
                ", Saldo R$ " + String.format("%.2f", getSaldoConta());
    }
}
