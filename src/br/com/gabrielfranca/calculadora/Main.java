package br.com.gabrielfranca.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Pessoa usuario = new Pessoa();
        CalculadoraNutricional calculadora = new CalculadoraNutricional();
        System.out.println("--- Calculadora de Taxa Metabólica Basal e Gasto Energético Total---");

        System.out.print("Digite o seu peso em kg (ex: 75.2): ");
        usuario.peso = sc.nextDouble();

        System.out.print("Digite a sua altura em cm (ex: 162): ");
        usuario.altura = sc.nextInt();

        System.out.print("Digite a sua idade: ");
        usuario.idade = sc.nextInt();

        System.out.print("Digite o seu sexo (M/F): ");
        usuario.sexo = sc.next();

        System.out.print("Digite o seu nível de atividade (sedentario, leve, moderado, ativo): ");
        usuario.atividade = sc.next();

        double resultadoTMB = calculadora.calcularTMB(usuario);
        double resultadoGET = calculadora.calcularGET(usuario, resultadoTMB);

        if (resultadoGET > (double)0.0F) {
            System.out.printf("\nSucesso! O seu gasto metabólico basal é: %.2f kcal, e o Gasto Energético Total é de: %.2f kcal\n", resultadoTMB, resultadoGET);
        } else {
            System.out.println("\nErro: Não foi possível calcular. Verifique se o sexo ou atividade foram digitados corretamente.");
            sc.close();
        }

    }
}
