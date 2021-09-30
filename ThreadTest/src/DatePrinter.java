import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DatePrinter extends Thread  {

    SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");

    @Override
    public void run()
    {
        for (int i = 0; i < 200; i++) {
            System.out.println(formatter.format(new Date(System.currentTimeMillis())));
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
