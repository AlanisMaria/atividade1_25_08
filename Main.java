import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Alice", 3000.0));
        funcionarios.add(new Gerente("Bob", 5000.0));
        funcionarios.add(new Vendedor("Carlos", 2500.0, 500.0));

        for (Funcionario f : funcionarios) {
            System.out.printf("Nome: %s, Pagamento: R$ %.2f\n", f.getNome(), f.calcularPagamento());
        }
    }
}