import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Kiteye
 * @date 28/6/2022
 * @Description
 */

public class Demo08 {

    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("./text.txt")){
            while(true){
                int b = inputStream.read();
                if (b == -1){
                    break;
                }
                System.out.println(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
