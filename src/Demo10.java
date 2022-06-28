import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Kiteye
 * @date 28/6/2022
 * @Description
 */

public class Demo10 {
    public static void main(String[] args){
        try(FileReader fileReader = new FileReader("./text.txt")) {
            while(true){
                // 这里也是通过 int 来接收 字符
                int c = fileReader.read();
                if (c == -1){
                    break;
                }
                // 需要转换成 char 类型才行，不然就是 ascii 码值。
                System.out.println((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
