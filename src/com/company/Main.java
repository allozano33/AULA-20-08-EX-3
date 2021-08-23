package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyPad = new Scanner(System.in);
        double serviceValue, cameras = 1500d, patrulha = 700d;
        int servico, i;
        for (i = 1; i < 8; ++i) {
            System.out.println("Selecione o serviço desejado 1 ou 2 (Cliente "+i+"): ");
            servico = keyPad.nextInt();
            if (servico == 1) {
                serviceValue = cameras;
                System.out.println( "Contratado: Segurança com câmeras = Preço fixo de US $ 1.500 por mês");
            } else {
                serviceValue = cameras + patrulha;
                System.out.println(" Contratado: Câmera de segurança + Patrulha = Preço de U$ 1500 + U$ 700 para serviço de Patrulha");
            }
            System.out.println("O valor final  "+i+" é de:  U$ " + serviceValue);
        }
        System.out.println("Leitura finalizada");
    }
}
