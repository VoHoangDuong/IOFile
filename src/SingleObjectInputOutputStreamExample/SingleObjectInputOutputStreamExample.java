package SingleObjectInputOutputStreamExample;

import java.io.*;

public class SingleObjectInputOutputStreamExample extends Student{
    public static void main(String[] args) {
        Student student = new Student("AB1204", 4, 3.14f, "VO HOANG DUONG");
        // ghi file :
        try {
            FileOutputStream fos = new FileOutputStream("D:\\TextFile\\STUDENT.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
