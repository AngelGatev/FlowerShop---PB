package JavaBasics.ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flowerM = Integer.parseInt(scanner.nextLine());
        int flowerZ = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());
        double sumSales = flowerM * 3.25 + flowerZ * 4 + roses * 3.5 + cactus * 8;
        double sumSalesWithoutTax = sumSales * 0.95;
        double diff = Math.abs(present - sumSalesWithoutTax);
        if (sumSalesWithoutTax >= present) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }
        //•Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева
        //От общата сума, Мария трябва да плати 5% данъци.
        //•	Ако парите СА стигнали: "She is left with {останали} leva."
        // – сумата трябва да е закръглена към по-малко цяло число (пр. 1.90 -> 1).
        //•	Ако парите НЕ достигат: "She will have to borrow {останали} leva."
        // – сумата трябва да е закръглена към по-голямо цяло число (пр. 1.10 -> 2).
    }
}
