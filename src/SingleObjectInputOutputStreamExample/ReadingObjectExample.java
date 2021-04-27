package SingleObjectInputOutputStreamExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjectExample {
    public static void main(String[] args) {
        Object obj = null;
        // doc file ObjectInputStream:

        try {
            FileInputStream fis = new FileInputStream("STUDENT.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // doc doi tuong ra:
             obj = ois.readObject();

             ois.close();
             fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (obj == null){
            System.out.println("Khong co gi");
        }else {
            System.out.println(obj);
        }
        // Model.model.Student@36f6e879
        //Không phải  đang xuất ra đối tượng thay vì thuộc tính của nó.
        // ghi đè phương thức toStrong()
    }
}
