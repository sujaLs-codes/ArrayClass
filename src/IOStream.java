import  java.io.FileOutputStream;
public class IOStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("java:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("Success...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
