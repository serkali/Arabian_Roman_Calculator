import operation.*;

public class ArabianRomanCalc {
    public static void calculations(String oneString,String operation,String twoString) {
        int numberOne = 0;
        int numberTwo = 0;
        int result = 0;

        boolean flag = false;
        try {
            numberOne = Integer.parseInt(oneString);
            numberTwo = Integer.parseInt(twoString);
        } catch (Exception e) {
            try {
                numberOne = Converter.toArabic(oneString);
                numberTwo = Converter.toArabic(twoString);
                flag = true;
            } catch (Exception e1) {
                System.out.println("Вы ввели не верные данные");
            }
        }
        if (numberOne < 1 || numberOne > 10 || numberTwo < 1 || numberTwo > 10) {
            System.out.println("Вы ввели не верные данные");
            System.exit(0);
        }
        Operation action;
        if (operation.equals("-")) {
            action = new Subtraction();
            result = action.operation(numberOne, numberTwo);
        }
        if (operation.equals("*")) {
            action = new Multiple();
            result = action.operation(numberOne, numberTwo);
        }
        if (operation.equals("/")) {
            action = new Division();
            result = action.operation(numberOne, numberTwo);
        }
        if (operation.equals("+")) {
            action = new Addition();
            result = action.operation(numberOne, numberTwo);
        }
        if (flag) {
            String roman = Converter.toRoman(result);
            System.out.println(roman);

        } else System.out.println(result);
    }
}
