import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author Kiteye
 * @date 28/6/2022
 * @Description 按照字符来写入文件
 */

public class Demo12 {
    public static void main(String[] args){
        try(Writer writer = new FileWriter("./text.txt")) {
            writer.write('x');
            writer.write('x');
            writer.write('x');
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
