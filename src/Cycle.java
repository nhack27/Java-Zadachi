import java.util.Scanner;

public class Cycle {
     public static void ZD6(){
         Scanner in = new Scanner(System.in);
         System.out.print("Введите целое число: ");
         int n = in.nextInt();
         for (int i = 0; i < n; i++) {
             if(i % 2 == 0){
                 System.out.print(i + " ");
             }
         }
     }

    public static void ZD7(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void ZD8(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int n = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int m = in.nextInt();
        for (int i = n; i < m; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void ZD9(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int n = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int m = in.nextInt();
        for (int i = n; i < m; i++) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void ZD10(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int n = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int m = in.nextInt();
        for (int i = n; i < m; i++) {
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void ZD11(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void ZD12(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + Math.pow(i,2));
        }
    }

    public static void ZD13(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int n = in.nextInt();
        System.out.println(Summa(n));
    }

    public static int Summa(int a){
         if(a==0){
             return 0;
         }
         return a + Summa(a-1);
    }

    public static void ZD14(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int n = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int m = in.nextInt();
        int summa=n;
        while(n<m){
            summa += m;
            m--;
        }
        System.out.println(summa);
    }

    public static void ZD15(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int n = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int m = in.nextInt();
        int summa = 0;
        for (int i = n; i < m; i++) {
            if(i % 2 == 0){
                summa += i;
            }
        }
        System.out.println(summa);
    }
}
