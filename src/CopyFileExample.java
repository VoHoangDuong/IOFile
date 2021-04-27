import java.io.File;
import java.io.*;

class CopyFileExample {

    public static void main(String[] args) throws IOException {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try {
            inStream = new FileInputStream("D:\\TextFile\\test.txt");
            outStream = new FileOutputStream("D:\\TextFile\\test3copy.txt");

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes(sao chép nội dung tệp theo byte).
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("Copy file thành công !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}

