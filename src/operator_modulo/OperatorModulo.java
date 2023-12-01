package operator_modulo;

import java.io.*;
public class OperatorModulo {

    public static void main(String[] args)
        throws IOException
    {
        int a, b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj liczbę a:");
        a = Integer.parseInt(br.readLine());
        System.out.println("Podaj liczbe b:");
        b = Integer.parseInt(br.readLine());

        System.out.print("Wynikiem reszty z dzielenia jest liczba: ");
        System.out.print(a%b);

    }
}
