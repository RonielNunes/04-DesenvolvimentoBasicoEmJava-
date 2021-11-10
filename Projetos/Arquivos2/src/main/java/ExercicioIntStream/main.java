package ExercicioIntStream;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.List;

public class main {
    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5).forEach(n->{
            System.out.println(n);
        });

        IntStream.range(0,3).forEach(n->{
            System.out.println("Número = " + n);
        });

        List<String> lista = new ArrayList<>();

        for (int i = 0 ; i < 10; i++)
        {
            lista.add(Integer.toString(i));
        }

        for (String i: lista) {
            System.out.println(i);
        }
    }
}
