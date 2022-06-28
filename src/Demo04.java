import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


/**
 * @author Kiteye
 * @date 28/6/2022
 * @Description
 */

public class Demo04 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file1 = new File("./111.txt");
        file1.createNewFile();
        file1.deleteOnExit();

        TimeUnit.MILLISECONDS.sleep(3000);//等待3000毫秒
    }
}
