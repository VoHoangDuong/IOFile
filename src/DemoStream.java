import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DemoStream {
    public static void main(String[] args)  {

        try {
//            File file = new File("D:\\TextFile\\file-test-cp");
//            file.createNewFile();

            FileOutputStream out = new FileOutputStream("D:\\TextFile\\image2.png");
            FileInputStream in = new FileInputStream("D:\\TextFile\\img.png");

            byte [] data = new byte[1024];

            int check;
            while ((check = in.read(data)) != -1){
                out.write(data,0 ,check);
            }
//            int check;
//            while ((check = in.read()) != -1){
//                out.write(check);
//            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
