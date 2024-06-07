import java.io.FileInputStream;

public class DataStreamExample {
    public static void main(String[] args) {
        try
        {
            FileInputStream in = new FileInputStream("D:\\testout.txt");
            int i = in.read();
            System.out.println((char)i);

            in.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
