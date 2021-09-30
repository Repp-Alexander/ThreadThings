import java.util.concurrent.TimeUnit;

public class CountPrinter extends Thread {

    @Override
    public void run()
    {
        for (int i = 0; i < 200; i++) {
            System.out.println(i+1);
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
