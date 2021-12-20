import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArabRomanCalcMain {
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Введите данные в формате: Число действие число.");
            System.out.println("Программа принимает как арабские, так и римские цифры");
            System.out.println("Числа от 1 до 10, или от I до X включительно");
            List<String> list = new ArrayList<String>();
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            try {
                for (String retval : input.split("")) {
                    list.add(retval);
                }
                ArabianRomanCalc.calculations(list.get(0), list.get(1), list.get(2));
            } catch (Exception e) {
                System.out.println("Ты ввел не верные данные, внимательно прочитай условия");
            }
            System.out.println("Do you want to create a new worker? Enter YES to continue or EXIT to exit");
            if ("exit".equalsIgnoreCase(sc.nextLine())) {
                sc.close();
                System.exit(0);
            }
        }
    }
}