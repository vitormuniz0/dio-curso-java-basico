import java.util.ArrayList;
import java.util.List;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos mais usados
        final int IDADE = 21; // final é usado para criar uma constante ou seja , não pode mudar de valor;
        double salario = 3500.75; 
        boolean ativo = true;
        char inicial = 'J';

        // Tipo String (não primitivo)
        String nome = "José Vitor";

        // Lista (não primitivo)
        List<String> tecnologias = new ArrayList<>();
        tecnologias.add("Java");
        tecnologias.add("Spring Boot");
        tecnologias.add("AWS");

        // Enum (valores fixos)
        Nivel nivel = Nivel.AVANCADO;

        // Exibir os valores
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + IDADE);
        System.out.println("Salário: R$" + salario);
        System.out.println("Ativo no sistema? " + ativo);
        System.out.println("Inicial do nome: " + inicial);
        System.out.println("Tecnologias: " + tecnologias);
        System.out.println("Nível: " + nivel);
    }
}

enum Nivel {
    INICIANTE, INTERMEDIARIO, AVANCADO;
}
