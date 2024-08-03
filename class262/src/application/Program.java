package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Servico.ServicoDeProduto;
import entities.Produtos;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "C:\\Users\\drkdi\\OneDrive\\Área de Trabalho\\PROJETOS\\in.txt";
        List<Produtos> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String file = br.readLine();
            while (file != null) {
                String[] aux = file.split(",");
                produtos.add(new Produtos(aux[0], Double.parseDouble(aux[1])));
                file = br.readLine();
            }
            ServicoDeProduto sp = new ServicoDeProduto();

            double avg = sp.avg(produtos, p -> true);

            System.out.print("Average price: ");
            System.out.printf("%.2f\n", avg);

            Stream<Produtos> st1 = produtos.stream();
            List<Produtos> st2 = st1.sorted(Comparator.comparing(Produtos::getName).reversed())
                                   .collect(Collectors.toList());

            st2.removeIf(p -> p.getPrice() > avg);

            st2.forEach(p -> System.out.println(p));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}