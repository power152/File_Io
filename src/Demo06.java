import java.io.File;

/**
 * @author Kiteye
 * @date 28/6/2022
 * @Description
 */

public class Demo06 {
    public static void main(String[] args) {
        File f1 = new File("./text.txt");
        File f2 = new File("./text2.txt");
        f1.renameTo(f2);
    }
}
