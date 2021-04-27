package SingleObjectInputOutputStreamExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SingleObjectInputOutputGroupExample extends Student {
    public static void main(String[] args) {
        Student student1 = new Student("AB2014", 3, 4.5f, "NGUYEN VAN A");
        Student student2 = new Student("AB2015", 4, 4.0f, "NGUYEN THI B");
        Student student3 = new Student("AB2016", 3, 6.1f, "NGUYEN VAN D");
        Student student4 = new Student("AB2017", 2, 8.6f, "NGUYEN VAN D");
        Student student5 = new Student("AB2018", 1, 3.5f, "NGUYEN VAN E");

        try {
            FileOutputStream fos = new FileOutputStream("D:\\TextFile\\STUDENT2.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.writeObject(student3);
            oos.writeObject(student4);
            oos.writeObject(student5);

            oos.close();
            fos.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
