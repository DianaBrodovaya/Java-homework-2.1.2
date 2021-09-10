public class Main {

    public static void main(String[] args) {
        int beginningBalance = 100;
        int replenishmentAmount = 1001;
        int bonus = 0;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        }
        int finalBalance = beginningBalance + replenishmentAmount + bonus;

        System.out.println("Сумма бонуса: " + bonus + ", Итоговый счет: " + finalBalance);
    }
}
