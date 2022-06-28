import java.io.File;
import java.io.IOException;

/**
 * @author Kiteye
 * @date 28/6/2022
 * @Description
 */

public class Demo03 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("./text.txt");
        System.out.println(file1.exists());
        System.out.println(file1.createNewFile());
        System.out.println("创建文件之后");
        System.out.println(file1.exists());
        System.out.println("删除文件之前");
        System.out.println(file1.delete());
        System.out.println("删除文件之后");
        System.out.println(file1.exists());
    }
}
