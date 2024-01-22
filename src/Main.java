import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ZD30();
    }

    public static void ZD10(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int a = in.nextInt();
        System.out.print("Введите 2 число: ");
        int b = in.nextInt();
        System.out.print("Введите 3 число: ");
        int c = in.nextInt();
        System.out.print("Введите 4 число: ");
        int d = in.nextInt();

        if(a%2==0 || b%2==0 || c%2==0 || d%2==0){
            int max = a;
            if(b>max){
                max=b;
            } if (c>max) {
                max=c;
            } if (d>max) {
                max=d;
            }
            System.out.println("Максимальное число: " + max);
        }else{
            System.out.println("Not Found");
        }
    }

    public static void ZD28(String log, String pass){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = in.nextLine();
        System.out.print("Введите пароль: ");
        String password = in.nextLine();
        if(login.equals(log)){
            if (password.equals(pass)){
                System.out.println("Authentication completed");
            }else {
                System.out.println("Password is not correct");
            }
        }else {
            System.out.println("Login is not correct");
        }
    }

    public static void LoginPassword(){
        String log = "user";
        String pass = "qwerty";
        ZD28(log,pass);
    }

     public static void ZD29(){
         Scanner in = new Scanner(System.in);
         System.out.print("Введите сумму в KZT: ");
         double amount = in.nextDouble();
         System.out.println("Выберите валюту:");
         System.out.println("[1] USD");
         System.out.println("[2] EUR");
         System.out.println("[3] RUB");
         int currency = in.nextInt();
         switch (currency){
             case 1:
                 double usd = amount/420;
                 System.out.printf("%.2f USD" , usd);
                 break;
             case 2:
                 double eur = amount/510;
                 System.out.printf("%.2f EUR" , eur);
                 break;
             case 3:
                 double rub = amount/5.8;
                 System.out.printf("%.2f RUB" , rub);
                 break;
         }
    }

    public static void ZD30(){
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите свои интересы:");
        System.out.println("1 - Наука, 2 - Гуманитарные предметы, 3 - Искусство, 4 - Спорт");
        int branch = in.nextInt();
        switch (branch){
            case 1:
                System.out.println("1-Математика , 2-Физика");
                int choice1 = in.nextInt();
                if(choice1 == 1){
                    System.out.println("Вы финансист");
                }else {
                    System.out.println("Вы инженер");
                }
                break;
            case 2:
                System.out.println("1-История, 2-Иностранные языки");
                int choice2 = in.nextInt();
                if(choice2 == 1){
                    System.out.println("Вы историк или дипломат");
                }else {
                    System.out.println("Вы переводчик");
                }
                break;
            case 3:
                System.out.println("1-Рисование, 2-Пение");
                int choice3 = in.nextInt();
                if(choice3 == 1){
                    System.out.println("Вы художник или архитектор");
                }else {
                    System.out.println("Вы певец или тамада");
                }
                break;
            case 4:
                System.out.println("1-Командный, 2-Индивудуальный");
                int choice4 = in.nextInt();
                if(choice4 == 1){
                    System.out.println("Вы футболист или баскетболист");
                }else {
                    System.out.println("Вы боксер или теннисист");
                }
                break;
        }
    }

}