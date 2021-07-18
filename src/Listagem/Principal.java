package Listagem;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Usuario user = new Usuario();
      Scanner sc = new Scanner(System.in);
        System.out.println("digite seu username");
        user.setUsername(sc.nextLine());
        System.out.println("digite sua senha ");
        user.setSenha(sc.nextLine());
        System.out.println(user);
    }
}
