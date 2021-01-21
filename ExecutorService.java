import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Using Executors
 * @author ashish
 */
public class ExecutorService {
    public static void main(String[] args) {
        ExecutorService pool= Executors.newSingleThreadExecutor();
        pool.submit(()->{
            System.out.println("Hello    "+Thread.currentThread().getName());
        });
    }
}
