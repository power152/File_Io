import java.io.File;
import java.io.IOException;

/**
 * @author Kiteye
 * @date 27/6/2022
 * @Description
 */

public class Demo01 {
    public static void main(String[] args) throws IOException {
        File file1 =new File("d:/text.txt"); // 绝对路径
        System.out.println(file1.getParent());
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getCanonicalPath());

        System.out.println("-------------------------------------");
        File file2 = new File("./text.txt");// 有File对象，但是并不代表真实存在该文件。
        System.out.println(file2.getParent());
        System.out.println(file2.getName());
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getCanonicalPath());

    }
}
