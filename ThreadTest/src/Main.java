public class Main {
    public static void main(String[] args) {

        DatePrinter datePrinter = new DatePrinter();
        CountPrinter countPrinter = new CountPrinter();

        Thread thread1 = new Thread(datePrinter);
        Thread thread2 = new Thread(countPrinter);

        thread1.start();
        thread2.start();
    }
}
