import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Kiteye
 * @date 28/6/2022
 * @Description 按照字节来写入文件
 */

public class Demo11 {
    public static void main(String[] args){
        try (OutputStream outputStream = new FileOutputStream("./text.txt")){
            outputStream.write(97);
            outputStream.write(98);
            outputStream.write(99);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
