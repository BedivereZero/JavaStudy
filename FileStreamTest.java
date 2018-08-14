import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) {
        try {
            byte[] bWrite = {65, 66, 67, 68, 69};
            OutputStream os = new FileOutputStream("test.txt");
            for (int each: bWrite) {
                os.write(each);
            }
            os.close();
            InputStream is = new FileInputStream("EmployeeTest.java");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read());
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
