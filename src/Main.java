public class Main {
    public static void main(String[] args) {
        int priceTicket = 12345;    //Цена билета
        int rublePerMiles = 20;     //Кол-во рублей за 1 милю
        int miles = priceTicket / rublePerMiles;    //Рассчет миль

        System.out.println("Начислено миль: " + miles);


    }
}
