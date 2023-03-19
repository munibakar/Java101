import java.util.Scanner;

public class Main {

    static boolean isAsal(int say, int count) {
        if (count > say/2) {
            return true;
        }

        if (say % count == 0) {

            return false;
        }
        count++;

        return isAsal(say, count);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin:");
        int say = input.nextInt();

        if (isAsal(say,2)){
            System.out.println(say+" Asal SAYIDIR!");

        }
        else {
            System.out.println(say+" Asal sayı DEĞİLDİR!");
        }
    }
}
