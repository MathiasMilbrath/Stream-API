import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SomaDosPares {
    private List<Integer> num;

    public SomaDosPares() {
        this.num = new ArrayList<>();
    }

    public void adicionarNumero(List<Integer> numero){
        num.addAll(numero);
        somaDosPares(num);
    }

    public void somaDosPares(List<Integer> num){
        System.out.println("A soma dos números pares é: "+ num.stream()
                .filter(n -> (n%2) == 0)
                .reduce(0, (n1, n2) -> n1 + n2));
    }
}
