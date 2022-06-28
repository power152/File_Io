import java.io.File;

/**
 * @author Kiteye
 * @date 28/6/2022
 * @Description
 */

public class Demo05 {
    public static void main(String[] args){
        File f1 = new File("./111/22/33/");
        f1.mkdirs();
        System.out.println(f1.isDirectory());
    }
}
