import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        OrdemNumericas ordem = new OrdemNumericas();
        ordem.adicionarNumero(numeros);

        SomaDosPares soma = new SomaDosPares();
        soma.adicionarNumero(numeros);
    }
}