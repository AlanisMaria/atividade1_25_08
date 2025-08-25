class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public double calcularPagamento(){
        return salarioBase;
    }
    public String getNome(){
        return nome;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }  
    @Override
    public double calcularPagamento() {
    return getSalarioBase() * 1.20;
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }
    @Override
    public double calcularPagamento() {
        return getSalarioBase() + this.comissao;
    }
}
