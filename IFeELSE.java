//Calculando o percentual de imposto.

import java.util.Scanner;

// Classe calcula imposto de acorde com o valor do salario
public class IFeELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            float salario;
            double imposto;
            salario = sc.nextFloat();
            if (salario < 1000)
                imposto = salario * 0.05;
            else if (salario >= 1000 && salario < 2000)
                imposto = salario * .1;
            else if (salario >= 2000 && salario <= 4000)
                imposto = salario * 0.15;
            else
                imposto = salario *= 0.2;

            System.out.println(imposto);
        }
    }
}
