
import java.io.IOException;


public class Sample {
    public static void main(String[] args) throws InterruptedException, IOException {
        Runtime runtime = Runtime.getRuntime();
        Thread.sleep(5000);
        Process process = runtime.exec("mspaint");
    }
}

