package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 3;

        if(num1 > num2){

            System.out.println("É maior");
        } else if(num2>num1){
            System.out.println("Não é maior");
        } else {
            System.out.println("São iguais");
        }

        switch (num1) {

            case 1:
                System.out.println("É um numero 1");
                break;
            case 2:
                System.out.println("é o numero 2");
                break;
            default:
                System.out.println("não conheço o numero");
                break;
        }

        while(num1 < 5 ) {
            System.out.println("É maior");
            num1++;
        }

        for (int i = 0; i <= 5; i++){
            System.out.println(i);
        }


        System.out.println("Hello world!");
    }
}