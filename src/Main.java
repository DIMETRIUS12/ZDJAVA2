//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int amout = 200;
        int replenish = 1200;
        int balance = amout + replenish;


        int bonus;
        if (replenish < 1001) {
            bonus = 0;
        } else {
            bonus = replenish / 100;
        }


        System.out.println("Итоговая сумма = " + (balance + bonus));
        System.out.println("Количество бонусных рублей = " + bonus);
    }
}