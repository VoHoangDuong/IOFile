package SingleObjectInputOutputStreamExample;

import java.io.*;

public class ReadingObjectGroupExample {
    public static void main(String[] args) {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("STUDENT2.DAT");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // doc doi tuong ra
            //1. Su dung cac lop cha

            while (fis.available() > 0){
                obj = ois.readObject();
                System.out.println(obj);
            }
            // Su dung bien cua lop tao ra doi tuong

            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//        if (obj != null){
//            System.out.println(obj);
//        }else {
//            System.out.println("obj is null");
//        }
    }
}
