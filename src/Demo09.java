import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Kiteye
 * @date 28/6/2022
 * @Description
 */

public class Demo09 {
    public static void main(String[] args){
        // 尝试一次性读取 1024 个字节
        try(InputStream inputStream = new FileInputStream("./text.txt")) {
            byte[] buffer = new byte[1024];
            while (true){
                // 因为实际长度 < 1024 所以返回的是实际元素个数
                int len = inputStream.read(buffer);
                if (len == -1){
                    break;
                }

                // 这个操作是把 1024个数组全部遍历打印出来
//                for (byte b: buffer){
//                    System.out.println(b);
//                }

                // 如需只打印字符串，直接转换即可
                String str = new String(buffer,0,len,"UTF-8");
                System.out.println(str);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
