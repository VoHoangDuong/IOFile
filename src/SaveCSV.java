import java.io.*;
import java.util.ArrayList;

public class SaveCSV {
    public static void main(String[] args) {

    }


    public static class Student implements Serializable{
        private String name;
        private int age;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Student(String name, int age, String address ){
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

    public static void writeCSv(String path, ArrayList<Student>students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            for (int i = 0; i < students.size(); i++) {
                byte[] arr = students.get(i).toString().getBytes();
                fos.write(arr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> readCSV(String path){
        FileReader file = null;
        BufferedReader bufferedReader = null;
        ArrayList<Student> arrayList = new ArrayList<>();
        try{
            bufferedReader = new BufferedReader(file);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] str = line.split(",");
                Student st = new Student(str[0],Integer.parseInt(str[1]),str[2]);
                arrayList.add(st);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (file == null){
                try{
                    file.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }


}
