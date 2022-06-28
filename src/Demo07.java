import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Kiteye
 * @date 28/6/2022
 * @Description
 */

public class Demo07 {
    public static void main(String[] args) {
        /**
         * InputStream 输入流，是一个抽象类；
         * FileInputStream 是一个典型的实现
          */
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("./text.txt");
            // 需要读文件，就需要字节一个一个的读出来
            while (true){
                // 为什么是 int接收 ，看一下 read（）的注释
                int b = inputStream.read();
                if (b == -1){
                    break;
                }
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
