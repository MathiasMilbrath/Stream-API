import java.util.ArrayList;
import java.util.List;

public class OrdemNumericas {
    private List<Integer> num;

    public OrdemNumericas() {
        this.num = new ArrayList<>();
    }

    public void adicionarNumero(List<Integer> numero){
        num.addAll(numero);
        ordemNumerica(num);
    }

    public void ordemNumerica(List<Integer> numero){
        numero.stream().sorted().forEach(System.out::println);
    }
}
